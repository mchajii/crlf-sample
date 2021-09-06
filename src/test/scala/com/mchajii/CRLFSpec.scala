package com.mchajii

import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

class CRLFSpec extends AnyFlatSpec with should.Matchers {

  "sbt" should "handle CRLF correctly" in {
    "Hello\r\nWorld" shouldBe "Hello\r\nWorlddddddd"
  }
}