/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IGame;
/**
 *
 * @author George.Pasparakis
 */
public class Game extends Naming implements IGame {
    public  Game() {
       System.out.println("Game 1");
    }
    
    public Game(String name) {
        this.setName(name);
        System.out.println(this.getName());
    }
    
    public void start() {
        
    }
}