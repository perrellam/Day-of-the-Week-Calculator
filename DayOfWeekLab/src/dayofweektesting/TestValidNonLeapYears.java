package dayofweektesting;

import dayofweek.DayOfWeek;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test cases for "Day of week" lab assuming requirements set 
 * at top of DayOfWeek class
 * 
 * Test non-leap years
 * 
 * @author dplante
 *
 */
public class TestValidNonLeapYears {

	/**
	 * Test first valid date
	 */
	@Test
	public void firstValidDay() {
		DayOfWeek dow = new DayOfWeek(1, 1, 1900);
		assertTrue(dow.getDayOfWeek().compareTo("Monday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 2);
	}
	
	/**
	 * Test last valid date
	 */
	@Test
	public void lastValidDay() {
		DayOfWeek dow = new DayOfWeek(12, 31, 2099);
		assertTrue(dow.getDayOfWeek().compareTo("Thursday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 5);
	}

	/**
	 * Test last valid date
	 */
	@Test
	public void otherValidDay1() {
		DayOfWeek dow = new DayOfWeek(12, 6, 1906);
		assertTrue(dow.getDayOfWeek().compareTo("Thursday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 5);
	}

	/**
	 * Test last valid date
	 */
	@Test
	public void otherValidDay2() {
		DayOfWeek dow = new DayOfWeek(12, 30, 1975);
		assertTrue(dow.getDayOfWeek().compareTo("Tuesday") == 0);
		assertTrue(dow.getNumericDayOfWeek() == 3);
	}


	/**
	 * Test all valid months
	 */
	@Test
	public void validMonths() {
		DayOfWeek dow = new DayOfWeek(1, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("January") == 0);
		dow = new DayOfWeek(2, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("February") == 0);
		dow = new DayOfWeek(3, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("March") == 0);
		dow = new DayOfWeek(4, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("April") == 0);
		dow = new DayOfWeek(5, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("May") == 0);
		dow = new DayOfWeek(6, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("June") == 0);
		dow = new DayOfWeek(7, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("July") == 0);
		dow = new DayOfWeek(8, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("August") == 0);
		dow = new DayOfWeek(9, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("September") == 0);
		dow = new DayOfWeek(10, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("October") == 0);
		dow = new DayOfWeek(11, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("November") == 0);
		dow = new DayOfWeek(12, 1, 1900);
		assertTrue(dow.getMonthString().compareTo("December") == 0);
	}


}
