ThisBuild / scalaVersion := "3.0.0"

ThisBuild / libraryDependencies += "org.jooq" % "joor" % "0.9.13" % Provided

ThisBuild / libraryDependencies += {
  CrossVersion.partialVersion(sys.props("java.version")) match {

    case Some((9, _)) | Some((15, _)) =>
      "org.jooq" % "joor" % "0.9.13" % Test

    case Some((1, 8)) =>
      "org.jooq" % "joor-java-8" % "0.9.13" % Test

  }
}

ThisBuild / libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.10" % Test
