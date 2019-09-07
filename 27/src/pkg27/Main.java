/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27;

/**
 *
 * @author phuzE
 */
public class Main {
    public static boolean isPrime(int num) {
        // return false on evens
        if(num % 2 == 0)
            return false;
        for(int i=3; i<=num/2; i++) {
           if(num%i==0)
               return false;
        }
        return true;
    }
    public static NumPair numPrimes(int a, int b) {
        int counter = 0;
        for(int n = 0;n <= Math.abs(a);n++) {
            int result = (int) Math.pow(n,2) + (a * n) + b;
            System.out.println("a: " + a + ",\tb: " + b);
            if(isPrime(result))
                counter++;
        }
        NumPair retPair = new NumPair(a,b,counter);
        return retPair;
    }
    public static NumPair numPrimes(int a) {
        NumPair highest = new NumPair();
        for(int b = -1000;b<=1000;b++) {
            NumPair temp = numPrimes(a,b);
            if(temp.numPrimes > highest.numPrimes) {
                highest = temp;
                System.out.println("\t\tNEW HIGH!: " + highest.a + " (" + 
                                    highest.numPrimes + ")");
            }
        }
        return highest;
    }
    public static NumPair permuteA() {
        NumPair highest = new NumPair();
        for(int a = -999;a < 1000;a++) {
            NumPair temp = numPrimes(a);
            if(temp.numPrimes > highest.numPrimes)
                highest = temp;
        }
        return highest;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //n^2 + an + b (a < 1000 and b <= 1000)
        NumPair highest = permuteA();
        //System.out.println("Number of primes: " + numPrimes(-79,1601));
        System.out.println("Highest Combo, a: " + highest.a + ", b: " + 
                            highest.b + " (" + highest.numPrimes + ")");
        System.out.println("Product: " + (highest.a * highest.b));
    }
    
}
