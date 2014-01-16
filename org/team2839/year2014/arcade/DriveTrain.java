/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team2839.year2014.arcade;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Jack
 */
public class DriveTrain {
	
    private static final double kStop = 0.0;

    private Gearbox leftMotors, rightMotors;
    private Joystick driverJoy;

    public DriveTrain(int[] left, int[] right, int joystick) {
        leftMotors = new Gearbox(left);
        rightMotors = new Gearbox(right);
        driverJoy = new Joystick(joystick);
    }

    public void reset() {
        leftMotors.set(kStop);
        rightMotors.set(kStop);
    }

    public void run(double leftSpeedMultiplier, double rightSpeedMultiplier) {
        leftMotors.set(((driverJoy.getY() * leftSpeedMultiplier) + driverJoy.getX()));
        rightMotors.set(((driverJoy.getY() * rightSpeedMultiplier) + driverJoy.getX()));
    }

    public void displayMotorSpeeds() {
        SmartDashboard.putNumber("Left Motor Speed", leftMotors.getSpeed());
        SmartDashboard.putNumber("Right Motor Speed", rightMotors.getSpeed());
    }

}