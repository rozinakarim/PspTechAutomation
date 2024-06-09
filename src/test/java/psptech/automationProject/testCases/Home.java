package psptech.automationProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import psptech.automationProject.baseClass.BaseClass;
import psptech.automationProject.browserFactory.BrowserFactory;
import psptech.automationProject.pages.HomePage;
import psptech.automationProject.pages.SoftwareDevelopmentPage;
import psptech.automationProject.utilities.CommonMethods;

public class Home extends BaseClass{

	public Home(WebDriver driver) {
		super(driver);
	}

	HomePage homepage;
	SoftwareDevelopmentPage softDev;
	
	@BeforeTest
	public void setup() {
	    driver= BrowserFactory.initiateBrowser();
	    logger.info("Browser is getting Initialized in Before Test");
	    homepage = PageFactory.initElements(driver, HomePage.class);
	    CommonMethods.maximizeBrowser();
	    }

	@Test
	public void TC_001_clickOnHomeButton_HomePage() {
		logger.info("PSP Tech HomePage Name is Displayed"); 
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
		CommonMethods.click(homepage.clickHomePage_1, driver);
	}

	@Test
	public void TC_002_discoverMore5_HomePage() {
		 logger.info("Homepage DiscoverMore5 clicked");
		 CommonMethods.click(homepage.clickDiscoverMore_5, driver);
		 CommonMethods.getTitle(driver, "Software Development - PSPTech");
		 CommonMethods.click(homepage.clickHomePage_1, driver);
		 logger.info("Returned to HomePage");	 
	}
	@Test
	public void TC_003_discoverMore1_HomePage() {
	 logger.info("Homepage DiscoverMore1 clicked");	 
	 CommonMethods.click(homepage.clickDiscoverMore_1, driver);
	 CommonMethods.getTitle(driver, "Software Development - PSPTech");
	 CommonMethods.click(homepage.clickHomePage_1, driver);
	logger.info("Returned to HomePage");
	}
	@Test
	public void TC_004_appDevelopment_HomePage() {
	logger.info("HomePage AppDevelopment4 clicked");
	CommonMethods.click(homepage.appDevelopment_4, driver);
	CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_005_websiteDevelopement_HomePage () {
		logger.info("HomePage websiteDevelopment5 clicked");
		CommonMethods.click(homepage.websiteDevelopment_5, driver);
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_006_APIIntegreationDevelopment_HomePage() {
		logger.info("HomePage APIIntegrationDevelopment_6 clicked");
		CommonMethods.click(homepage.apiIntegrationDevelopement_6, driver);
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_007_webMobileApplication_HomePage() {
		logger.info("HomePage WebApplication_7 clicked");
		CommonMethods.click(homepage.webMobileApplication_7, driver);
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_008_SpeedOptimization_HomePage() {
		logger.info("HomePage SpeedOptimization_9 clicked");
		CommonMethods.click(homepage.SpeedOptimization_9, driver);
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_009_middleAboutUS_HomePage() {
		logger.info("HomePage middleAboutUs clicked");
		CommonMethods.click(homepage.middleAboutUS, driver);
		CommonMethods.getTitle(driver, "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	}
	@Test
	public void TC_010_footerContactUs_HomePage() {
		logger.info("HomePage footerContactUs clicked");
		CommonMethods.click(homepage.footerContactUs_4, driver);
		CommonMethods.getTitle(driver, "Contact Us - PSPTech");
		CommonMethods.click(homepage.clickHomePage_1, driver);
		logger.info("Returned to HomePage");
	}

	@Test
	public void tearDown() {
	logger.info("Testing for HomePage_TS_001 Completed");
	CommonMethods.closeBrowser();
}
	
}
