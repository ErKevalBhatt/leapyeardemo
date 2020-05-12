package com.keval.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class YearCheckServiceTest {

	@InjectMocks
	YearCheckService yearCheckService;
	
	@Test
	public void testFindTheLeapYear() {
		boolean result = yearCheckService.isLeapYear("2000"); 
		assertEquals(true, result);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInputValidation() {
		yearCheckService.isLeapYear("test"); 
	}
	
	@Test
	public void testFindTheLeapYearForDivBy100() {
		boolean result = yearCheckService.isLeapYear("1700"); 
		assertEquals(false, result);
	}
	
}
