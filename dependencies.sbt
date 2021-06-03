ThisBuild / scalaVersion := "3.0.0"

ThisBuild / libraryDependencies += "org.jooq" % "joor" % "0.9.13" % Provided

ThisBuild / libraryDependencies += {
  CrossVersion.partialVersion(sys.props("java.version")) match {

    case Some((major, _)) if 9 <= major =>
      "org.jooq" % "joor" % "0.9.13" % Test

    case Some((8, _)) =>
      "org.jooq" % "joor-java-8" % "0.9.13" % Test

  }
}

ThisBuild / libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.10" % Test
