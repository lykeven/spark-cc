logLevel := Level.Warn

//addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

resolvers += "  Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.3")

