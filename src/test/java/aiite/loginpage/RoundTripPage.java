package aiite.loginpage;

import org.junit.Before;
import org.junit.Test;

import aiite.baseclass.BaseClass;
import aiite.cheapair.RoundTripRepo;

public class RoundTripPage extends BaseClass {
	@Before
	public void homePage(){
driver.get("https://www.cheapair.com/");		
	}
	
	
	@Test
	public void country() {
		RoundTripRepo round=new RoundTripRepo();
		round.getChoosecountrycode().click();
		for(int i=0;i<=246;i++)
		{
		    String exactvalue=round.getChoosecountrycode().getText();
		    System.out.println(i);
		        if (exactvalue.equals("Received"))
		        {
		            break;
		        }
		        else 
		        {
		        driver.navigate().refresh();

		        }
		}}}
