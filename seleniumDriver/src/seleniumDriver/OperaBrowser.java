package seleniumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OperaBrowser {

	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\admin\\opera-64\\operadriver_win64\\operadriver.exe");
		//DesiredCapabilities c = DesiredCapabilities.opera();
		//c.setCapability("opera.binary", "C:\\Users\\admin\\opera-64\\operadriver_win64\\operadriver.exe");
         WebDriver driver ;
         driver = new OperaDriver();
         driver.manage().window().maximize();
         driver.close();
	

}
}

