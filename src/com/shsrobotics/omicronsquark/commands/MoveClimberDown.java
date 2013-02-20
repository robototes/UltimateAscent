package com.shsrobotics.omicronsquark.commands;

public class MoveClimberDown extends CommandBase {
	
	public MoveClimberDown() {
		requires(climber);
	}

	protected void initialize() {
		climber.set(1.0);
	}

	protected void execute() { }

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		climber.stop();
	}

	protected void interrupted() {
		climber.stop();
	}
}
