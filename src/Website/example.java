package Website;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Test";
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn_basic_example")).click();
		//Input Forms    
		WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Simple Form Demo"))).click();
		      driver.findElement(By.id("user-message")).sendKeys(message);
		      driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
		      
		      if(driver.getPageSource().contains(message)) {
		    	  System.out.println("Message printed is " + message );
		      }
		      driver.findElement(By.id("sum1")).sendKeys("10");
		      driver.findElement(By.id("sum2")).sendKeys("20");
		      driver.findElement(By.xpath("//button[@onclick='return total()']")).click();			    
		       JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("window.scrollBy(0,-500)");
		      
		   
		    /*
		  driver.findElement(By.xpath("//li[@class='tree-branch']child::ul;")).click();*/
		   
		      
		      
		     driver.findElement(By.linkText("Input Forms")).click();
		     driver.findElement(By.linkText("Checkbox Demo")).click();
		     driver.findElement(By.id("isAgeSelected")).click();
		        
		     List checkbox = driver.findElements(By.className("cb1-element"));
		     int checkboxSize=checkbox.size();
		     int countVal=0;
		    // ((WebElement) checkbox.get(1)).click(); 
		     for(int cCount=0; cCount<checkboxSize;cCount++) {
		    	if(((WebElement) checkbox.get(cCount)).isSelected()){
					System.out.println(cCount+" checkBox is selected ");
				}else{ 
			    	countVal++;
					System.out.println(cCount+" checkBox is not selected "); 
				} 
		     } 
		     if(countVal==checkboxSize) {
		    	 driver.findElement(By.id("check1")).click();
		     }
		     driver.findElement(By.linkText("Input Forms")).click();
		     driver.findElement(By.xpath("//a[@href='./basic-radiobutton-demo.html']")).click();
		     
		     driver.findElement(By.linkText("Input Forms")).click();
		     driver.findElement(By.xpath("//a[@href='./basic-radiobutton-demo.html']")).click();
		     
		     driver.findElement(By.xpath("//input[@value='Male']")).click();
		     driver.findElement(By.id("buttoncheck")).click();		     
		     List radiobutton = driver.findElements(By.xpath("//input[@name='optradio']"));
		     int radiobuttonChek=radiobutton.size();
		     String getRadioVal="";
		     for(int cCount=0; cCount<radiobuttonChek;cCount++) {	
		    	/*if(((WebElement) radiobutton.get(cCount)).isSelected()){
		    		getRadioVal=((WebElement) radiobutton.get(cCount)).getAttribute("value");
					System.out.println(" Radio is selected ");
				}else{ 
		    		getRadioVal=((WebElement) radiobutton.get(cCount)).getAttribute("value");
					System.out.println(" Radio is not selected ");
				} */	    	
		    	if(((WebElement) radiobutton.get(cCount)).isSelected()){
		    		getRadioVal=((WebElement) radiobutton.get(cCount)).getAttribute("value");
				}
		     }
		     System.out.println("Radio button '"+getRadioVal+"' is checked"); 
		     driver.findElement(By.xpath("//input[@value='Male']")).click();
		     driver.findElement(By.xpath("input[@value='5 - 15']")).click();
		    
	}
}
