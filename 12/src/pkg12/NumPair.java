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
public class NumPair {
    public int num1;
    public int num2;
    NumPair(int _num1, int _num2) {
        num1 = _num1;
        num2 = _num2;
    }
    NumPair(int _num1, NumPair temp) {
        num1 = _num1;
        num2 = temp.num2;
    }
    NumPair(NumPair temp) {
        num1 = temp.num1;
        num2 = temp.num2;
    }
}
