/*write a program that prompts user for input
of annual income, and then displays which 
tax bracket the annual income falls into
*/ 

//importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class IncomeTax {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter your annual income: ");
      double annual_income = scanner.nextDouble();

      String tax_bracket = "";//declaring a string named tax_bracket and
                              //setting its value to empty string
                                 
      if (annual_income <= 50000) {
         tax_bracket = "5";//less than or equal to 50000
      }  else if (50000 < annual_income && annual_income <= 100000) {
         tax_bracket = "15";//greater than 50000 and less than or equal to 100000
      }  else if (100000 < annual_income && annual_income <= 150000) {
         tax_bracket = "25";//greater than 100000 and less than or equal to 150000  
      }  else if (150000 < annual_income && annual_income <= 250000) {
         tax_bracket = "35";//greater than 150000 and less than or equal to 250000
      }  else if (250000 < annual_income && annual_income <= 500000) {
         tax_bracket = "45";//greater than 250000 and less than or equal to 500000
      }  else if (500000 < annual_income) {
         tax_bracket = "50";//greater than 500000
      }  else {
         tax_bracket = "oops, logic fail...";
      }
      String annual_income_string = String.format("$10.2f", annual_income);  
      System.out.println("Annual Income: $" + annual_income + "\tTax Bracket: " + tax_bracket + "%" ); 

   }      
}//end of class IncomeTax