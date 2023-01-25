package aiite.loginpage;

import org.junit.Before;
import org.junit.Test;

import aiite.baseclass.BaseClass;
import aiite.cheapair.SignIn;

public class LoginPage extends BaseClass {
	@Before
	public void homePage(){
driver.get("https://www.cheapair.com/");		
	}
	
	@Test
public void SignInClick() {
	SignIn s=new SignIn();
	s.click(s.Signin);
	s.type(s.getCheapairusername(), "resq.hp@gmail.com");
	s.type(s.getCheapairpassword(), "Noneed.0");
	s.getCheapairsign().click();
	System.out.println("Login Page Sucessful");
	}
}
