import org.scalatest._
import flatspec._
import matchers._

class CRLFSpec extends AnyFlatSpec with should.Matchers {

  "sbt" should "handle CRLF correctly" in {
    "Hello\r\nWorld" shouldBe "Hello\r\nWorlddddddd"
  }
}