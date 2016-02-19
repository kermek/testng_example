package temp;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_3 extends BaseTest {

    @BeforeSuite
    public void beforeSuite3() {
        System.out.println("beforeSuite_3");
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println("Start test_3");
        Thread.sleep(2000);
        System.out.println("Finish test_3");
    }
}
