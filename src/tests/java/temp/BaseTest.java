package temp;

import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void beforeSuiteBase() {
        System.out.println("beforeSuite_base");
    }

}
