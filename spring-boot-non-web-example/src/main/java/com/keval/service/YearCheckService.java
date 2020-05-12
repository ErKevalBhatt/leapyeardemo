package com.keval.service;

import org.springframework.stereotype.Service;

@Service
public class YearCheckService {

    public boolean isLeapYear(String year) {
    	
    	try {
    		int inputYear = Integer.parseInt(year);
    		
    		if((inputYear % 400)==0) {
    			return true;
    		}else {
    			if((inputYear % 100)!=0) {
    				if((inputYear % 4)==0) {
        				return true;
        			}
    			}
    		}
    	}catch(NumberFormatException ex) {
    		System.out.println("Invalid input year: "+year);
    		throw ex;
    	}
    	
        return false;
    }

}
