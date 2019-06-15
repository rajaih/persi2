package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\FireFOx-43.0Version\\New folder\\geckodriver.exe");
		WebDriver driver;
       driver = new FirefoxDriver();
       
       
	}

}
