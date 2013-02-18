
package com.shsrobotics.omicronsquark.commands;

import com.shsrobotics.omicronsquark.Maps;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class StateMachineBehindPyramid extends CommandGroup implements Maps {

	public StateMachineBehindPyramid() { // make to-do list
		addSequential(new SetShooterWheelSpeed(0.54)); // 54%
			addSequential(new WaitCommand(Constants.speedUpDelay)); // wait for shooter to spin up
		addSequential(new Shoot());
		addSequential(new Shoot());		
		addSequential(new Shoot());
	}
}