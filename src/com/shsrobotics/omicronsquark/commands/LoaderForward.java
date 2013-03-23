package com.shsrobotics.omicronsquark.commands;

import com.shsrobotics.omicronsquark.Global;
import com.shsrobotics.omicronsquark.Maps;

public class LoaderForward extends CommandBase implements Maps {
	
	public LoaderForward() {
		requires(diskShooter);
	}

	protected void initialize() {
		diskShooter.setLoader(ON);
	}

	protected void execute() { }

	protected boolean isFinished() {
		return true;
	}

	protected void end() { }

	protected void interrupted() { }
}