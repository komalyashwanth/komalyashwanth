import java.util.*;
class error4
{
     public static void main(String args[])
     {   
         Scanner sc = new Scanner(System.in);
         float c;
         System.out.println("Enter Fahrenheit Temperature:");
         float f = sc.nextInt();
         c = (f-32)*5//s9;
         System.out.println("Celsius Temperature is :"+c);
     }
}