package org.tcs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTest implements IRetryAnalyzer {
	
	int min=0,max=4;

	public boolean retry(ITestResult result) {
		
		if (min<max)
		{
		min++;
		return true;
		}
		return false;
	}
	
	
	

}
