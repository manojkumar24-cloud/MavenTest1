package TestNG;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.*;
import POM.*;

public class Execution extends Generic1 {
	
	@Test
	public void Executionclass() throws InterruptedException
	{
		
		POM1 pc=new POM1(driver);
		pc.es();
		pc.email("Manojrevenkar70@gmail.com");
		pc.next();
		pc.pass("9740188496");
		pc.sub();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Online Shopping site in India"))
		{
			System.out.println("title is perfect");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		WebElement we1=driver.findElement(By.id("twotabsearchtextbox"));
		we1.sendKeys("canon DSLR");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		 List<WebElement> details = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int tex = details.size();
		for(WebElement we:details)
		{
			String out = we.getText();
			System.out.println(out);
			if(out.contains("Canon EOS 1500D"))
			{
				System.out.println("The camera is visible");
				we.click();
			}
			else
			{
				System.out.println("The item is not visible");
			}
		}
		
		
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String tab1 = it.next();
		String tab2 = it.next();
		driver.switchTo().window(tab1);
		driver.switchTo().window(tab2);
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		WebElement we4=driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']"));
		Actions a=new Actions(driver);
		a.doubleClick(we4).perform();
		Thread.sleep(3000);
		
		List<WebElement> address = driver.findElements(By.xpath("//div[@class='a-spacing-base address-book']"));
		int valu = address.size();
		System.out.println(valu);
		for(WebElement wea:address)
		{
			String test = wea.getText();
			System.out.println(test);
			if(test.contains(" No 80, 3rd Cross, Puttaswamaiha Road"))
			{
				WebElement abc = driver.findElement(By.xpath("//div[@class='ship-to-this-address a-button a-button-primary a-button-span12 a-spacing-medium']//a[contains(@class,'a-declarative a-button-text')][contains(text(),'Deliver to this address')]"));
				abc.click();		
				System.out.println("Address found");
			}
			else
			{
				System.out.println("address not found");
			}
			
		}

	}

	private WebElement getElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
		
		
	}

}
