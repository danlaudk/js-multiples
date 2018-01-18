// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "js-multiples"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

scalaJSUseMainModuleInitializer := true

//testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.9.1",
    "com.lihaoyi" %%% "utest" % "0.4.5" % "test",
    "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % Test

)
