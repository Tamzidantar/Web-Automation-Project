package bd.com.FastAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsExample extends BaseDriver {
	//@Test(priority= 0)
	public void Alert_Button() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
	alertButton.click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	Thread.sleep(3000);
	}
	@Test//(priority= 1)
	public void ConfirmButton() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirmButton.click();
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
	Thread.sleep(3000);
	}
	//@Test(priority=2)
	public void buttonpromt() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
	promtButton.click();
	Alert alert = driver.switchTo().alert();
	promtButton.sendKeys("Hello Antar");
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(3000);
	}

	

}
