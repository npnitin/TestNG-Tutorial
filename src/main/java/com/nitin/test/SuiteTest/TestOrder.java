package com.nitin.test.SuiteTest;

import org.testng.annotations.Test;

public class TestOrder {

	@Test(groups={"orderBo", "save"},dependsOnMethods={"testMakeEmptyOrder"})
	public void testMakeOrder() {
	  System.out.println("testMakeOrder");
	}

	@Test(groups={"orderBo", "save"})
	public void testMakeEmptyOrder() {
	  System.out.println("testMakeEmptyOrder");
	}
	
	@Test(groups="orderBo",dependsOnMethods={"testMakeOrder"})
	public void testFindOrder() {
		System.out.println("testFindOrder");
	}

	@Test(groups="orderBo",dependsOnMethods={"testFindOrder"})
	public void testUpdateOrder() {
		System.out.println("testUpdateOrder");
	}

	

}
