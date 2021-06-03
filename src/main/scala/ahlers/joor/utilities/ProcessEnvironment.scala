package ahlers.joor.utilities

/**
 * @since June 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object ProcessEnvironment:

  def env: java.util.Map[String, String] =

    val theUnmodifiableEnvironment: java.util.Map[String, String] =
      org.joor.Reflect
        .onClass("java.lang.ProcessEnvironment")
        .get("theUnmodifiableEnvironment")

    val m: java.util.Map[String, String] =
      org.joor.Reflect
        .on(theUnmodifiableEnvironment)
        .get("m")

    m
