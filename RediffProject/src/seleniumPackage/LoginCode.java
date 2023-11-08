package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	       ChromeDriver driver = new ChromeDriver();
			
			   // for page load
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("login1")).sendKeys("solution9097@rediffmail.com");
			
			driver.findElement(By.id("password")).sendKeys("Test123456#");
			
			driver.findElement(By.name("proceed")).click();
			
			driver.close();
	}

}
