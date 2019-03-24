package TestGroupApp.TestGroupApp;

import org.junit.Test;

import junit.framework.Assert;

public class RomanConverterTest {
	@Test
	public void should_return_I_when_passed_1() {
		//arrange
		int number = 1;
		String expectedResult = "I";
		RomanConverter converter = new RomanConverter();
		
		//act
		String actualResult = converter.convert(number);
		
		//assert
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void should_return_II_when_passed_2() {
		//arrange
		int number = 2;
		String expectedResult = "II";
		RomanConverter converter = new RomanConverter();
		
		//act
		String actualResult = converter.convert(number);
		
		//assert
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void should_return_III_when_passed_3() {
		//arrange
		int number = 3;
		String expectedResult = "III";
		RomanConverter converter = new RomanConverter();
		
		//act
		String actualResult = converter.convert(number);
		
		//assert
		Assert.assertEquals(expectedResult, actualResult);
	}
}
