package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseover {
	
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
		WebElement Username=raju.findElement(By.name("username"));
		if(Username.isEnabled())
			{
			Username.sendKeys("Admin");
			}
		Thread.sleep(2000);
			WebElement Password=raju.findElement(By.xpath("//*[@type='password']"));
		if(Password.isDisplayed())
		{
			Password.sendKeys("admin123");
			WebElement click=raju.findElement(By.xpath("//*[@type='submit']"));
			click.click();
             Thread.sleep(3000);
		}
		raju.findElements(By.xpath("//*[@class='oxd-table-card']")).get(13).click();
		Thread.sleep(2000);
		raju.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(13).click();
		Thread.sleep(2000);
		raju.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(13).click();
		Thread.sleep(2000);
		raju.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(2000);
	}
		@Test (priority=0)
		public void testcase2() throws InterruptedException{
			   
		    raju.findElement(By.xpath("//*[text()='Admin']"));
			Thread.sleep(2000);
			List<WebElement> li=raju.findElements(By.xpath("//*[@class='oxd-table-card']"));
			System.out.println(li.size());
			raju.findElements(By.xpath("//*[@class='oxd-table-card']")).get(6).click();
			Thread.sleep(2000);
			System.out.println("Username:"+raju.findElements(By.xpath("//*[@class='oxd-table-card'][6]")));
			raju.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
			Thread.sleep(2000);
			raju.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
			Thread.sleep(2000);
			raju.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			Thread.sleep(2000);
		}
		//keys Actions
			/*@Test(priority=2)
			public void testcase3() throws InterruptedException {
				Actions act=new Actions(raju);
					WebElement ele=raju.findElement(By.xpath("//*[@class='oxd-select-text-input']"));
					Thread.sleep(3000);
					act.click(ele).build().perform();
					act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(ele, Keys.ENTER).click().build().perform();
					Thread.sleep(2000);
			}*/
			//Mouseover actions
//	@Test(priority=3)
	//public void testcase4() {
		
		
	@AfterTest
		public void aftertest() throws InterruptedException{
			Thread.sleep(2000);
			raju.close();
		}
			
	
}