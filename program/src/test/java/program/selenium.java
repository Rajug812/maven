package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium {
	
	public static String url= "https://demo.guru99.com/test/newtours/";
		WebDriver driver;
		@BeforeTest
	public void beforetest() throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
			driver.get(url);
		Thread.sleep(2000);
		}
		
		@Test (priority=0)
	public void testcase1(){
		driver.findElement(By.name("userName")).sendKeys("raju");
		driver.findElement(By.name("password")).sendKeys("rajug96");
		driver.findElement(By.name("submit")).click();
		
		}
		
		@Test
		 public void testcase2()throws InterruptedException
		 {
			
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys("raju");
			driver.findElement(By.name("lastName")).sendKeys("gunapu");
			driver.findElement(By.name("phone")).sendKeys("9966570454");
			driver.findElement(By.name("email")).sendKeys("raju123@gmail.com");
			driver.findElement(By.name("userName")).sendKeys("raju");
			driver.findElement(By.name("password")).sendKeys("rajug96");
			driver.findElement(By.name("confirmPassword")).sendKeys("rajug96");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
		 
		 }
		@AfterTest
		public void aftretest() throws InterruptedException {
			Thread.sleep(2000);
			System.out.println(url);
			driver.close();
		}
		
	}
