package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	//LoginPage obj=new LoginPage();
	
	@Test
	public void LoginFailureTest() {
		
		//test=report.startTest("LoginFailureTest");
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction("abc@xyz.com","Abc@1234");

		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActualMsg, ExpMsg);
		
		//report.endTest(test);

	}
	
	@Test
	public void LoginSuccessTest() {
		
		//test=report.startTest("LoginSuccessTesty");
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction("abc@xyz.com","Abc@1234");
		
		//report.endTest(test);
	}
	
	/*@Test
	  @Parameters({"Param1","Param2"})
	 public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction(UserNameVal,PasswordVal);
	}*/
	
	@Test
	public void ExternalDataTest() {
		
		String UserNameVal= sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal= sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage obj=new LoginPage();
		obj.LoginFunction(UserNameVal,PasswordVal);
	}
}
