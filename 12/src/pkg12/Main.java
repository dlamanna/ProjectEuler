/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

/**
 *
 * @author phuzE
 */
public class Main {
    public static NumPair calculateTriangleNumber(NumPair pair) {
        int temp = pair.num1;
        NumPair retPair;
        if(temp == 1)
            retPair = new NumPair(pair.num1,pair.num2);
        else
            retPair = new NumPair(pair.num1,pair.num2+temp);
        return retPair;
    }
    public static int calculateDivisors(int triangleNum) {
        int numDivisors = 2;    //start at 2 so we always include 1 and number
        if(triangleNum == 1)
            return 1;
        else if(triangleNum == 2)
            return 2;
        else if(triangleNum == 4)
            return 3;
        
        for(int i = 2;i<triangleNum/2;i++) {
            if(triangleNum%i == 0) {
                if(triangleNum/i == i)
                    numDivisors++;
                else if(i > triangleNum/i)
                    numDivisors+=0;
                else
                    numDivisors+=2;
            }
        }
        return numDivisors;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numDivisors = 0;
        int num = 1;
        NumPair trianglePair = new NumPair(1,1);
        while(numDivisors <= 500) {
            trianglePair = new NumPair(num,calculateTriangleNumber(trianglePair));
            int triangleNumber = trianglePair.num2;
            numDivisors = calculateDivisors(triangleNumber);
            System.out.println("Triangle Number: " + triangleNumber + 
                                ",\tDivisors: " + numDivisors);
            num++;
        }
    }
    
}
