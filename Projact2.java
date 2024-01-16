
package projact2;

import java.util.Scanner;
 
public class Projact2 {
public static void print(int n){
       int n2=n;
        while (n<=100) {
            System.out.print(n+" ");
            n+=n2;
        }
}
     
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        print(n);
    }
    
}
