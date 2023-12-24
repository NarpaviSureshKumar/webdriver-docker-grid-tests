package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC002_CreateLead extends ProjectHooks{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Lead";
		testDescription ="Create a new Lead";
		authors="Babu";
		category ="Sanity";
	}
	
	@Test()
	public void createLead2() {
		
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