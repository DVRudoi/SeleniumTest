import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New {
    @Test
    public void namePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/NEW/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toyota.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String searchButton =
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/" +
                        "section[1]/div/div/div[1]/div[1]/h2")).getText();

        Assert.assertEquals(searchButton, "Explore All Vehicles");
        Thread.sleep(1000);

        driver.close();

    }


    @Test
    public void testFirstSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/NEW/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.toyota.com/");

        WebElement searchButton =
                driver.findElement(By.xpath("//*[@id=\"tcom-header\"]/div[2]/nav/ul/li[4]/button"));
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(1000);

        WebElement searchBox = driver.findElement(By.name("keyword"));
        searchBox.sendKeys("2022 Corolla");

        WebElement goButton =
                driver.findElement(By.xpath("//*[@id=\"tcom-header\"]/" +
                        "div[3]/div/div[2]/div/div[2]/div/form/button"));
        Thread.sleep(1000);
        goButton.click();

        Thread.sleep(1000);

        WebElement toyotaButton =
                driver.findElement(By.xpath("//*[@id=\"tcom-header\"]/div[2]/nav/ul/li[1]/a[1]"));
        Thread.sleep(1000);
        toyotaButton.click();
        String main =
                driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/" +
                        "section[1]/div/div/div[1]/div[1]/h2")).getText();

        Assert.assertEquals(main, "Explore All Vehicles");
        Thread.sleep(1000);

        driver.close();


    }
}
