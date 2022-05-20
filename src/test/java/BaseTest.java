import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
        //Constda çağırmaya başladığımız için sildik
        //driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Browser opened");

    }

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }


    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
        System.out.println("Test finished");
    }

}
