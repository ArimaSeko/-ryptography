/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.kstu.cryptography.coursework;

import java.util.List;

/**
 *
 * @author 1234
 */
public class DH {
    public static int getG(int P){
        int g = 1;
        int q = 0;
        q = (P-1)/2;
        while(Math.pow(g, q)%P==1){
    g = (int) (Math.random() * (P-1));
        }
        return g;
    }
    
    public static int P(){
    int P=0;
   List<Integer> numbers =  OTT.SE(2000);
   P = numbers.get((int)(Math.random()*numbers.size()));
    return P;
    }
}
