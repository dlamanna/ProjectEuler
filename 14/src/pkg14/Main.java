/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

/**
 *
 * @author phuzE
 */
public class Main {
    public static boolean isEven(int num) {
        if(num%2 == 0)
            return true;
        else
            return false;
    }
    public static int calculateCombo(int num) {
        int counter = 1;
        do {
            if(isEven(num)) {
                num = num/2;
            }
            else {
                num = ((num*3) + 1);
            }
            counter++;
        } while (num > 1);
        return counter;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int topCombo = 0;
        for(int i = 13;i<1000000;i++) {
            int temp = calculateCombo(i);
            if(temp > topCombo) {
                topCombo = temp;
                System.out.println("New High Score! " + i + ", (" + topCombo + ")");
            }
        }
    }
    
}
