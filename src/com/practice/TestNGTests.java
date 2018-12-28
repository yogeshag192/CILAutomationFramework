package com.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTests {

	
	@BeforeTest
	public void method1(){
		System.out.println("@BeforeTest Invoked");
	}
	
	@BeforeMethod
	public void method2(){
		System.out.println("@BeforeMethod Invoked");
	}
	
	
	@BeforeClass
	public void bcmethod3(){
		System.out.println("@BeforeClass Invoked");
	}
	
	@BeforeSuite
	public void bsmethod4(){
		System.out.println("@BeforeSuite Invoked");
	}

	
	
	@Test
	public void method3(){
		System.out.println("class1 Method 3 invoked..");
	}
	
	@Test
	public void method4(){
		System.out.println("class1 Method 4 invoked..");
	}
	
	
	
}
