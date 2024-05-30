/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author SMK TELKOM 35
 */
public class Player {

    String name;
    int speed, healthPoin, damage;
    
    void run(){
        System.out.println(name+" is running... ");
        System.out.println("speed: "+ speed);
        System.out.println(name+" is attacking: "+damage);

    }
    
    boolean isDead(){
        if(healthPoin <=0 )return false;
        return false;
    }
    
    
}


