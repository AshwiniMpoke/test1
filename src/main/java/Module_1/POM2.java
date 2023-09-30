package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM2 {
	//to create and global variable with access level of private
	@FindBy (xpath="//input[@id=\"username_show\"]") private WebElement Usershow;
	@FindBy (xpath="//a[text()=\"Logout\"]")  private WebElement Logout;
	@FindBy (xpath="//a[text()=\"Click here to login again\"]") private WebElement Loginbtn;
	
	@FindBy (xpath="//*[@id=\"location\"]") private WebElement Location;
	@FindBy (xpath="//*[@id=\"hotels\"]") private WebElement Hotels;
	@FindBy (xpath="//*[@id=\"room_type\"]") private WebElement RoomType;
	@FindBy (xpath="//*[@id=\"room_nos\"]") private WebElement room_nos;
	@FindBy (xpath="//*[@id=\"datepick_in\"]") private WebElement CheckInDate;
	@FindBy (xpath="//*[@id=\"datepick_out\"]") private WebElement CheckoutDate;
	@FindBy (xpath="//*[@id=\"adult_room\"]") private WebElement adult_room;
	@FindBy (xpath="//*[@id=\"child_room\"]") private WebElement child_room;
	@FindBy (xpath="//*[@id=\"Submit\"]") private WebElement Searchbtn;
	@FindBy (xpath="//*[@id=\"radiobutton_0\"]") private WebElement radiobutton;
	@FindBy (xpath="//*[@id=\"continue\"]") private WebElement continuebtn;
	@FindBy (xpath="//*[@id=\"first_name\"]") private WebElement first_name;
	@FindBy (xpath="//*[@id=\"last_name\"]") private WebElement last_name;
	@FindBy (xpath="//*[@id=\"address\"]") private WebElement Billingaddress;
	@FindBy (xpath="//*[@id=\"cc_num\"]") private WebElement cc_num;
	@FindBy (xpath="//*[@id=\"cc_type\"]") private WebElement cc_type;
	@FindBy (xpath="//*[@id=\"cc_exp_month\"]") private WebElement cc_exp_month;
	@FindBy(xpath="//*[@id='cc_exp_year']") private WebElement EDYear;
	@FindBy (xpath="//*[@id=\"cc_cvv\"]") private WebElement cc_cvv_no;
	@FindBy (xpath="//*[@id=\"book_now\"]") private WebElement book_now;
	
	//Initialize within constructor with access level public with page factory class
	public POM2(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	//Utiliza with in the class with access level public
	public String Getusername() {
		String A1=Usershow.getAttribute("value");
		String [] A2= A1.split(" ");
		String D1=A2[0];
		String ActualUN=A2[1];
		return ActualUN;
	}
	public void logout() {
		 Logout.click();
	}
	public void Loginagain() {
		Loginbtn.click();
	}
	public void Selectlocation(String LOC) {
		Select S1=new Select(Location);
		S1.selectByVisibleText(LOC);
	}
	public void Selecthotel(String HO) {
		Select S1=new Select(Hotels);
		S1.selectByVisibleText(HO);
	}
	public void SelectRoomtype(String RT) {
		Select S1=new Select(RoomType);
		S1.selectByVisibleText(RT);
	}
	public void Selectroom_nos (String NOR) {
		Select S1=new Select(room_nos);
		S1.selectByVisibleText(NOR);
	}
	
	public void Entercheckindate(String CD) {
		CheckInDate.sendKeys(CD);
	}
	public void Entercheckoutdate(String CO) {
		CheckoutDate.sendKeys(CO);
	}
	public void Selectadult_room (String AR) {
		Select S1=new Select(adult_room);
		S1.selectByVisibleText(AR);
	}
	public void Selectchild_room(String CR) {
		Select S1=new Select(child_room);
		S1.selectByVisibleText(CR);
	}
	public void Clickonsearchbtn() {
		Searchbtn.click();
	}
	
	public void Clickonrediobtn() {
		radiobutton.click();
	}
	
	public void Clickoncontinuebtn() {
		continuebtn.click();
	}
	
	public void EnterFN(String FN) {
		first_name.sendKeys(FN);
	}
	
	public void EnterLN(String LN) {
		last_name.sendKeys(LN);
	}
	
	public void EnterBillingaddress(String BAd) {
		Billingaddress.sendKeys(BAd);
	}
	
	public void Entercc_num(String CCN) {
		cc_num.sendKeys(CCN);
	}
	public void Selectcc_type(String CCT) {
		Select S1=new Select(cc_type);
		S1.selectByVisibleText(CCT);
	}
	public void Selectcc_exp_month(String CCE) {
		Select S1=new Select(cc_exp_month);
		S1.selectByVisibleText(CCE);
	}
	public void Selectcc_exp_year(String CCY) {
		Select S1=new Select(EDYear);
		S1.selectByVisibleText(CCY);
	}
	public void Entercc_cvv_no(String CVV) {
		cc_cvv_no.sendKeys(CVV);
	}

	public void ClickBooknowbtn() {
		book_now.click();
	}
}
