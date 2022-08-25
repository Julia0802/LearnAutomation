import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class SearchTest {
    @Test
    public void openGoogleComInChromeTest(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
       System.out.println(driver.getTitle() +" page has been opened");
        WebElement googleAppsButton = driver.findElement(By.cssSelector("div#gbwa a"));//css locator
        googleAppsButton.click();
       driver.quit();
    }


}
