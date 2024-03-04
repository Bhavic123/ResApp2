package Object_Repository;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Repository.WebDriverUtiles;

public class RLM_MenuPage {

	public WebDriverUtiles wb = new WebDriverUtiles();
	
	public RLM_MenuPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//*[@class='slds-p-left_medium']//*[contains(@title,'CUSTOMIZE')])[1]")
	private WebElement scrollToCustomizeBtn;
	
	@FindBy(xpath = "//div[@class='border-top']")
	private WebElement border_text;

	
	public WebElement getScrollToCustomizeBtn() {
		return scrollToCustomizeBtn;
	}

	public WebElement getBorder_text() {
		return border_text;
	}
	
	public void clickon_customizeandverify_texts(WebDriver driver) throws Throwable {
		wb.waitAndClick(driver, scrollToCustomizeBtn);
		wb.scrollToElement(driver, scrollToCustomizeBtn);
		scrollToCustomizeBtn.click();
	    wb.waitforElementToVisibale(driver, border_text);
		String border_info = border_text.getText();
		System.out.println("Expected Border Info text is : "+ border_info );
	}
	
	
}
