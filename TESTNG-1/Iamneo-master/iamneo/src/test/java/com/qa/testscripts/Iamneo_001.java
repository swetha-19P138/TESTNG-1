package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iamneo_001 extends Testbase {
	
	@Test
	public void testcase_001() throws InterruptedException {
		
		Thread.sleep(4000);
		Assert.assertEquals(Driver.getTitle(),"Learning and assessment solution for Universities and Enterprises");
		
		Driver.navigate().to("https://www.facebook.com");
		Driver.navigate().back();
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().forward();
		Driver.navigate().refresh();
		
	}
}
