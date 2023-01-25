package aiite.cheapair;

import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aiite.baseclass.BaseClass;

public class SignIn extends BaseClass {
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	
	//Login option
	@FindBy(xpath="//span[text()='Sign In']")
	public WebElement Signin;
	
	//Google Signin option
	@FindBy(xpath="//div[@class='abcRioButtonContentWrapper']")
	public WebElement GoogleSignin;
	
	//Google UserName
	@FindBy(xpath="//input[@aria-label='Email or phone']")
	private WebElement GEmailid;
	
	public WebElement getGEmailid() {
		return GEmailid;
	}

	public WebElement getCheapairusername() {
		return Cheapairusername;
	}

	public WebElement getCheapairpassword() {
		return Cheapairpassword;
	}

	//Cheapair UserName
	@FindBy(id="signInEmail")
	private WebElement Cheapairusername;
	
	//Cheapair Password
	@FindBy(name="password")
	private WebElement Cheapairpassword;
	
	//Cheapair signin
	@FindBy(id="signInBtn")
	private WebElement cheapairsign;

	public WebElement getCheapairsign() {
		return cheapairsign;
	}

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getGoogleSignin() {
		return GoogleSignin;
	}

	


}
