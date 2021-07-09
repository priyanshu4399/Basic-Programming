/*
Pythagorean Triplet

1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max = a;
    if(b > max)
        max = b;
    if(c > max)
        max = c;
    if(max==a)
        System.out.println(a*a == b*b + c*c);
    else if(max==b)
        System.out.println(b*b == a*a + c*c);
    else 
        System.out.println(c*c == a*a + b*b);
   }
  }