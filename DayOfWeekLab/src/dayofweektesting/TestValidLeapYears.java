package dayofweektesting;

import dayofweek.DayOfWeek;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test cases for "Day of week" lab assuming requirements set 
 * at top of DayOfWeek class
 * 
 * Test valid leap years
 * 
 * @author dplante
 *
 */
public class TestValidLeapYears {

	/**
	 * Test valid 2/29/XXXX dates
	 */
	@Test
	public void firstValidLeapYear() {
		DayOfWeek dow = new DayOfWeek(2, 29, 1904);
		assertTrue(dow.getDayOfWeek().compareTo("Monday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 2);
	}
	
	@Test
	public void secondValidLeapYear() {
		DayOfWeek dow = new DayOfWeek(2, 29, 1908);
		assertTrue(dow.getDayOfWeek().compareTo("Saturday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 0);
	}
	
	@Test
	public void thirdValidLeapYear() {
		DayOfWeek dow = new DayOfWeek(2, 29, 1912);
		assertTrue(dow.getDayOfWeek().compareTo("Thursday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 5);
	}
	
	@Test
	public void fourthValidLeapYear() {
		DayOfWeek dow = new DayOfWeek(2, 29, 1916);
		assertTrue(dow.getDayOfWeek().compareTo("Tuesday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 3);
	}
	
	/**
	 * Test boundary dates of2/28/XXXX and 3/1/XXXX for valid leap years
	 */
	@Test
	public void firstValidLeapYearBoundaries() {
		DayOfWeek dow = new DayOfWeek(2, 28, 1904);
		assertTrue(dow.getDayOfWeek().compareTo("Sunday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 1);
		dow = new DayOfWeek(3, 1, 1904);
		assertTrue(dow.getDayOfWeek().compareTo("Tuesday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 3);
	}

	@Test
	public void secondValidLeapYearBoundaries() {
		DayOfWeek dow = new DayOfWeek(2, 28, 1908);
		assertTrue(dow.getDayOfWeek().compareTo("Friday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 6);
		dow = new DayOfWeek(3, 1, 1908);
		assertTrue(dow.getDayOfWeek().compareTo("Sunday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 1);
	}

}

