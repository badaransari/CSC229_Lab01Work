
package com.mycompany.csc229_lab1work;


public class LabWork {
    
    static int getSumOfPrimesWithDigit(int n){
            int sum = 0;
            for (int i = 2; i <= n; i++)
                if (isPrime(i)&& checkDigit(i,3))
                  sum = sum + i;
                  
            return sum;
    }
    static boolean isPrime(int x ) {
           for (int i=2; i<x; i++)
               if (x%i == 0)
                  return false;
           return true;
}
  
    static boolean checkDigit (int x, int digit){
        String str = ""+x ;
        return str.contains(""+ digit);
        
    }
    
    static int getSumOfPrimesWith2Digits(int n){
            int sum = 0;
            for (int i = 2; i <= n; i++){
                if (isPrime(i)&& checkDigit(i,3)&& checkDigit(i,5)){
                  sum = sum + i;
                }
            }
            return sum;
    }
    
  public static void main (String[] args) {
    System.out.println(getSumOfPrimesWith2Digits(100));
        }
}