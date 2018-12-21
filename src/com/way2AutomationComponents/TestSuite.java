package com.way2AutomationComponents;

import org.testng.annotations.Test;

import com.cil.ui.CILPageMethods;
import com.common.BaseTest;

public class TestSuite extends BaseTest {

	@Test
	public void VerifyAutoComplete() throws InterruptedException
	{
		
		AutoComplete acM = new AutoComplete(driver);
		System.out.println("Started execution of :: VerifyAutoComplete");
		acM.AutocompleteBox();
		System.out.println("Completed execution of :: VerifyAutoComplete");
		System.out.println("-----------------------------------------------------------------\n");
	}
	
	
	/*//@Test
	public void test7(){
	
		CILPageMethods cilM = new CILPageMethods(driver);
		System.out.println("Started execution of :: test7");
		cilM.VerifyTest7();
		System.out.println("Completed execution of :: test7");
		System.out.println("-----------------------------------------------------------------\n");
	
		
	}
	
	@Test
	public void VerifyOnGoingProjects() throws InterruptedException{
		
		CILPageMethods cilM = new CILPageMethods(driver);
		System.out.println("Started execution of :: VerifyOnGoingProjects");
		cilM.VerifyOnGoingProjects();
		System.out.println("Completed execution of :: VerifyOnGoingProjects");
		System.out.println("-----------------------------------------------------------------\n");
	
		
	}
	
	@Test (dependsOnMethods = "VerifyOnGoingProjects")
	public void VerifyToolsAndTechnologiesOnDashboard() throws InterruptedException{
		
		CILPageMethods cilM = new CILPageMethods(driver);
		System.out.println("Started execution of :: VerifyToolsAndTechnologiesOnDashboard");
		cilM.VerifyToolsAndTechnologiesOnDashboard();
		System.out.println("Completed execution of :: VerifyToolsAndTechnologiesOnDashboard");
		System.out.println("-----------------------------------------------------------------\n");
	
	}
	
	@Test (dependsOnMethods = "VerifyToolsAndTechnologiesOnDashboard")
	public void VerifyUpcomingEventsOnDashboard() throws InterruptedException{
		
		CILPageMethods cilM = new CILPageMethods(driver);
		System.out.println("Started execution of :: VerifyUpcomingEventsOnDashboard");
		cilM.VerifyUpcomingEventsOnDashboard();
		System.out.println("Completed execution of :: VerifyUpcomingEventsOnDashboard");
		System.out.println("-----------------------------------------------------------------\n");
	
	}*/
}
