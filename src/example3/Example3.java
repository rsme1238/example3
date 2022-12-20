
package example3;

import java.util.Scanner;

public class Example3 {

  
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
             double b; 
            System.out.println("luften fonksiyonun kacinci dereceden oldugunu yaziniz");
           int n = input.nextInt();
           double a [] = new double [n+1];
           
            
        for(int i=0 ; i<=n; i++){
        
          System.out.println("x^" +i+"nin katsayisi: ");
          a[i]= input.nextInt();
       
        } 
         System.out.println("Hesaplanacak x degeri: "); 
          b = input.nextDouble();
          double t=a[0]; 
          for (int i=1; i <=n; i++){
          
              t+=a[i]*Math.pow(b, i);
          }
          
          System.out.println("Toplam: "+t);
    }
     
}
