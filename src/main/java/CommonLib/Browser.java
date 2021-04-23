package CommonLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public WebDriver driver;
	public void web(String URL) {
//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
//		driver.navigate().to(URL);
//		driver.manage().window().maximize();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();

//		WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions(); 
//        options.addArguments("disable-infobars");
//        options.addArguments("--disable-extensions");
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability(ChromeOptions.CAPABILITY, options);
//        driver = new ChromeDriver(options);
//        driver.navigate().to(URL);
//        driver.manage().window().maximize();
		
	}

}
