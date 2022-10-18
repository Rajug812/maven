package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcasedemo {
	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
	
	WebDivermanagerdriver().setup();
	 driver =new ChromeDriver();
		driver.get(url);
	Thread.sleep(2000);
	}
	
	private Object WebDivermanagerdriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test (priority=0)
	public void testcase1() throws InterruptedException{
		Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(2000);
    }
	
	@Test(priority=1)
	public void testcase2() throws InterruptedException{
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
	driver.findElement(By.xpath("//*[text()='Maintenance']")).click();
	//driver.findElement(By.xpath("//*{@class='oxd-form-row'][2]/div/div[2]/input")).sendKeys("admin123");
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	//driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	}	
	
	@Test(priority=2)
	public void testcase3() throws InterruptedException{
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		System.out.println("the title of the home page same");
	}
	
@AfterTest
public void aftertest() throws InterruptedException{
	Thread.sleep(2000);
	driver.close();
}

}
