// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TaskListTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void taskList() {
    // Test name: TaskList
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080//");
    // 2 | setWindowSize | 1058x808 | 
    driver.manage().window().setSize(new Dimension(1058, 808));
    // 3 | click | css=li:nth-child(2) > .nav-link | 
    driver.findElement(By.cssSelector("li:nth-child(2) > .nav-link")).click();
    // 4 | mouseOver | css=li:nth-child(2) > .nav-link | 
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(2) > .nav-link"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 5 | mouseOut | css=.active > .nav-link | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
