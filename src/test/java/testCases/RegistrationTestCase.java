package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.Registration_Page;
import testBase.BaseClass;


public class RegistrationTestCase extends BaseClass
{
	@Test(priority=1)
	public void register() throws InterruptedException {
			
		logger.info("**starting register testcase**");
			HomePage hp=new HomePage(driver);
			logger.info("**click on my account **");
			hp.ClickOnMyAccount();
			Thread.sleep(2000);
			logger.info("**clicking on register**");
			hp.clickOnRegister();
			Thread.sleep(2000);
			
			Registration_Page rp=new Registration_Page(driver);
			Thread.sleep(2000);
			logger.info("**entering all the credentials**");
			logger.info("**entering first name**");
			rp.sendFirstName("Megha");
			Thread.sleep(2000);
			logger.info("**entering last name**");
		    rp.sendLastName("Gosabal");
		    Thread.sleep(2000);
		    logger.info("**entering email**");
		    rp.sendEmail("megha@gmail.com");
		    Thread.sleep(2000);
		    logger.info("**entering password**");
	        rp.sendPasword("123456");
	        Thread.sleep(5000);
	        rp.selectAgree();
	        Thread.sleep(2000);
	        rp.ClickContinue();
		}
}
