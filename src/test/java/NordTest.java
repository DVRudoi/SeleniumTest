import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    @Test
public class NordTest {
    @Test
    public void testFirstSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/NEW/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nord.com/ua/home-ua.jsp");

        WebElement searchButton =
                driver.findElement(By.xpath("//*[@id=\"pl-navbar__main\"]/ul[1]/li[5]"));
        Thread.sleep(1000);
        searchButton.click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("g1050");
        WebElement goButton =
                driver.findElement(By.xpath("//*[@id=\"pl-navbar__main\"]/ul[1]/li[5]/ul/form/button"));
        Thread.sleep(1000);
        goButton.click();


        String main =
                driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/h1")).getText();
        Assert.assertEquals(main, "Search results");
        driver.close();

    }
}
