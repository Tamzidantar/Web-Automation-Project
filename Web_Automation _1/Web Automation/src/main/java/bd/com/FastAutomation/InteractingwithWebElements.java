package bd.com.FastAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingwithWebElements extends BaseDriver {

	//@Test
	public void clear() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Md");
		Thread.sleep(3000);
		
		firstName.clear();
		firstName.sendKeys("Antar");
		Thread.sleep(3000);
		
	}
	//@Test
	public void getAttribute() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		System.out.println(firstName.getAttribute("placeholder"));
		Thread.sleep(3000);
	}
	@Test
	public void gettext() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement text = driver.findElement(By.xpath("//*[@class='practice-form-wrapper']/h1"));
		System.out.println(text.getText());
		Thread.sleep(3000);
	}


}
