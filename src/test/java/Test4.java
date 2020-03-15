import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement divFour = driver.findElement(By.id("test-4-div"));
        List<WebElement> buttons = divFour.findElements(By.tagName("button"));

        Assert.assertNull(buttons.get(0).getAttribute("disabled"));
        Assert.assertNotNull(buttons.get(1).getAttribute("disabled"));

        System.out.println(buttons.get(0).getAttribute("disabled"));
        System.out.println(buttons.get(1).getAttribute("disabled"));

        driver.quit();
    }
}
