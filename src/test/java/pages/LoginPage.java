package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

	
	WebDriver driver = BaseClass.driver;
	
	ExtentTest test= BaseClass.test;
	
	//===========================  Web Elements  =============================
	@FindBy(className="login")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="btn_login")
	WebElement LogBtn;
	
	@FindBy(className="rememberMe")
	WebElement RememberMe;
	
	//==============================  Functions  ================================
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UsernameVal, String PasswordVal) {
		
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully" );
		UserName.sendKeys(UsernameVal);
		test.log(LogStatus.PASS, "Enter USerName", "UserName entered successfully" );
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password", "Password entered successfully" );
		RememberMe.click();
		test.log(LogStatus.PASS, "Click on RememberMe CheckBox", "RememberMe CheckBox clicked successfully" );
		LogBtn.click();
		test.log(LogStatus.PASS, "Click on Login Button", "Login Button clicked successfully" );
	}
	
}
