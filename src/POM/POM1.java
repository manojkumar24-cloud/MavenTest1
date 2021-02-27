package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	@FindBy(xpath="//span[contains(text(),'Account & Lists')]")
	private WebElement enter;
	@FindBy(id="ap_email")
	private WebElement ema;
	@FindBy(id="continue")
	private WebElement i;
	@FindBy(id="ap_password")
	private WebElement p;
	@FindBy(id="signInSubmit")
	private WebElement s;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void es()
	{	
		enter.click();
	}
	public void email(String a)
	{
		ema.sendKeys(a);
	}
	public void next()
	{
		i.click();
	}
	public void pass(String b)
	{
		p.sendKeys(b);
	}
	public void sub()
	{
		s.click();
	}


}
