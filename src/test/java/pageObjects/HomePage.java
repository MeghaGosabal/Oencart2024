package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement Login;


	public void ClickOnMyAccount()
	{
		myaccount.click();		
	}
	
   
	public void clickOnRegister() 
	{
		register.click();
	}
	
	public void clickOnLogin() 
	{
		Login.click();
		
	}
	
	
	
}
