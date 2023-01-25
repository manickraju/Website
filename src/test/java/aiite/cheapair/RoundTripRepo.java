package aiite.cheapair;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import aiite.baseclass.BaseClass;

public class RoundTripRepo extends BaseClass {
	
	/*public WebElement getIndia() {
		return india;
	}*/
	public RoundTripRepo() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFrom() {
		return From;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getDeparture() {
		return Departure;
	}

	public WebElement getReturn() {
		return Return;
	}

	public WebElement getDecreaseAdults() {
		return DecreaseAdults;
	}

	public WebElement getIncreaseAdults() {
		return increaseAdults;
	}

	public WebElement getDecreaseSeniors() {
		return DecreaseSeniors;
	}

	public WebElement getIncreaseSeniors() {
		return IncreaseSeniors;
	}

	public WebElement getDecreaseChildrens() {
		return DecreaseChildrens;
	}

	public WebElement getIncreaseChildrens() {
		return IncreaseChildrens;
	}

	public WebElement getDecreaseInfantlap() {
		return DecreaseInfantlap;
	}

	public WebElement getIncreaseInfantlap() {
		return IncreaseInfantlap;
	}

	public WebElement getEconomyClass() {
		return EconomyClass;
	}

	public WebElement getPremiumEconomyClass() {
		return PremiumEconomyClass;
	}

	public WebElement getBusinessClass() {
		return BusinessClass;
	}

	public WebElement getFirstClass() {
		return FirstClass;
	}

	public WebElement getViewdeal() {
		return viewdeal;
	}

	public WebElement getSelectCLASSIC() {
		return SelectCLASSIC;
	}

	public WebElement getSelectFlexible() {
		return SelectFlexible;
	}

	public WebElement getSelectPremium() {
		return SelectPremium;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getMiddleName() {
		return MiddleName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getMALE() {
		return MALE;
	}

	public WebElement getFEMALE() {
		return FEMALE;
	}

	public WebElement getFlight1() {
		return Flight1;
	}

	public WebElement getSelecetSeat() {
		return SelecetSeat;
	}

	public WebElement getFlight2() {
		return Flight2;
	}

	public WebElement getSelecetSeat1() {
		return SelecetSeat1;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	public WebElement getMailidR() {
		return mailidR;
	}

	public WebElement getValidationMail() {
		return validationMail;
	}

	public WebElement getChoosecountrycode() {
		return Choosecountrycode;
	}

	public WebElement getIndiaCode() {
		return IndiaCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getStateName() {
		return stateName;
	}

	public WebElement getTamilNadu() {
		return TamilNadu;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getIndianCountry() {
		return IndianCountry;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getAddExtraBag() {
		return AddExtraBag;
	}

	public WebElement getContinueWithout() {
		return ContinueWithout;
	}

	public WebElement getBASIC() {
		return BASIC;
	}

	public WebElement getSTANDARAD() {
		return STANDARAD;
	}

	public WebElement getPREMIMUM() {
		return PREMIMUM;
	}

	public WebElement getPrimeFare() {
		return PrimeFare;
	}

	public WebElement getFullFare() {
		return FullFare;
	}

	public WebElement getContinuePayment() {
		return ContinuePayment;
	}

	@FindBy(id="from1")
	private WebElement From;
	
	@FindBy(id="to1")
	private WebElement To;
	
	@FindBy(id="departs")
	private WebElement Departure;
	
	@FindBy(id="returns")
	private WebElement Return;
	
	         //passangers//
	           //Adults//
	@FindBy(xpath="//button[@tabindex='5']")
	private WebElement DecreaseAdults;
	@FindBy(xpath="//button[@tabindex='6']")
	private WebElement increaseAdults;
	
	            //Seniors//
	@FindBy(xpath="//button[@tabindex='7']")
	private WebElement DecreaseSeniors;
	@FindBy(xpath="//button[@tabindex='8']")
	private WebElement IncreaseSeniors;
	
	            //Childrens//
	@FindBy(xpath="//button[@tabindex='9']")
	private WebElement DecreaseChildrens;
	@FindBy(xpath="//button[@tabindex='10']")
	private WebElement IncreaseChildrens;
	
	              //Infant in Lap//
	@FindBy(xpath="//button[@tabindex='11']")
	private WebElement DecreaseInfantlap;
	@FindBy(xpath="//button[@tabindex='12']")
	private WebElement IncreaseInfantlap;
	
	           //SelectClass//
	@FindBy(xpath="//option[@value='Y']")
	private WebElement EconomyClass;
	@FindBy(xpath="//option[@value='W']")
	private WebElement PremiumEconomyClass;
	@FindBy(xpath="//option[@value='C']")
	private WebElement BusinessClass;
	@FindBy(xpath="//option[@value='F']")
	private WebElement FirstClass;
	
	//View Deal
	@FindBy(id="VeBE-mb-best")
	private WebElement viewdeal;
	
	@FindBy(xpath="//button[@data-fare='CLASSIC']")
	private WebElement SelectCLASSIC;
	@FindBy(xpath="//button[@data-fare='FLEXIBLE_FARE_RULE']")
	private WebElement SelectFlexible;
	@FindBy(xpath="//button[@data-fare='PREMIUM_FARE_RULE']")
	private WebElement SelectPremium;
	
	//passanger details
	@FindBy(name="name")
	private WebElement FirstName;
	@FindBy(name="middleName")
	private WebElement MiddleName;
	@FindBy(name="firstLastName")
	private WebElement LastName;
	
	@FindBy(name="travellerGender")
	private WebElement Gender;
	@FindBy(xpath="//option[@value='MALE']")
	private WebElement MALE;
	@FindBy(xpath="//option[@value='FEMALE']")
	private WebElement FEMALE;
	
	//Flight1 click
	@FindBy(xpath="//li[@data-flight-section-small='MAA - DEL']")
	private WebElement Flight1;
	@FindBy(id="aircraft_map_8F")
	private WebElement SelecetSeat;
	
	
	//Flight2 click
	@FindBy(xpath="//li[@data-flight-section-small='DEL - MAA']")
	private WebElement Flight2;
	@FindBy(id="aircraft_map_8F")
	private WebElement SelecetSeat1;
	
	@FindBy(xpath="//div[@class='od-seatmapselection-footer-right-side']")
	private WebElement Confirm;
	
	//Billing and contact details
	@FindBy(name="mail")
	private WebElement mailidR;
	@FindBy(name="validationMail")
	private WebElement validationMail;
	
	@FindBy(xpath="//select[@data-mandatory='Choose a country code']")
	private WebElement Choosecountrycode;
	
	@FindBy(xpath="//option[@data-index='101']")
	private WebElement IndiaCode;
	
	@FindBy(name="phoneNumber1")
	private WebElement phoneNumber;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="zipCode")
	private WebElement zipCode;
	@FindBy(name="cityName")
	private WebElement cityName;
	
	//STATE
	@FindBy(name="stateName")
	private WebElement stateName;
	@FindBy(xpath="//option[@data-index='42']")
	private WebElement TamilNadu;
	
	//country
	@FindBy(name="country")
	private WebElement country;
	@FindBy(xpath="//option[@data-index='101']")
	private WebElement IndianCountry;
	
	@FindBy(name="customersinfosave")
	private WebElement CheckBox;
	@FindBy(xpath="//button[@data-page-flow-track-action='payment_flow_action']")
	private WebElement Continue;
	
	@FindBy(xpath="//button[@data-id='NAGS:DEFAULT_BAGGAGE:ACCEPTANCE']")
	private WebElement AddExtraBag;
	
	@FindBy(xpath="//button[@data-id='NAGS:DEFAULT_BAGGAGE:REJECTION']")
	private WebElement ContinueWithout;
	
	//SamePage Load in next Steps
	@FindBy(xpath="//div[@data-type='basic']")
	private WebElement BASIC;
	@FindBy(xpath="//div[@data-type='standard']")
	private WebElement STANDARAD;
	@FindBy(xpath="//div[@data-type='premium']")
	private WebElement PREMIMUM;
	@FindBy(id="//input[@id='selectable-radio-4-odf-selectable-PRIME_FARE']")
	private WebElement PrimeFare;
	@FindBy(id="//input[@id='selectable-radio-4-odf-selectable-FULL_FARE']")
	private WebElement FullFare;
	
	@FindBy(xpath="//button[text()='Continue to payment']")
	private WebElement ContinuePayment;
	
	
	
	
	
	
	
	
	

}
