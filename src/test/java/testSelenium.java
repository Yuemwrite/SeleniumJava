import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;
public class testSelenium {
    public static WebDriver driver;
    private static String baseUrl;
    private static String baseUrl2;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.finartz.com/";


        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testDeneme() throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.linkText("Solutions")).click();
        driver.findElement(By.linkText("Blog")).click();
        /*driver.findElement(By.className("svgIcon-use")).click();
        WebElement search = driver.findElement(By.className("js-predictiveSearchInput textInput textInput--rounded textInput--darkText u-baseColor--textNormal textInput--transparent"));
        search.sendKeys("Blockchain Services");
        driver.findElement(By.linkText("Search for ‘Blockchain Services’ on Medium")).click();
        driver.quit();

        Medium sitesi açıldıktan sonra herhangi bir işlem yapmıyor. Bu kısımları boş bırakmamak için yine de kodları eklemek istedim.
        driver.quit() ile tarayıcı hızlı biçimde kapanmaktadır.

        */
    }




}



