/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;
import java.util.Scanner;
/**
 *
 * @author SMK TELKOM 35
 */
public class Game {

    public static void main(String[] args) {
     
        
        Player hero = new Player();
        Player2 tor = new Player2();
        
        hero.name = "P1";
        hero.speed = 90;
        hero.healthPoin= 100;
        hero.damage = 10;
        
        hero.run();
        
        if(hero.isDead()){
            System.out.println(tor.name1+"Win");
            
        }
        
        System.out.println("               ");
        
        tor.name1 ="P2";
        tor.speed1 = 90;
        tor.healthPoin1=10;
        tor.damage1 =10;
        
        tor.run1();
        tor.attack1();
        
        if(tor.isDead1()){
            System.out.println(hero.name+"Win");
        }
        
    }
    }
        
        
 

        