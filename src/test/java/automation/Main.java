package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main extends TestFile {
    public static WebDriver driver = new ChromeDriver();

    public static String URL = "https://saleswizz.com/";

    @BeforeTest
    public void beforeTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        //Scroll(driver);
        //homePage(driver);
        login(driver);
        addCatalogueGroupDetails(driver);
        addCatalogueDetails(driver);
        //productDetails(driver);
    }

    @AfterTest
    public void afterTest() {
//        driver.quit();
    }
}