package Module1_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_file.Baseclass;
import Library_file.Utility_class;
import Module_1.POM1;
import Module_1.POM2;

public class test_class extends Baseclass {
	  //public Webdriver driver;
	  //initilization
	POM1 Login;
	POM2 Home;
	String TestcaseID;
	
		@BeforeClass
		public void openbrowser(){
			Initilisation();
			//create object of POM1
			Login =new POM1(driver);
			
			//create object of POM1
			 Home=new POM2 (driver);
			 
		}

		@BeforeMethod
		public void Login() throws IOException{
			Login.enterusername(Utility_class.getdatafromPF("username"));
			
			Login.Enterpassword(Utility_class.getdatafromPF("Password"));
			
			Login.Clickloginbt();

		}
		@Test (priority=1)
		
		public void verifyusername() throws EncryptedDocumentException, IOException{
			TestcaseID="TC100";
			String Actualusername=Home.Getusername();//velocity!
			
			String ExpectedUsername=Utility_class.getdatafromexcel(0, 0);//velocity!
			
			Assert.assertEquals(Actualusername, ExpectedUsername);
			
		}
		@Test (priority=2)
		public void gettitle() throws EncryptedDocumentException, IOException {
			TestcaseID="TC101";
			String Actualtitle=driver.getTitle();  //Adactin.com - Search Hotel
			String Expectedtitle=Utility_class.getdatafromexcel(1, 0);//Adactin.com - Search Hotel
			Assert.assertEquals(Actualtitle, Expectedtitle);
		}
		@Test (priority=3)
		public void SearchHotel() throws EncryptedDocumentException, IOException {
			TestcaseID="TC102";
			Home.Selectlocation(Utility_class.getdatafromexcel(2, 0));
			Home.Selecthotel(Utility_class.getdatafromexcel(3, 0));
			Home.SelectRoomtype(Utility_class.getdatafromexcel(4, 0));
			Home.Selectroom_nos(Utility_class.getdatafromexcel(5, 0));
			Home.Entercheckindate(Utility_class.getdatafromexcel(6, 0));
			Home.Entercheckoutdate(Utility_class.getdatafromexcel(7, 0));
			Home.Selectadult_room(Utility_class.getdatafromexcel(8, 0));
			Home.Selectchild_room(Utility_class.getdatafromexcel(9, 0));
			Home.Clickonsearchbtn();
			Home.Clickonrediobtn();
			Home.Clickoncontinuebtn();
			Home.EnterFN(Utility_class.getdatafromexcel(10, 0));
			Home.EnterLN(Utility_class.getdatafromexcel(11, 0));
			Home.EnterBillingaddress(Utility_class.getdatafromexcel(12, 0));
			Home.Entercc_num(Utility_class.getdatafromexcel(13, 0));
			Home.Selectcc_type(Utility_class.getdatafromexcel(14, 0));
			Home.Selectcc_exp_month(Utility_class.getdatafromexcel(15, 0));
			Home.Selectcc_exp_year(Utility_class.getdatafromexcel(18, 0));
			Home.Entercc_cvv_no(Utility_class.getdatafromexcel(17, 0));
			Home.ClickBooknowbtn();
		}
		@AfterMethod
		public void Logout(ITestResult result) throws IOException{
			
			if(result.getStatus()==ITestResult.FAILURE)  //false  true
			{
				Utility_class.CaptureScreenshot(driver, TestcaseID);  //TC100   //TC101
			}
			Home.logout();
			Home.Loginagain();
		}
		
		@AfterClass
		public void closebrowser(){
			driver.quit();
		
}
}