package org.tcs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Adcatin {
	
	@Test()
	 private void test21() {
		System.out.println("test21");
	}	
	
	@Test(retryAnalyzer=FailedTest.class)
	 private void test22() {
	 Assert.assertTrue(false);
	}
	
	   @Test()
	    private void test23() {
		System.out.println("test23");
}
}