package selPaackadsf;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;

public class Screenshots {

public static WebDriver browserObject;
	@Test
	public  void screeshotTest() throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
		FirefoxDriver browserObject = new FirefoxDriver();
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.manage().window().maximize();
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		browserObject.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();
		
		String username= "Demo";
		String password="Test123456$";
		
		
		WebElement email= browserObject.findElement(By.id("user_login"));
		email.sendKeys(username);
		
		WebElement pass= browserObject.findElement(By.id("user_pass"));
		pass.sendKeys(password);
		
		
		browserObject.findElement(By.id("wp-submit")).click();
		
		if(username.equals("Demo12"))
		{
			capureScreen();
			System.out.println("Test Passed");
			Assert.assertTrue(false);
			
		}
		
}
	
	public static void capureScreen() throws IOException
	{
		System.out.println("Screenshot section");
		File sc= ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
		Files.copy(sc, new File("C:\\Users\\truba\\Desktop\\sample\\username.jpg"));
	}

}
