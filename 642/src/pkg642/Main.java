/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg642;

import java.math.BigInteger;

/**
 * @author phuzE
 */
public class Main {
    public static boolean isPrime(int num) {
        if(num == 2)
            return true;
        
        // return false on evens
        if(num % 2 == 0)
            return false;
        for(int i=3; i<=num/2; i++) {
           if(num%i==0)
               return false;
        }
        return true;
    }
    public static int largestFactor(int num) {
        int retNum = -1;
        if(isPrime(num))
            retNum = num;
        
        for(int i = 2;i<num;i++) {
            if(num%i == 0) {
                int temp = num/i;
                if(isPrime(temp)) {
                    return temp;
                }
            }
        }
        return retNum;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger factorMe = new BigInteger("201820182018");
        BigInteger sumFactors = new BigInteger("0");
        for(int i = 2;BigInteger.valueOf(i).compareTo(factorMe) < 0;i++) {
            int temp = largestFactor(i);
            System.out.println("Largest factor of " + i + ": " + temp);
            sumFactors.add(BigInteger.valueOf(temp));
        }
        System.out.println("Sum of factors: " + sumFactors);
        //int finalAnswer = sumFactors % (int)(Math.pow(10,9));
    }
    
}
