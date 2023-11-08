package selPaackadsf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoUpload {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe"); 
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	   // for page load
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");       
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
	             
	   WebElement uname = driver.findElement(By.name("username"));         
	   uname.sendKeys("Admin");
	     
	   WebElement pwd = driver.findElement(By.name("password"));   
	   pwd.sendKeys("admin123");
	    
	   WebElement loginb = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	   loginb.click();                                 
	         
	 
	   WebElement pim = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
	    pim.click();                                            
	 
	   WebElement config = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
	    config.click();                               
	 
	    WebElement data_imp =driver.findElement(By.partialLinkText("Data Import"));
	    data_imp.click();                                 
	         
	 
	    // UPLOADING FILE USING AutoIT....
	     
	    WebElement browser = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[1]"));   //Browse button
	    browser.click();                                
	    Runtime.getRuntime().exec("C:\\Users\\truba\\Desktop\\sample.exe");
	 
	  Thread.sleep(3000);
	 
	  WebElement upload =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button"));            //Upload button
	   upload.click();
	       
	  
	   System.out.println("File Uploaded Successfully"); 
	   driver.close();
}
}
