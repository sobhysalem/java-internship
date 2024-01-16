
package projact1;

import java.util.Scanner;

public class Projact1 {

    public static void print(int x){
           if(x%2==0){
                 System.out.print("even");
             }
             else System.out.print("odd");
     }
    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
             int x = scn.nextInt();
            print(x);
    }
    
}
