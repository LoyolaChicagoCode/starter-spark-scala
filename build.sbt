name := "spark-pi"

version := "1.0"

scalaVersion := "2.10.4"

mainClass in assembly := Some("org.apache.spark.examples.JavaSparkPi")

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "latest.release" % "test",
  "org.apache.spark" %% "spark-core" % "1.4.1" % "provided"
)