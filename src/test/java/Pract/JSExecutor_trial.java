package Pract;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor_trial {

	@Test
	public void executorScript() throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='abc@gmail.com';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('email').style.border='5px red dotted';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').style.background='yellow';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').removeAttribute('style');");
		
		
		js.executeScript("document.getElementById('pass').value='abc@gmail.com';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('pass').setAttribute('style','border: 5px red dotted;background: yellow');");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('pass').removeAttribute('style');");
		
		
		js.executeScript("document.getElementsByName('login')[0].setAttribute('style','border: 5px red dotted;background: yellow');");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByName('login')[0].removeAttribute('style');");
		js.executeScript("document.getElementsByName('login')[0].click();");
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
