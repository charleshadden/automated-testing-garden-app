import constants.PageConstants;
import constants.TestConstants;
import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest {

    @Test
    public void homepageTest() {

        WebDriver wd = BasePage.navigateToBaseURL();
        WebElement element = BasePage.getElementByID(wd, "mainHeaderID");
        BasePage.verifyText(element, PageConstants.HOMEPAGE_HEADER);
        wd.quit();
    }


}
