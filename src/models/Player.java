/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author George.Pasparakis
 */
public class Player extends Naming {
    
    public Player() {
        
    }
    
    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    }
}
