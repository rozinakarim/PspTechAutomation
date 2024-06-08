package psptech.automationProject.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import psptech.automationProject.baseClass.BaseClass;

public class AboutUsPage extends BaseClass {

	public AboutUsPage() {
		super(driver);
	}
	
	@FindBy (xpath= "(//a[@href='#doctor'])[1]")
	public WebElement DoctorClick;

	@FindBy (xpath= "(//a[@href='https://telocuretest.com/register/doctor'])[1]")
	public WebElement DoctorJoinNowClick;

	@FindBy (xpath= "(//a[@href='https://telocuretest.com/login/doctor'])[1]")
	public WebElement DoctorSignInClick;	

}
