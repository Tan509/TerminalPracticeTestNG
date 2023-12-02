import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {

	WebDriver driver;




	@Test(priority=0)
	public void LaunchApp()
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


	}

	@Test(priority=1)
	public void LaunchingAppDetails()
	{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//driver.findElement(By.linkText("Login")).click();
	}

	@Test(priority=2)
	public void NavigationToMyInfo()
	{
		driver.findElement(By.linkText("My Info")).click();
	}

	@Test(priority=3)
	public void verifyMyInfo()
	{
		boolean info = driver.findElement(By.linkText("Personal Details")).isDisplayed();

		System.out.println(info);

		//driver.quit();
	}
	
	@Test(priority=4)
	public void VerifyLogin()
	{
		String name = "Paul";

		WebElement firstName = driver.findElement(By.name("firstName"));

		String fn = firstName.getText();

		System.out.println(fn);

		if(fn.equals(name))
		{
			System.out.println("valid cust");
		}


	}

}
