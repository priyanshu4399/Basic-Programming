
/*Digits Of A Number
Easy  Prev   Next
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
*/

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int t = n;
      int c = 0;
      while(t!=0){
        t = t/10;
        c++;
      }
    
        int div=(int)Math.pow(10,c-1);
        while(div!=0){
            System.out.println(n/div);
            n = n % div;
            div = div /10;
            
        }
     }
    }