resolvers ++= Seq(
  Resolver.url("hmrc-sbt-plugin-releases", url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
  )

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.5.0")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "3.0.2")

addSbtPlugin("uk.gov.hmrc" % "sbt-artifactory" % "0.17.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-git-versioning" % "1.20.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-settings" % "4.0.0-SNAPSHOT")
