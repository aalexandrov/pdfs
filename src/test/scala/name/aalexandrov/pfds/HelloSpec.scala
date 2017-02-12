package name.aalexandrov.pfds

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say `Hello`" in {
    Hello.greeting shouldEqual "Hello"
  }
}
