import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite and classes which included in suite must be in same directory.
 * Just like we runWith -Parameterized.class,we can runWith suite.class whic will provide
 * suiteClassess annotation.
 * Create array to add multiple classes inside suiteClassess annotation.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({StringHelper.class,ArrayCompareTest.class,StringHelperParameterizedTest.class})
public class AllTestSuite {
}
