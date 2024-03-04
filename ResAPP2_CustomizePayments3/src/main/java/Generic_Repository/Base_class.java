package Generic_Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Object_Repository.LoginApp;

public class Base_class {

	public WebDriver driver;

	public Notpad_data np;
	@BeforeClass
	public void ConnectBrowser() throws Throwable {
		System.out.println("==============Connect with Browser===========");
		np = new Notpad_data();
		String Browser = np.getPropertyKeyValue("browser");
		String URL = np.getPropertyKeyValue("url");
		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ResApp.implicitwait, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void LoginToApp() throws Throwable {
		System.out.println("============Login To the Application==========");
		LoginApp lp = new LoginApp(driver);
		lp.clickOn_LoginintoResApp_link();
		String Username = np.getPropertyKeyValue("username");
		String Password = np.getPropertyKeyValue("password");
		lp.loginInto_theResAppApplication(Username, Password);

	}

	@AfterMethod
	public void LogoutApplication() {
		System.out.println("==========Logout Application============");
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		System.out.println("===========Close Browser==========");
	}

}
