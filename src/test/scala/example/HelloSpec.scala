package example

import org.scalatest._

class HelloSpec extends FreeSpec {
  "Hello.something" - {
    "Should exist!" - {
      assert(Hello.something == "blah")
    }
  }
}
