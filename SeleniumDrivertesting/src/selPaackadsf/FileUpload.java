package selPaackadsf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {

	public WebDriver driver;
	@BeforeTest
	public void fielUpload()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        	 driver = new ChromeDriver();
        	 driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	}
	
	@Test
	public void uploadfile()
	{
		WebElement uploadFile=driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[1]"));
		uploadFile.sendKeys("C:\\Users\\truba\\Desktop\\UpdateCode.txt");
		
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/table/tbody/tr/td[5]/button[1]")).click();
		
	}

}
