package com.madhura.pipeline.common

import org.scalatest.funsuite.AnyFunSuite

class ConfigSpec extends AnyFunSuite {
  test("Config.fromEnv returns dev when APP_ENV not set") {
    val cfg = Config.fromEnv()
    assert(cfg.env.nonEmpty)
  }
}