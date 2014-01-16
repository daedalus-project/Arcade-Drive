/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2839.year2014.arcade;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Jack
 */
public class Gearbox {
    
    private Jaguar[] motors;
    
    private double speed;
    
    public Gearbox(int[] motorList) {
        speed = 0;
        motors = new Jaguar[motorList.length];
        for (int i = 0; i < motorList.length; i++) {
            motors[i] = new Jaguar(motorList[i]);
        }
    }
    
    public void set(double s) {
        speed = s;
        for (int i = 0; i < motors.length; i++) {
            motors[i].set(speed);
        }
    }
    
    public double getSpeed() {
        return speed;
    }
    
}
