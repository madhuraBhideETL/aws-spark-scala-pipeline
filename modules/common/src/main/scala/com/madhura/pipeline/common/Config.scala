package com.madhura.pipeline.common

final case class Config(env: String)

object Config {
  def fromEnv(): Config = {
    val env = sys.env.getOrElse("APP_ENV", "dev")
    Config(env)
  }
}