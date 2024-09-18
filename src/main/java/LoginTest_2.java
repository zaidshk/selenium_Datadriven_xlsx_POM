import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest_2 {

	
WebDriver driver;
	
	By username = By.xpath("//div//input[@placeholder='Username']");
	By password = By.xpath("//div//input[@placeholder='Password']");
	By loginbtn = By.xpath("//div//button[@type='submit']");
	
	
	
	
	
	@Test
	public void loginOrange() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		waitForElement(driver, username).sendKeys("Admin");;
		//driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(loginbtn).click();
	}
	
	
public static WebElement waitForElement(WebDriver driver, By by) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
}
