import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class firstTest {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void titleTest() {
        // Check the page title:
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test successful!");
        } else {
            System.out.println("Test failed");
        }

        // Search for "Selenium":
        WebElement searchInput = driver.findElement(By.id("APjFqb"));
        searchInput.sendKeys("Selenium", Keys.RETURN);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
