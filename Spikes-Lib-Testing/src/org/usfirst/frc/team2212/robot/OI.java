package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick driverRight = new Joystick(2);
	private Joystick driverLeft = new Joystick(1);
	
	public OI(){
	}

	// receives input, returns the adjusted input for better sensitivity
	private double adjustInput(double input){
		return input * Math.abs(input);
	}

	// returns the adjusted value of the Rotate
	// switch this to switch between the 2 drive arcade methods
	public double getRotation() {
		return adjustInput(-driverLeft.getX());
	}

	// returns the adjusted value of the driving right joystick's y
	public double getForward() {
		return adjustInput(driverRight.getY());
	}
}
