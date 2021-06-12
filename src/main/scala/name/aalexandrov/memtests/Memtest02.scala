package name.aalexandrov
package memtests

import scala.util.Random

class Memtest02(seed: Long) {

  def points(n: Int): TraversableOnce[Point2D] = {
    val r = new Random(seed)
    for (i <- 1 to n) yield {
      val x = r.nextDouble()
      val y = r.nextDouble()
      Point2D(x, y)
    }
  }
}

object Memtest02 {

  def apply(seed: Long): Memtest01 = new Memtest01(seed)

  def main(args: Array[String]): Unit = time {
    Thread.sleep(10000L)
    println("Starting")

    val total = 50000000

    val r = new Random(SEED)
    var inCircle = 0

    var i = 1
    while (i <= total) {
      val x = r.nextDouble()
      val y = r.nextDouble()
      val p = Point2D(x, y)
      if (p.x * p.x + p.y * p.y <= 1.0) {
        inCircle += 1
      }
      i += 1
    }

    // 2 / pi = X

    println(2 / (inCircle / total.toDouble))
  }
}
