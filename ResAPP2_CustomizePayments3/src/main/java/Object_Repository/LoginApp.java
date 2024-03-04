package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginApp {

	public LoginApp(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(@class,'secondary wide')]")
	private WebElement associatemarriott_link;

	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;

	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;

	@FindBy(xpath="//button[text()='Sign On']")
	private WebElement signIn_btn;

	public WebElement getAssociatemarriott_link() {
		return associatemarriott_link;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSignIn_btn() {
		return signIn_btn;
	}
	
	public void clickOn_LoginintoResApp_link() throws Throwable {
		associatemarriott_link.click();
		Thread.sleep(2000);
	}
	
	public void loginInto_theResAppApplication(String username,String password) throws InterruptedException 
	{
		userName.sendKeys(username);
		Thread.sleep(1500);	
		passWord.sendKeys(password);
		signIn_btn.click();
		Thread.sleep(7000);
	}

}
