package ahlers.joor.utilities

import utest._

/**
 * @since June 03, 2021
 * @author <a href="mailto:michael@ahlers.consulting">Michael Ahlers</a>
 */
object ProcessEnvironmentTests extends TestSuite:

  override val tests =
    Tests {
      test("Modify process environment") {
        ProcessEnvironment.env.put("FOO","BEAR")
        sys.env("FOO")
      }
    }
