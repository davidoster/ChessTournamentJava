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
        players[0].setFirstGame(this);
        players[1].setFirstGame(this);
        this.start(players);
    }
    
    public void start(Player[] players) {
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays against Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock(600, 15));
    }
    
    public void playersMove(Player[] players, Clock c) {
        // Player X plays move m against Player Y
        // 15" * 4 = 1' * 10 = 10' == 600"
        // 600" = 40 cycles, 20 cycles
       
        for (int i = 0; i < 20; i++) {
            String s = "Player " + players[0] + " plays move " + players[0].moves(this, c) + " against Player " + players[1];
            s += "\nTime is: " + c.getTotalTime();
            s += "\nPlayer " + players[1] + " plays move " + players[1].moves(this, c) + " against Player " + players[0];
            s += "\nTime is: " + c.getTotalTime();
            System.out.println(s);
        }
    }
}
