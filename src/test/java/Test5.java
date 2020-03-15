import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement divFive = driver.findElement(By.id("test-5-div"));

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));

        WebElement button = divFive.findElement(By.id("test5-button"));
        button.click();

        WebElement message = divFive.findElement(By.id("test5-alert"));
        Assert.assertTrue(message.isDisplayed());
        Assert.assertNotNull(button.getAttribute("disabled"));

        driver.quit();
    }
}
