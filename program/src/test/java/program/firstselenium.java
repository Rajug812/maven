package program;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstselenium {
	
	@Test
	public  void testcase1 () throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.safaridriver().setup();
		
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(2000);
		String afterlogin=driver.getTitle();
		if(beforelogin.equals(afterlogin)) {
			
			driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			System.out.println("the title of the home page same");
		}
		else {
			System.out.println("the title of the page not same");
		}

		driver.close();	
			
		}

}
