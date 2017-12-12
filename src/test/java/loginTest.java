import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\class\\webdriver\\chromedriver_win32\\chromedriver.exe");

	driver=new ChromeDriver();
	
}
	@Test
	public void doLogin() {
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pratijapavitwar");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}
	
	@AfterTest 
	public void tearDown() {
		driver.quit();
	}
}
