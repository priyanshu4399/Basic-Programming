/*

02 - Print All Prime Till N.
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
*/

import java.util.*;

public class Main{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int low = scn.nextInt();
    int high = scn.nextInt();

    for (int num = low; num <= high; num++) {
      boolean prime = true;
      for(int div = 2; div*div<=num; div++){
          if(num % div ==0){
              prime=false;
              break;
          }
      }
      if(prime){
          System.out.println(num);
      }
    }
}
}