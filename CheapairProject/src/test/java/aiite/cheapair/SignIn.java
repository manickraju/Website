package aiite.cheapair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aiite.baseclass.BaseClass;

public class SignIn extends BaseClass {
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Sign In']")
	public WebElement Signin;


}
