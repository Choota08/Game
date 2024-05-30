/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author SMK TELKOM 35
 */
public class Player2 extends Player {
   
    String name1;
    
    int healthPoin1,speed1,damage1;
    
    void run1() {
        System.out.println(name1 + " is running... ");
        System.out.println("speed: " + speed1);
        System.out.println("Remaining HP "+ (healthPoin1-damage));
    }

    
    void attack1(){
        System.out.println(name1+"is attacking: "+damage1);
    }
        boolean isDead1(){
        if(healthPoin1 <=0 )return false;
        return false;
    }
}
