package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C://Users//kanna//Downloads//chromedriver.exe");
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
