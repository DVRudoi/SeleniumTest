import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void testFirstSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/NEW/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); //создаем объект типа ChromeDriver, сохраняем в переменную типа WebDriver с именем driver

        driver.get("https://google.com"); // ссылка


        WebElement searchBox = driver.findElement(By.name("q"));//метод ( наз searchBox) который ищет q - html
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");//печатаем внутри (q) Selenium

        Thread.sleep(1000);// пауза 1сек

        searchButton.click();// нажимаем кнопку по адресу btnK - html

        searchBox = driver.findElement(By.name("q")); // опять ищем элемент q на странице
        Assert.assertEquals(searchBox.getAttribute("value"),"Selenium"); // проверяем => "Selenium"

        driver.quit();
    }
}
