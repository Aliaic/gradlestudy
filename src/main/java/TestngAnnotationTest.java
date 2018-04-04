import org.testng.annotations.*;

/**
 * Created by yuchao.liang on 2018/4/4.
 */

public class TestngAnnotationTest {
    @Test(groups={"grouptest1"})
    public void testcase1()
    {
        System.out.println("in test case 1");
    }
    @Test(groups={"grouptest1"})
    public void testcase2()
    {
        System.out.println("in test case 2");
    }
    @Test(groups={"grouptest2"},alwaysRun = true)
    public void testcase3()
    {
        System.out.println("in test case 3");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("in before method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("in after method");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("in before class");
    }
    @AfterClass

    public void afterClass()
    {
        System.out.println("in after class");
    }
    @BeforeGroups("grouptest1")
    public void beforeGroup()
    {
        System.out.println("in before Group");
    }
    @AfterGroups("grouptest1")
    public void afterGroup()
    {
        System.out.println("in after Group");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("in before test");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("in after test");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("in before suite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("in after suite");
    }

}
