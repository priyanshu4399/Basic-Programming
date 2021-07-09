/*

Gcd And Lcm
Easy  Prev   Next
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.

*/

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int a = n1;
      int b = n2;
    
      while(a % b != 0){
          int rem = a % b;
          a = b;
          b = rem;
      }
      int gcd = b;
      int lcm = (n1 * n2)/ gcd;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }