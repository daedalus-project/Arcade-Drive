/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2839.year2014.ArcadeDrive;

import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author Jack
 */
public class Gearbox {
    
    private Talon[] motors;
    
    private double speed;
    
    public Gearbox(int[] motorList) {
        speed = 0;
        motors = new Talon[motorList.length];
        for (int i = 0; i < motorList.length; i++) {
            motors[i] = new Talon(motorList[i]);
        }
    }
    
    public void set(double s) {
        if (Math.abs(s) <= 0.1) {
            speed = 0;
        } else {
            speed = (s * s * s) / Math.abs(s);
        }
        for (int i = 0; i < motors.length; i++) {
            motors[i].set(speed);
        }
    }
    
    public double getSpeed() {
        return speed;
    }
    
}
