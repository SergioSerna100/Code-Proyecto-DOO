package co.edu.uco.crosscutting.unittestting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelpersUnistTestCase {

	@Test
	void givenwWantValidateIfNullWhenObjectIsNullThenResultIsTrue() {
		//Arange: Initial Context
		String Object = null;
		
		//Act 
		boolean result = ObjectHelper.isNull(Object);
		
		//Assert 
		assertTrue (result);
	}
	
	@Test
	void givenwWantValidateIfNullWhenObjectIsNullThenResultIsFalse() {
		//Arange: Initial Context
		var Object = "";
		
		//Act 
		boolean result = ObjectHelper.isNull (Object);
		
		//Assert 
		assertFalse (result);
	}
	
	@Test
	void givenwWantGetOriginalValueIfObjectIsNotNullWhenObejectIsNotNullThenResultItIsTheSameObject () {
		//Arange: Initial Context
		var Object = "Casa";
		var defaultValue = "Default";
		
		//Act 
		var result = ObjectHelper.getDefault (Object, defaultValue);
		
		//Assert 
		assertEquals (defaultValue, result);
	}
	
	@Test
	void givenWantGetDefaultValueWhenObjectIsNullThenResultIsDefaultIsDefaultObject () {
		//Arange: Initial Context
		String Object = null;
		var defaultValue = "Default";
		
		//Act 
		var result = ObjectHelper.getDefault (Object, defaultValue);
		
		//Assert 
		assertEquals (defaultValue, result);
	}
}
