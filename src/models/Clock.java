/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IClock;

/**
 *
 * @author George.Pasparakis
 */
public class Clock extends Naming implements IClock {
    private int totalTime;
    private int tick;
    
    public Clock(int totalTime, int tick) {
        this.totalTime = totalTime;
        this.tick = tick;
    }
    
    @Override
    public void setTotalTime(int totalTime) {
       this.totalTime = totalTime;
    }
    
    @Override
    public int getTotalTime() {
        return(this.totalTime);
    }

    @Override
    public void setTick(int tick) {
        this.tick = tick;
    }

    @Override
    public void tick() {
        this.totalTime -= this.tick;
    }
}
