package com.madhura.pipeline.ingest

import com.madhura.pipeline.common.Config

object Main {
  def main(args: Array[String]): Unit = {
    val cfg = Config.fromEnv()
    println(s"[ingest-app] starting in env=${cfg.env}")
    println("[ingest-app] Phase 0 OK: app runs")
  }
}