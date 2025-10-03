package Pract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Upload_pract {
	public static WebDriver driver;
	
	Upload_pract()
	{
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void upload()
	{
		driver.get("https://testautomationcentral.com/demo/file_upload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fileInput = driver.findElement(By.id("file-input"));
		fileInput.sendKeys("C:\\Users\\Ravi Chandra\\OneDrive\\Pictures\\Azure_Free_Account_Fail_msg.PNG");
		
		driver.findElement(By.xpath("//button[text()='Upload']")).click();
	}
}
