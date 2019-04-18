package Website;

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
		     WebElement checkbox = driver.findElement(By.className("cb1-element"));
		     Dimension numberofcheckbox = checkbox.getSize();
		     for(int i = 0 ;i <=4;i++)
		     {
		    

		   //If the checkbox is unchecked then isSelected() will return false 
		   //and NOT of false is true, hence we can click on checkbox
		   if(!checkbox.isSelected())
		   {
		   	checkbox.click();
		     }
		    
	}

	}
}
