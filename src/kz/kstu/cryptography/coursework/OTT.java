package kz.kstu.cryptography.coursework;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1234
 */
public class OTT {
    
    public static List<Integer> SE(int n) {
    List<Integer> numbers = new ArrayList<Integer>();
    //заполнение списка числами от 2 до n-1
    for (int i = 2; i < n; i++) {
        numbers.add(i);
    }

    for (int i = 0; i < numbers.size(); i++) {
        for (int j = 2; j < n; j++) {
            //удаляем кратные числа из списка
            numbers.remove(Integer.valueOf(numbers.get(i) * j));
        }
    }

    return numbers;
}
    
    public static int gcd(int a, int b) {
    while (b != 0) {
        int remainder = a % b;
        a = b;
        b = remainder;
    }
    return a;
}
    
public static int kkk(int baseNum, int exponent, int modulus) {
    int result = 1;
    while (exponent > 0) {
        if (exponent % 2 == 1) {
            result = (result * baseNum) % modulus;
        }
        baseNum = (baseNum * baseNum) % modulus;
        exponent /= 2;
    }
    return result;
}
    public static int getD(int C, int P){
    int D=1;
    while((C*D)%P!=1){
    D=D+2;
    }
    return D;
    }
    public static int getG(int P){
        int g = 1;
        int q = 0;
        q = (P-1)/2;
        while(Math.pow(g, q)%P==1){
    g = (int) (Math.random() * (P-1));
        }
        return g;
    }
    
    public static int P(int r){
    int P=0;
   List<Integer> numbers =  OTT.SE(r);
   P = numbers.get((int)(Math.random()*numbers.size()));
    return P;
    }
}

