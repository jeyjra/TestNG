package org.tcs;

import org.testng.annotations.Test;

public class Employee {
	
	@Test(groups= {"sanity,regression"})
	 private void test11() {
		System.out.println("test11");
	}	
	
	@Test(groups="E2E")
	 private void test12() {
		System.out.println("test12");
	}
	
	@Test(groups="regression")
	 private void test13() {
		System.out.println("test13");
	}
	
	@Test(groups="Somke")
	 private void test14() {
		System.out.println("test14");
	}
	
	
	

}
