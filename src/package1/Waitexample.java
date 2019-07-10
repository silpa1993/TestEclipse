package package1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Waitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SILPA\\eclipse-workspace\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.id("timingAlert")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("Alert is present");
		driver.quit();
	}

}
