package name

package object aalexandrov {

  // -------------------------------------------------------
  // Benchmarking functions
  // -------------------------------------------------------

  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block
    // call-by-name
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) + "ms")
    result
  }


  // -------------------------------------------------------
  // Data model
  // -------------------------------------------------------

  val SEED = -65491064352432L

  case class Point2D(x: Double, y: Double)

  case class Point3D(x: Double, y: Double, z: Double)

}
