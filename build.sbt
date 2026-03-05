ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "com.madhura"
ThisBuild / version := "0.1.0"

// Keep dependencies minimal in Phase 0.
// We'll add Spark + AWS deps in Phase 2/3.
lazy val testDeps = Seq(
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)

lazy val common = (project in file("modules/common"))
  .settings(
    name := "common",
    libraryDependencies ++= testDeps
  )

lazy val ingestApp = (project in file("modules/ingest-app"))
  .dependsOn(common)
  .settings(
    name := "ingest-app",
    libraryDependencies ++= testDeps,
    // This tells sbt which main class to run if you do `sbt ingestApp/run`
    Compile / mainClass := Some("com.madhura.pipeline.ingest.Main")
  )

lazy val root = (project in file("."))
  .aggregate(common, ingestApp)
  .settings(
    name := "aws-spark-scala-pipeline",
    publish / skip := true
  )