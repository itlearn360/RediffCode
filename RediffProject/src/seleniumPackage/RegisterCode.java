package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class RegisterCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
       ChromeDriver driver = new ChromeDriver();
		
		   // for page load
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Ravi");
		
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("raavi");
		
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Ravi@12");
		
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Ravi@12");
		
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("raanjan");
		
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("90979982627");
		
		 Select days = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
	        
		 days.selectByVisibleText("10");
		 Select month = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
	        
		 month.selectByVisibleText("JUL");
	     
		 Select year = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
	        
		 year.selectByVisibleText("1995"); 
		 
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
		 
		 Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
	        
		 country.selectByVisibleText("Anguilla"); 
		 
		 Select city = new Select(driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")));
	        
		 city.selectByVisibleText("Ahmedabad"); 
		 
		 driver.close();
		 
		 
	}

}
