package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webele_actions {

	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver raju;
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
	 raju =new ChromeDriver();
		raju.get(url);
	Thread.sleep(2000);
	}
	//for login
	@Test (priority=0)
	public void testcase1() throws InterruptedException{
		Thread.sleep(3000);
	raju.findElement(By.name("username")).sendKeys("Admin");
	raju.findElement(By.name("password")).sendKeys("admin123");
	raju.findElement(By.xpath("//*[@type='submit']")).click();
	
	
	Thread.sleep(2000);
    }
	
	//for admin delete name
	@Test(enabled=true,priority=1)
	public void testcase4() throws InterruptedException{
		
		raju.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(2000);
		raju.findElements(By.xpath("//*[@class='oxd-table-card']")).get(13).click();
		Thread.sleep(2000);
		raju.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(13).click();
		Thread.sleep(2000);
		raju.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(13).click();
		Thread.sleep(2000);
		raju.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(2000);
	}
	/*
	//for maintanance
	@Test(enabled=true)
	public void testcase2() throws InterruptedException{
	Thread.sleep(2000);
	//raju.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
	raju.findElement(By.xpath("//*[text()='Maintenance']")).click();
	//raju.findElement(By.xpath("//*{@class='oxd-form-row'][2]/div/div[2]/input")).sendKeys("admin123");
	raju.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	raju.findElement(By.xpath("//*[@type='submit']")).click();
	//raju.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	}	
	//for logout
	@Test(priority=2)
	public void testcase3() throws InterruptedException{
		raju.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		raju.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		System.out.println("the title of the home page same");
	}
	*/
@AfterTest
public void aftertest() throws InterruptedException{
	Thread.sleep(2000);
	raju.close();
}
	
	
}
