
//import java.lang.constant.Constable;
public class LeapYear {

    // A year is a leap year if it is divisible by 4
    // A leap year has 366 days
    // Leap years occur every four years
    // Centurial years are leap years if they are divisible by 400

    // -----------------------------------------------------------------------

    // A year is not a leap year if it is not divisible by 4
    // If a year is not divisible by 400, but it is divisible by 100, then it is not a leap year

    // Year to be checked

    public static boolean isLeapYear(int year) {

        // A year is a leap year if it is divisible by 4
        // A year is not a leap year if it is not divisible by 4
        // If a year is not divisible by 400, but it is divisible by 100, then it is not a leap year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println(year + ": is a Leap year.");
            return true;
        } else {
            System.out.println(year + ": is Not a leap year.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int yearToCheck = 2024;
        isLeapYear(yearToCheck);
    }
}

















