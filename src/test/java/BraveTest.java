import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.Assert;

public class BraveTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");

        // TODO 1: Initialize the WebDriver
	 driver = new ChromeDriver(options);
    }

    @Test
    public void verifyWebForm() {

        // TODO 2: Open https://www.selenium.dev/selenium/web/web-form
	driver.get("https://www.selenium.dev/selenium/web/web-form");

        // TODO 3: Get the page title into a String variable
	String actualName = driver.getTitle();
	String expectedName = "Web form";
	// TODO 4: Verify that the title equals "Web form"
	Assert.assertEquals(actualName,expectedName);

	// Things to do
	WebElement textBox = driver.findElement(By.id("my-text-id"));
	textBox.click();
	textBox.sendKeys("Selenium WebDriver");
	textBox.submit();

	//line to retrieve the new page title into a String variable.
	WebElement confirmationHeading = driver.findElement(By.tagName("h1"));
	String confirmTest = confirmationHeading.getText();
	String correctConfirm = "Form submitted";
	Assert.assertEquals(confirmTest,correctConfirm);

	

    }

    @AfterMethod
    public void teardown() {
	
        // TODO 5: Close the browser safely
	driver.quit();
	// practicing Git diff
	// Login test development
    }
}
