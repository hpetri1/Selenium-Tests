import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement emailField = driver.findElement(By.id("inputEmail"));
        WebElement passwordField = driver.findElement(By.id("inputPassword"));
        WebElement loginButton = driver.findElement(By.className("btn"));

        Assert.assertTrue(emailField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());

        emailField.sendKeys("test@example.com");
        passwordField.sendKeys("password");

        driver.quit();
    }
}
