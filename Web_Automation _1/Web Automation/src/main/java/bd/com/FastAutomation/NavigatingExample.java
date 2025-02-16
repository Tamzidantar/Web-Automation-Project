package bd.com.FastAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigatingExample extends BaseDriver{
	@Test
	public void xpath_location () throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/#?");
		
		WebElement xpath = driver.findElement(By.xpath("//*[@class= 'card-categories-ul']/div[3]/a"));
		xpath.click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.youtube.com/");
		
	}


}
