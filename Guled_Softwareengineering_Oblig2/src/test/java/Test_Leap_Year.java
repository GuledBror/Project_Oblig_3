import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Leap_Year {

    @Test
    public void say_no_if_year_is_not_divisible_by_4() {
         LeapYear years = new LeapYear();

        assertFalse(LeapYear.isLeapYear(3));
        assertFalse(LeapYear.isLeapYear(5));
        assertFalse(LeapYear.isLeapYear(2));
        assertFalse(LeapYear.isLeapYear(1997));
    }

    @Test
    public void say_yes_if_year_is_divisible_by_4() {
        LeapYear LeapYears = new LeapYear();

        assertTrue(LeapYear.isLeapYear(0));
        assertTrue(LeapYears.isLeapYear(4));
        assertTrue(LeapYears.isLeapYear(8));
        assertTrue(LeapYears.isLeapYear(1996));
    }

    @Test
    public void say_no_if_year_is_divisible_by_100_but_not_by_400() {
        LeapYear LeapYears = new LeapYear();

        assertFalse(LeapYears.isLeapYear(100));
        assertFalse(LeapYears.isLeapYear(200));
        assertFalse(LeapYears.isLeapYear(300));
        assertFalse(LeapYears.isLeapYear(500));
        assertFalse(LeapYears.isLeapYear(1800));
    }

    @Test
    public void say_yes_if_year_is_divisible_by_400() {
        LeapYear LeapYears = new LeapYear();

        assertTrue(LeapYears.isLeapYear(0));
        assertTrue(LeapYears.isLeapYear(400));
        assertTrue(LeapYears.isLeapYear(800));
        assertTrue(LeapYears.isLeapYear(1200));
        assertTrue(LeapYears.isLeapYear(1600));
    }
}
























