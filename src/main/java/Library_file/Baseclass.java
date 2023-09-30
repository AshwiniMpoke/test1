package Library_file;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Baseclass {
	
	public WebDriver driver;
	
	public void Initilisation()
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		 
		  driver=new ChromeDriver(CO); 
		
		//To enter URL/Open an Application
		 driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			
		 driver.manage().window().maximize(); 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	}
}
