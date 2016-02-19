package temp;

import org.testng.annotations.Test;

public class Test_2 extends BaseTest {

//    @BeforeSuite
//    public void beforeSuiteBase() {
//        System.out.println("beforeSuite_Base_override");
//    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println("Start test_2");
        Thread.sleep(2000);
        System.out.println("Finish test_2");
    }
}
