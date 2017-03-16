import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearsTest {
  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYears leapYear = new LeapYears();
    assertEquals(true, leapYear.isLeapYear(2012));
  }
  @Test
  public void isLeapYear_forNumbersNotDivisibleByFour_false(){
    LeapYears leapYear = new LeapYears();
    assertEquals(false, leapYear.isLeapYear(1999));
  }
  @Test
  public void isLeapYear_forNumbersDivisibleByOneHundred_false(){
    LeapYears leapYear = new LeapYears();
    assertEquals(false, leapYear.isLeapYear(1900));
  }
  @Test
  public void isLeapYear_forMultiplesOfFourHundred_true() {
    LeapYears leapYear = new LeapYears();
    assertEquals(true, leapYear.isLeapYear(2000));
 }
}
