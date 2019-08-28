package com.acttime.customerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomerTest {
	
	@Test(groups= {"smokeTest"})
	public void createCustomerTest() {
		System.out.println("execute  createCustomerTest");
	}
	
	
	@Test
	public void modifyCustomerTest() {
		System.out.println("execute  createCustomerTest");
	}
	
	
	@Test
	public void searchCustomerTest() {
		System.out.println("search  createCustomerTest");
	}
	
	@Test
	public void deleteCustomerTest() {
		System.out.println("search  deleteCustomerTest");

	}
	
	@Test
	public void updateCustomerTest() {
		System.out.println("search  updateCustomerTest");

	}

}
