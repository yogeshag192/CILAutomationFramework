package com.way2AutomationComponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.common.Base;
import com.common.BaseTest;


public class AutoComplete extends Base {
	
	public AutoComplete(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void AutocompleteBox() throws InterruptedException{
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//figure/img[contains(@src,'autocomplete')]"));
		
		action.moveToElement(element).build().perform();
		System.out.println("Moved to element : " +element.getAttribute("src"));
		action.click(element).perform();
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='example-1-tab-1']//iframe[@class = 'demo-frame']")));
		WebElement autoCompleteTextBox = driver.findElement(By.id("tags"));
		autoCompleteTextBox.sendKeys("A");
		Thread.sleep(2000);
		WebElement options = driver.findElement(By.xpath("//ul[@id = 'ui-id-1']/li[contains(text(),'AppleScript')]"));
		options.click();
		System.out.println("Selected first option in auto complete box : " +options.getText().toString());
		
		
		
		
	}


}
