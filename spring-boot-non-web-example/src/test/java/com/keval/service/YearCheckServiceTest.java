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
	
	@Test
	public void testInputValidation() {
		boolean result = yearCheckService.isLeapYear("test"); 
		assertEquals(true, result);
	}
	
}
