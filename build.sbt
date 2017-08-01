name := "big_data_pipelines"

scalaVersion := "2.11.8"

val sparkVersion = "2.1.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  ("org.apache.spark" %% "spark-streaming-kafka" % sparkVersion) exclude ("org.spark-project.spark", "unused"),
  "org.apache.kafka" % "kafka-clients" % "0.10.0.1"
)


assemblyJarName in assembly := name.value + "allinone.jar"
