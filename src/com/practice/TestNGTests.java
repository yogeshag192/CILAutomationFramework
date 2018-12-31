package com.practice;

import com.practice.Config;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTests extends Config {

	
	@Test(groups = "abc")
	public void method3(){
		System.out.println("class1 Method 3 invoked..");
	}
	
	
	@Test(groups = "abe")
	public void method4(){
		System.out.println("class1 Method 4 invoked..");
	}
	
	
	
}
