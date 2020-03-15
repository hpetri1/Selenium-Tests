import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement divThree = driver.findElement(By.id("test-3-div"));
        WebElement defaultDisplay = divThree.findElement(By.id("dropdownMenuButton"));
        Assert.assertEquals("Option 1", defaultDisplay.getText());

        defaultDisplay.click();

        WebElement dropdown = divThree.findElement(By.className("dropdown-menu"));
        List<WebElement> options = dropdown.findElements(By.tagName("a"));

        options.get(2).click();

        driver.quit();
    }
}
