package com.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Config {

	
	@BeforeTest
	public void method1(){
		System.out.println("@BeforeTest Invoked");
	}
	
	@BeforeMethod
	public void method2(){
		System.out.println("@BeforeMethod Invoked");
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void method3(){
		System.out.println("@BeforeClass Invoked");
	}
	
	@BeforeSuite(alwaysRun = true)
	public void method4(){
		System.out.println("@BeforeSuite Invoked");
	}
}
