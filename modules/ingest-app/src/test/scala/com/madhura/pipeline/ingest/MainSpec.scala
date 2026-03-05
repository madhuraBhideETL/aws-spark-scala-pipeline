package com.madhura.pipeline.ingest

import org.scalatest.funsuite.AnyFunSuite

class MainSpec extends AnyFunSuite {

  test("Main runs without throwing") {
    Main.main(Array.empty)
    succeed
  }

}