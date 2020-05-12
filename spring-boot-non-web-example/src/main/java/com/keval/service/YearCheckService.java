package com.keval.service;

import org.springframework.stereotype.Service;

@Service
public class YearCheckService {

    public boolean isLeapYear(String year) {
    	
    	try {
    		int inputYear = Integer.parseInt(year);
    		
    		if((inputYear % 400)==0) {
    			return true;
    		}
    	}catch(NumberFormatException ex) {
    		throw ex;
    	}
    	
        return false;
    }

}
