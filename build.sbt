organization := "ben"

name := "scalatra-sbt-prototype"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

classpathTypes ~= (_ + "orbit")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5",
  "org.scalatra" %% "scalatra" % "2.4.1",
  "org.scalatra" %% "scalatra-scalate" % "2.4.1",
  "org.scalatra" %% "scalatra-specs2" % "2.4.1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "compile",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)
