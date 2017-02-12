package name.aalexandrov.pfds

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hello"
}
