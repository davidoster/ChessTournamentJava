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
    private Player[] players;
    
    public  Game() {
       System.out.println("Game 1");
    }
    
    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);
    }
    
    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
    }
}
