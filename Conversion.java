import java.util.Scanner;
import java.text.NumberFormat;
public class Conversion {
    // we neeed to create 2 array for store 1 to 19 and second array fr store 20,30,...90
    public static String fun(final int n)
    {
        String str = "";
      String [] units = { " "," One "," Two "," Three "," Four "," Five "," Six "," Seven "," Eight ",
        " Nine "," Ten "," Eleven "," Twelve "," Thirteen "," Fourteen "," Fifteen "," Sixteen "," Seventeen ",
        " Eighteen "," Nineteen ",
    };
      String [] tens = { " "," "," Twenty "," Thirty "," Fourty "," Fifty "," Sixty "," Seventy "," Eighty ","Ninety"};
      //code to convert
      if(n<20)
      { str = units[n];
      
      }
      else if (n>=20 && n<100) {
          str = tens[n/10] + units[n%10];
      }
      return str;
      
    }
    public static String convert(int num) {
        
    String st = " ";
    if (num<100) {
        
    st = fun(num);
    }
    else if (num>=100 && num<1000){  //hundred 
    st = fun(num/100)  +  "Hundred" + convert(num % 100);
    }
    else if (num>= 1000 && num<100000){ // Thousand 
     st = fun(num/1000) + "Thousand" + convert(num % 1000);
        
    }
    else if (num>=100000 && num<10000000) {  //Lakh  
     st = fun(num/100000) + "Lakh" + convert(num % 100000);
    }
    else if (num>= 10000000 && num<1000000000) {  //Crore 
     st = fun(num/10000000) + "Crore" + convert(num % 10000000);
        
    }
    return st;
    
    }
    
    
    public static void main(String [] args)
    {
   
    int n;
    
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number");
     n = Integer.parseInt(sc.nextLine());
     System.out.println(NumberFormat.getInstance().format( n)+ " " + " "  +  convert( n) +  " ");
     
     
    }
    
}
