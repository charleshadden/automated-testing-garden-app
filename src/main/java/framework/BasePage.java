package framework;

import constants.TestConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BasePage {

    public static WebDriver navigateToBaseURL() {
        System.setProperty(TestConstants.CHROME_DRIVER, TestConstants.CHROME_DRIVER_PATH);
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        String url = TestConstants.BASE_URL;
        wd.get(url);
        return wd;
    }

    public static void verifyText(WebElement element, String text) {
        String fetchedText = element.getText();
        Assert.assertEquals(fetchedText,text);
    }

    public static WebElement getElementByID(WebDriver wd, String text) {
        return wd.findElement(By.id(text));

    }
}
