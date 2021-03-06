package com.shsrobotics.omicronsquark;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public interface Maps {
    Joystick driverJoystick = new Joystick(1); // the joystick is plugged in to the 1st USB port
	Joystick shooterJoystick = new Joystick(2); //						"			2nd USB port
    
    Relay.Value ON = Relay.Value.kForward;
    Relay.Value OFF = Relay.Value.kOff;
	Relay.Value REVERSE = Relay.Value.kReverse;

    public static final class Robot {
		
		public static final int blockerMotor = 1;
		
        public static final class Drive {
            public static final int // ports that motors, sensors, etc. are plugged into
                frontLeftWheel = 3, // PWM
                frontRightWheel = 2, // PWM
                rearLeftWheel = 4, // PWM
                rearRightWheel = 1, // PWM
                gyroscope = 1; // Analog
            public static final double
                driveCoordinateScale = 0.5,
                normalScale = 1.0,
                P = 0.025,
                I = 0.0025,
                D = 0.00,
                absoluteTolerance = 0.75,
                gyroVoltsPerDegreeSecond = 0.007;
            public static final boolean
                encoderReverseDirection = false;
        } 
        public static final class Scorer {
            public static final int                
                flywheelFront = 6, // PWM
                flywheelRear = 5, // PWM
                loader = 7; // PWM
        }
    }
    public static final class Constants {
        
		public static final double
            fieldLength = 54, // feet
            cameraHorizontalViewAngle = 47, // degrees
            cameraVerticalViewAngle = 36, // degrees
            shooterAngleAdjustment = -11,
            shooterVerticalAngle = 37,		// degrees
            significanceLevel_Angle = 1.8, //degrees
            significanceLevel_Rectangularity = 42, //percent            
            significanceLevel_Percent = 25, //percent            
            joystickThreshold = 0.1,
            momentumDelay = 0.075, // seconds
            rotationStep = 15.0,
            spinRight = 1.0,
            spinLeft = -1.0,
            shooterSpeedIncrement = 0.05,
            rearMotorScaling = -0.85,
			loadingDelay = 2.05,
			idlePercent = 0.25,
			dialMaximumChangePercentage = 0.10,
			defaultDumpingValue = 0.30,
			defaultShootingBehindPyramidValue = 0.52,
			defaultShootingNextToPyramidValue = 0.94;
        
        public static final class aspectRatios {
            public static final double
                lowGoal = (29 + 8) / (24 + 8),
                middleGoal = (54 + 8) / (21 + 8),
                highGoal = (54 + 8) / (12 + 8);
        }
        
        public static final int
            onTargetCount = 5,
            failsAspectRatioTest = 0,
            lowGoal = 1,
            middleGoal = 2,
            highGoal = 3,
            groundLevel = 0,
            firstLevel = 1,
            secondLevel = 2,
            thirdLevel = 3,
			dumpFudgeFactor = 1,
			towerBackFudgeFactor = 2,
			towerSideFudgeFactor = 4;
    }
    
    public static final class Buttons {
        public static final Button 
			loaderReverse = new JoystickButton(shooterJoystick, 2),
			loaderForwards = new JoystickButton(shooterJoystick, 3),
			loaderForwardsD = new JoystickButton(driverJoystick, 1),
			bringWheelsToSpeedToShootFromSide = new JoystickButton(shooterJoystick, 4),
			bringWheelsToSpeedToShootFromBack = new JoystickButton(shooterJoystick, 5),
			bringWheelsToSpeedToDump = new JoystickButton(shooterJoystick, 6),
			idleShooterWheels = new JoystickButton(shooterJoystick, 7),
			override = new JoystickButton(shooterJoystick, 12),
			blockerUp = new JoystickButton(shooterJoystick, 10),
			blockerDown = new JoystickButton(shooterJoystick, 9);
			
        // buttons that are only read for values
        public static final int
            scaleDriveCoordinates = 2;
    }
}
