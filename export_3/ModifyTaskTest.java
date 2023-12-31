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
public class ModifyTaskTest {
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
  public void modifyTask() {
    // Test name: modifyTask
    // Step # | name | target | value
    // 1 | open | http://localhost:8080/#/Home | 
    driver.get("http://localhost:8080/#/Home");
    // 2 | waitForElementVisible | xpath=(//a[contains(text(),'Todo List')]) | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),\'Todo List\')])")));
    }
    // 3 | setWindowSize | 1064x808 | 
    driver.manage().window().setSize(new Dimension(1064, 808));
    // 4 | click | xpath=(//a[contains(text(),'Todo List')])[2] | 
    driver.findElement(By.xpath("(//a[contains(text(),\'Todo List\')])[2]")).click();
    // 5 | click | xpath=//button[contains(.,'Edit')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Edit\')]")).click();
    // 6 | click | xpath=//body | 
    driver.findElement(By.xpath("//body")).click();
    // 7 | type | css=.ng-dirty | 12311
    driver.findElement(By.cssSelector(".ng-dirty")).sendKeys("12311");
    // 8 | click | xpath=//button[contains(.,'Save')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Save\')]")).click();
  }
}
