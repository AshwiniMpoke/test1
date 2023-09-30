package Library_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_class {
	   
	//Name-Ashwini poke
	// Date- 13/09/2023
	//Day- Wednesday
	//to fatch the data from PF
	
	public static String getdatafromPF(String key) throws IOException {
		//to Reach upto Propertyfile
		FileInputStream file=new FileInputStream("C:\\Users\\Ashwini\\eclipse-workspace\\15_Apr_Selenium_maven\\Propfile.Properties");
	
	   //To create the properties class
		Properties Prop=new Properties();
		
		//To open the Property file
	   Prop.load(file);
	   
	   //to get the data from Property file
	  String Value1= Prop.getProperty(key); //Username
	    
	  return Value1;
	}
	//Name-Ashwini poke
	// Date- 14/09/2023
	//Day- Thus
	//to fatch the data from Excelsheet
	@Test
	public static String getdatafromexcel(int RowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\Ashwini\\eclipse-workspace\\15_Apr_Selenium_maven\\Testdata\\parameterization.xlsx");
		
		String value2=WorkbookFactory.create(file).getSheet("Sheet4").getRow(RowIndex).getCell(cellIndex).getStringCellValue();
		 
		return value2;
	}
	//Name-Ashwini poke
		// Date- 15/09/2023
		//Day- friday
		//to Get failed tc Screenshot
	@Test
	public static void CaptureScreenshot(WebDriver driver,String TestcaseID) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\Ashwini\\eclipse-workspace\\15_Apr_Selenium_maven\\Screenshot\\."+TestcaseID+".jpg");
		FileHandler.copy(source, Destination);
		
	}
}

