package ResApp2_Execution;

import org.testng.annotations.Test;

import Generic_Repository.Base_class;
import Generic_Repository.Excel_data;
import Object_Repository.RLM_MenuPage;
import Object_Repository.ResApp_Landingpage;

public class ResApp_executionDemo extends Base_class {

	@Test
	public void ResApp2_Test() throws Throwable {
		Excel_data ex = new Excel_data();
		String destinationPlace = ex.getExcelData("Test_data", 0, 1);
		System.out.println("=========Test Passed=========");
		ResApp_Landingpage rl = new ResApp_Landingpage(driver);
		rl.EnterDetailsOn_RAlandingPage(driver, destinationPlace);
		rl.clickOnFindButton();
		Thread.sleep(5000);
		
		RLM_MenuPage rm = new RLM_MenuPage(driver);
		rm.clickon_customizeandverify_texts(driver);
		Thread.sleep(5000);
	}
}
