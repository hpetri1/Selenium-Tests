import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test6 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Lena/chromedriver.exe");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        WebDriver driver = new ChromeDriver();
        driver.get("https://medo.ai/career/test-challenge/index.html");

        WebElement divSix = driver.findElement(By.id("test-6-div"));
        WebElement grid = divSix.findElement(By.tagName("tbody"));

        List<String> allValues = new ArrayList<>();

        List< WebElement > table = grid.findElements(By.tagName("tr"));
        int rows_count = table.size();
        for (int row = 0; row < rows_count; row++) {
            List < WebElement > Columns_row = table.get(row).findElements(By.tagName("td"));
            int columns_count = Columns_row.size();
            for (int column = 0; column < columns_count; column++) {
                String celtext = Columns_row.get(column).getText();
                allValues.add(celtext);
            }
        }

        Assert.assertEquals("45", allValues.get(8));

        driver.quit();
    }

}
