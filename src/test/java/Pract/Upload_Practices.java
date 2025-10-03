package Pract;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upload_Practices {

	public static WebDriver driver;
	
	 @BeforeTest
	    public void setUp() {
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    }
	
	@Test
	public void load() throws AWTException, InterruptedException
	{
		driver.get("https://testautomationcentral.com/demo/file_upload.html");
	
		
		//WebElement fileInput = driver.findElement(By.id("file-input"));
		((JavascriptExecutor) driver).executeScript("document.getElementById('file-input').click();");

		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Ravi Chandra\\OneDrive\\Pictures\\Azure_Free_Account_Fail_msg.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Upload']")).click();
	}
	
	@AfterTest
    public void tearDown() {
       driver.quit();
    }
}
