package com.common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class LoginToApp extends Base {
	
	public LoginToApp(WebDriver driver) {
        super(driver);

    }

	public void loginToApplication(String portal) throws IOException, InterruptedException {
		System.out.println("In LoginToApplication Method");
    	
    	String appUrl, userName ,password;
       	    	
        switch (portal) {
        case "CIL":
        	appUrl = appProperties.getProperty("URLCIL") ;
        	userName = appProperties.getProperty("cilUsername");
        	password = appProperties.getProperty("cilPassword");
        	driver.get(appUrl);
        	 waitForPageToLoad(driver);
             //driver.manage().window().maximize();
             clickElement(getElementValue("loginLinkHomePage"));
             type(getElementValue("userNameTextBox"), getInputValue("cilUsername"));
             type(getElementValue("passwordTextBox"), getInputValue("cilPassword"));
             clickElement(getElementValue("loginButton"));
             System.out.println("Logged in Successfully to : " +appUrl );
            break;
            
        case "BLOCKCHAIN":
            
            break; 
            
        case "WAY2A":
        	appUrl = appProperties.getProperty("URLWay2A");
        	userName = appProperties.getProperty("way2UserName");
        	password = appProperties.getProperty("way2Password");
        	driver.get(appUrl);
            waitForPageToLoad(driver);
            driver.manage().window().maximize();
            waitForElementToBeClickable(getElementValue("signInLinkWay2"));
    		clickElement(getElementValue("signInLinkWay2"));
    		Thread.sleep(3000);
    		waitForElementToBeVisible(getElementValue("userNameWay2"));
    		type(getElementValue("userNameWay2"), getInputValue("way2UserName"));
    		type(getElementValue("PasswordWay2"), getInputValue("way2Password"));
    		clickElement(getElementValue("submitButtonWay2"));
    		Thread.sleep(9000);
            
            break;
        
            
        default:
            System.out.println("Something is wrong!!!!! Should not be in DEFAULT");
        }

    }
}
