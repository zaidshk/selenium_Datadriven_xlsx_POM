import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Logintest {

	
	WebDriver driver;
	
	By username = By.xpath("//div//input[@placeholder='Username']");
	By password = By.xpath("//div//input[@placeholder='Password']");
	By loginbtn = By.xpath("//div//button[@type='submit']");

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void loginOrangeWebsite(String user, String pass) {
		
//		waitForElement(driver, username).sendKeys("Admin");;
//		//driver.findElement(username).sendKeys("Admin");
//		driver.findElement(password).sendKeys("admin123");
//		driver.findElement(loginbtn).click();
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	public static WebElement waitForElement(WebDriver driver, By by) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	 
	
}
