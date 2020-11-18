package variousLocators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	WebDriver driver;
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://objectspy.space/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Aanchal");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.className("input-file")).click();
		
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//CSS ID
		//driver.findElement(By.cssSelector("input.input-file")).click();
		driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();
		
		//xpath
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jain");
		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	}

}
