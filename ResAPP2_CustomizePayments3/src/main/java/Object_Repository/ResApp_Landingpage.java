package Object_Repository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic_Repository.WebDriverUtiles;

public class ResApp_Landingpage {

	public WebDriver driver;

	public WebDriverUtiles wb = new WebDriverUtiles() ;
	
	public ResApp_Landingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@placeholder='Enter Hotel Name']")
	private WebElement destination;

	@FindBy(xpath = "//*[@data-value='NYCMQ']")
	private WebElement chooseHotelName;

	@FindBy(xpath = "//*[contains(@class,'right_small')]//*[@class='slds-form-element__control']//*[@class='slds-checkbox']")
	private WebElement redemption_points;

	@FindBy(xpath = "//*[contains(@class,'date-input')]//*[contains(@class,'slds-p-right_medium')]")
	private WebElement check_In_dates;

	@FindBy(xpath = "//button[@class='next-month-btn slds-button slds-button_icon slds-button_icon-container text-xs']")
	private WebElement chevron_RightBtn;

	@FindBy(xpath = "//*[@class='calendar']//*[contains(@aria-labelledby,'next-month')]//*[contains(@class,'slds-grid')]//*[text()='12']")
	private WebElement chooseDate_startdate;

	@FindBy(xpath = "//*[@class='calendar']//*[contains(@aria-labelledby,'next-month')]//*[contains(@class,'slds-grid')]//*[text()='17']")
	private WebElement chooseDate_enddate;

	@FindBy(xpath = "//*[@class='d-grid']")
	private WebElement find_btn;

	public WebElement getdestination() {
		return destination;
	}

	public WebElement getChooseDate_enddate() {
		return chooseDate_enddate;
	}

	public WebElement getRedemption_points() {
		return redemption_points;
	}

	public WebElement getCheck_In_dates() {
		return check_In_dates;
	}

	public WebElement getChevron_RightBtn() {
		return chevron_RightBtn;
	}

	public WebElement getChooseDate() {
		return chooseDate_startdate;
	}

	public WebElement getFind_btn() {
		return find_btn;
	}

	public WebElement getChooseHotelName() {
		return chooseHotelName;
	}

	public void EnterDetailsOn_RAlandingPage(WebDriver driver,String hotelName) throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		destination.sendKeys("NYCMQ", Keys.ARROW_DOWN);
		Thread.sleep(6000);
		wb.moveToExpectedElemnet(driver, check_In_dates);
		chooseHotelName.click();
		Thread.sleep(3000);
		redemption_points.click();
		Thread.sleep(1500);
		check_In_dates.click();
		Thread.sleep(1500);
		chevron_RightBtn.click();
		chooseDate_startdate.click();
		Thread.sleep(1500);
		chooseDate_enddate.click();
		Thread.sleep(2000);
		
	}
	
	public void clickOnFindButton() {
		find_btn.click();
	}

}
