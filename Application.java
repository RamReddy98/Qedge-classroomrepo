
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
#Feature 202 code added by Ram
public class gfg {
 
    // Function to add two binary strings
    static String add_Binary(String x, String y)
    {
  
        int num1 = Integer.parseInt(x,2);
        //converting binary string into integer(decimal number)
       
        int num2 = Integer.parseInt(y,2);
        //converting binary string into integer(decimal number)
       
       
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in sum
         
        String result = Integer.toBinaryString(sum);
        //Converting that resultant decimal into binary string
 
        return result;
    }
 
    // The Driver code
    public static void main(String args[])
    {
        String x = "011011", y = "1010111";
 
        System.out.print(add_Binary(x, y));
    }
}
}
