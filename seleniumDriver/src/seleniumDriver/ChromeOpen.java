package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\SELENIUM\\New folder\\chromedriver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");//open web page
		String title=driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String windowname = driver.getWindowHandle();
		System.out.println(windowname);
		// to get source code for web page
		//String pageCode = driver.getPageSource(); 
		//System.out.println(pageCode);
		driver.close();
		
	}

}
