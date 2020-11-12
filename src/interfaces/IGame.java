/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Player;

/**
 *
 * @author George.Pasparakis
 */
public interface IGame {
    /*
        - uses the two players
        - each player moves one after the other
    */
    public void start(Player[] players);
    
    public static String dummy() {
//        System.out.println("dfdfsdf");
        return("");
    }
}
