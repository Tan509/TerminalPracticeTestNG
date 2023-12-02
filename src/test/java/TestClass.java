import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test(priority=0)
	public void TestGoogle()
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("H Y R Tutorials", Keys.ENTER);

		System.out.println(driver.getTitle());

		driver.quit();

	}
	
	@Test(priority=1)
	public void TestFacebook()
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");

		System.out.println(driver.getTitle());

		driver.quit();

	}



}
