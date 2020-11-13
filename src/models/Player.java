/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import interfaces.IPlayer;
/**
 *
 * @author George.Pasparakis
 */
public class Player extends Naming implements IPlayer {
    private int counter = 0;
    private Game firstGame;
            
    public Player() {
        
    }
    
    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    }
    
    public void setFirstGame(Game game) {
        this.firstGame = game;
    }
    
    /*
        In this method we need to figure out 
        for the specific game which move the player does
    */
    public String moves(Game game, Clock c) {
        String result = "";
        if(game != firstGame) counter = 1; else counter++;
        result = Integer.toString(counter);
        c.tick();
        return(result);
    }
}
