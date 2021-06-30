package org.def;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunAuto implements IRetryAnalyzer {
	int min = 0;
	int max = 2;

	public boolean retry(ITestResult result) {
	  if(min<max) {
		  min++;
		  return true;
	  }
		return false;
	}
}
