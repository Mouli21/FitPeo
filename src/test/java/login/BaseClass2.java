package login;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utils.ExcelDataIntegeration;

public class BaseClass2 {
	
	WebDriver driver= new ChromeDriver();
	Actions action = new Actions(driver);
	
	@Test
	public void condition() throws InterruptedException  {

	WebDriverManager.chromedriver().setup();
	driver.get("https://fitpeo.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	try {
	driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-1aspamu'])[5]")).click();
	action.scrollByAmount(0, 500).perform();
	
	

	driver.findElement(By.id(":r0:")).click();
	WebElement findElement = driver.findElement(By.id(":r0:"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].value='';", findElement);
    WebElement findElement2 = driver.findElement(By.id(":r0:"));
    
    driver.findElement(By.id(":r0:")).sendKeys("560");

	action.scrollByAmount(0, 500).perform();
	}catch (ElementNotInteractableException e) {
		throw new RuntimeException();
	}
	String expectedVale="560";
	
	String s1 = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt']")).getText();
	
	System.out.println("first box element value is :" +s1);
			try {	
	        	  if (s1.equals("CPT-99091"))
		      		{
	        		  
	        		  //<WebElement> findElements1 = driver.findElements(By.xpath("//p[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		      
		      			WebElement findElement3 = driver.findElement(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		      			boolean selected = findElement3.isSelected();
		      			System.out.println(selected);
		      			if (!selected) 
		      			{
							findElement3.click();
						}
	      
		      		    }
	        	  
	        	  String s2 = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt'])[2]")).getText();
	        		
	        		System.out.println("Second box element value is :" +s2);
	        					
	        		        	  if (s2.equals("CPT-99453"))
	        			      		{
	        		        		  
	        		        		  //<WebElement> findElements1 = driver.findElements(By.xpath("//p[@class='PrivateSwitchBase-input css-1m9pwf3']"));
	        			      
	        			      			WebElement findElement1 = driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]"));
	        			      			boolean selected = findElement1.isSelected();
	        			      			System.out.println(selected);
	        			      			if (!selected) 
	        			      			{
	        								findElement1.click();
	        							}
	        		      
	        			      		    }

	        		        	  String s3 = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt'])[3]")).getText();
	        		        		
	        		        		System.out.println("Third box element value is :" +s3);
	        		        					
	        		        		        	  if (s3.equals("CPT-99454"))
	        		        			      		{
	        		        			      
	        		        			      			WebElement findElement4 = driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]"));
	        		        			      			boolean selected = findElement4.isSelected();
	        		        			      			System.out.println(selected);
	        		        			      			if (!selected) 
	        		        			      			{
	        		        								findElement4.click();
	        		        							}
	        		        		      
	        		        			      		    }
	
			}catch (Exception e) {
				System.err.println(e);
			}
	
	String text = driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']/p")).getText();
	System.out.println(text);
	String replace = text.replace("$", "");
	System.out.println(replace);
	
	
	String v1 = driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt']")).getText();
	
	String v2 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt'])[2]")).getText();
	System.out.println("One Time Reimbursement value is: "+v2);
	double value = Double.parseDouble(v2);
	double d = Double.parseDouble(expectedVale);
	double val = value * d;
	BigDecimal bd = new BigDecimal(val);
	bd= bd.setScale(2, RoundingMode.HALF_UP);
	double round = bd.doubleValue();
	System.out.println(round);
	
	String text2 = driver.findElement(By.xpath("//p[text()='One Time Reimbursement for all Patients Annually:']//p")).getText();
	System.out.println(text2);
	String rep = text2.replace("$", "");
	System.out.println(rep);
	
	double dd = Double.parseDouble(rep);
	
	String v3 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-1s3unkt'])[3]")).getText();
	
int num1 = Integer.parseInt(v1);
int num2 = Integer.parseInt(expectedVale);

int num = num1 * num2;


int m1 = Integer.parseInt(v3);
int m2 = Integer.parseInt(expectedVale);

int m = m1 *m2;



System.out.println("Total recurring reimbursement value manual calculation of V1 is :"+ num);

System.out.println("Total recurring reimbursement value manual calculation of V3 is :"+ m);

int num4 = Integer.parseInt(replace);

int finalValue = num + m;

if (finalValue==num4)
{
	System.out.println("Script is passed successfully...!");
}
else {
	System.out.println("Kindly verify the script again..! Somewhere went wrong");
}

if (round==dd)
{
	System.out.println("One time reimbursement value is successfully converted");
}
else {
	System.out.println("Conversion of double & string is wrong. Check the script again");
}

}
	}


