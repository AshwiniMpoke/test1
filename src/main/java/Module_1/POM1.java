package Module_1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
         @FindBy(xpath="//input[@id=\"username\"]")   private WebElement UN;
         @FindBy(xpath="//input[@id=\"password\"]") private WebElement password;
         @FindBy(xpath="//input[@id=\"login\"]")  private WebElement Login;
         
         public POM1(WebDriver driver) {
        	 
        	 PageFactory.initElements(driver,this);
         }
         
         public void enterusername(String user) {
        	 UN.sendKeys(user);//velocity
       
         }
          public void Enterpassword(String pass) {
        	 password.sendKeys(pass); //U1YP1G
        	 
           }
          public void Clickloginbt() {
         	 
         	 Login.click();
          }

      
      

}
