package Website;

import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/");
	}

}
