package name.aalexandrov
package memtests

import scala.util.Random

class Memtest01(seed: Long) {

  def points(n: Int): TraversableOnce[Point2D] = {
    val r = new Random(seed)
    for (i <- 1 to n) yield {
      val x = r.nextDouble()
      val y = r.nextDouble()
      Point2D(x, y)
    }
  }
}

object Memtest01 {

  def apply(seed: Long): Memtest01 = new Memtest01(seed)

  def main(args: Array[String]): Unit = time {
    Thread.sleep(10000L)
    println("Starting")

    val total = 50000000

    val inCircle = (for {
      p <- Memtest01(SEED).points(total)
      if p.x * p.x + p.y * p.y <= 1.0
    } yield p).size

    // 2 / pi = X

    println(2 / (inCircle / total.toDouble))
  }
}
