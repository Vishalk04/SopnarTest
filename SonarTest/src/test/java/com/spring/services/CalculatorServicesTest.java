package com.spring.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;


public class CalculatorServicesTest {

	@Test
	public void shouldReturnAdditionWhenPassedTwoInteger(){
		
		CalculatorServices calculatorServices = new CalculatorServices();
		
		assertEquals(new Integer(10), calculatorServices.add(5, 5) );
		
		
	}
	
	
	@Test
	public void shouldReturnAdditionWhenPassedNegativeNumbers(){
		
		CalculatorServices calculatorServices = new CalculatorServices();
		
		assertEquals(new Integer(-10), calculatorServices.add(-5,-5) );
		
	}
	

	@Test
	public void shouldReturnSubctractionForPositiveNumbers(){
		
		CalculatorServices calculatorServices = new CalculatorServices();
		
		assertEquals(new Integer(10), calculatorServices.subctract(15,5) );
		
		
	}
	@Test
	public void shouldReturnSubctractionForNegativeNumbers(){
		
		CalculatorServices calculatorServices = new CalculatorServices();
		
		assertEquals(new Integer(10), calculatorServices.subctract(5, -5) );
		
		
	}

}
