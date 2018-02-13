name := "spark-streaming"

version := "0.1"


scalaVersion := "2.11.6"

libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.2.1"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.2.1"

// https://mvnrepository.com/artifact/com.github.pyknic/map-stream
libraryDependencies += "com.github.pyknic" % "map-stream" % "2.3.1"

//https://mvnrepository.com/artifact/org.elasticsearch/elasticsearch-hadoop
libraryDependencies += "org.elasticsearch" % "elasticsearch-hadoop" % "6.1.2"

//libraryDependencies += "org.apache.kafka" % "connect-json" % "1.0.0"
