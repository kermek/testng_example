package temp;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Test_1 extends BaseTest {
//
//    @BeforeSuite
//    public void beforeSuite1() {
//        System.out.println("beforeSuite_1");
//    }

    @Test
    public void test1(ITestContext context) throws InterruptedException {

//        System.out.println(context.getSuite().getParallel());
//
//        System.out.println(context.getCurrentXmlTest().getParallel());
//        System.out.println(context.getCurrentXmlTest().getThreadCount());
//
//        System.out.println(context.getSuite().getXmlSuite().getParallel());
//        System.out.println(context.getSuite().getXmlSuite().getThreadCount());



        System.out.println("Start test_1");
        Thread.sleep(2000);
        System.out.println("Finish test_1");
    }

}
