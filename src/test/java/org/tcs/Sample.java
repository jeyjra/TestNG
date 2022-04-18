package org.tcs;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(groups="E2E")
	 private void test1() {
		System.out.println("test1");
	}	
	
	@Test(groups="sanity")
	 private void test2() {
		System.out.println("test2");
	}
	
	@Test(groups= {"Somke,E2E"})
	 private void test3() {
		System.out.println("test3");
	}
	
	@Test(groups="regression")
	 private void test4() {
		System.out.println("test4");
	}
	
	
	
	}

