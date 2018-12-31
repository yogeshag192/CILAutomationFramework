package com.practice;

import org.testng.annotations.Test;

public class TestNGTests2 extends Config {
	
	@Test(groups="abc")
	public void method3(){
		System.out.println("TestNGTests2 Method 3 invoked..");
	}
	
	
	@Test(groups="abe")
	public void method4(){
		System.out.println("TestNGTests2 Method 4 invoked..");
	}
	

}

