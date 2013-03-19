package com.shsrobotics.omicronsquark.commands;

import com.shsrobotics.omicronsquark.Maps;

public class BringWheelsToSpeedForPyramidSide extends CommandBase implements Maps {
	
	public BringWheelsToSpeedForPyramidSide() {
		requires(diskShooter);
		setInterruptible(true);
	}

	protected void initialize() {
		double fudgeFactor = Maps.Constants.dialMaximumChangePercentage *
			shooterJoystick.getRawAxis(Maps.Constants.towerSideFudgeFactor);
		double value = Maps.Constants.defaultShootingNextToPyramidValue;
		diskShooter.set(value + fudgeFactor);
	}

	protected void execute() { }

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		diskShooter.set(0.0);
	}

	protected void interrupted() {
		diskShooter.set(0.0);
	}
}
