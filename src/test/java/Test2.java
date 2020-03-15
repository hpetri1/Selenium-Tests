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

public class Test2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement divTwo = driver.findElement(By.id("test-2-div"));
        List<WebElement> listItems = divTwo.findElements(By.tagName("li"));
        Assert.assertEquals(3, listItems.size());
        Assert.assertTrue(listItems.get(1).getText().contains("List Item 2"));
        WebElement badge = listItems.get(1).findElement(By.className("badge"));
        Assert.assertEquals("6", badge.getText());

        driver.quit();
    }
}
