package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC001_CreateLead extends ProjectHooks{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="Create a new Lead";
		authors="Babu";
		category ="SmokeNow12";
	}
	
	@Test()
	public void createLead() {
		
		new LoginPage()
			.doLogin()
			.clickCrmsfaLink()
			.clickLeadsLink()
			.clickCreateLeadLink()
			.enterFirstName("Babu")
			.enterLastName("Manickam")
			.enterCompanyName("TL")
			.clickCreateLeadButton()
			.verifyFirstName("Babu");

	}

}
