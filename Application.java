
public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1900;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
#feature201 changes done by Ram
import java.io.*;
 
class GFG {
    public static void main(String args[])
    {
        // We can change values here for
        // different inputs
        float P = 1, R = 1, T = 1;
 
        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
}
