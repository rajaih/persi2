package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\InternetExplorer\\IEDriverServer.exe");
		WebDriver driver;
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.close();

	}

}
