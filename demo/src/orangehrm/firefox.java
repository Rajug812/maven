package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
 
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main (String[] args) {
	System.setProperty("webdriver.gecko.driver","C://Users//kanna//Downloads//geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get(url);
	
}
}