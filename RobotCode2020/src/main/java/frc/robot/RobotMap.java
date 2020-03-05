/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {
  // controller port
  public static final int CONTROLLER_PORT_ID = 0;

  // arm ID
  public static final int MOTOR_ARM_ID = 20;

  // intake ID
  public static final int MOTOR_MAILBOX_ID = 31;
  
  // drivetrain motors
  public static final int MOTOR_LEFT_BACK_ID = 12;
  public static final int MOTOR_RIGHT_BACK_ID = 10;
  public static final int MOTOR_LEFT_FRONT_ID = 13;
  public static final int MOTOR_RIGHT_FRONT_ID = 11;

  public static final int MOTOR_CLIMB_EXTENDER_ID = 0;
  public static final int MOTOR_CLIMB_WINCH_ID = 40;
  
  // left joystick (horizontal)
  public static final int JOYSTICK_DRIVE_FORWARDS_ID = 1;
  // left joystick (horizontal)
  public static final int JOYSTICK_DRIVE_ROTATION_ID = 0;
  // right joystick (vertical)
  public static final int JOYSTICK_ARM_CONTROL_ID = 5;
  // triggers (L,R accordingly)
  public static final int JOYSTICK_INTAKE_ID = 2;
  public static final int JOYSTICK_OUTPUT_ID = 3;
  // buttons
  public static final int A_BUTTON_ID = 1;
  public static final int B_BUTTON_ID = 2;
  public static final int LEFT_BUMPER_BUTTON_ID = 3;
  public static final int RIGHT_BUMPER_BUTTON_ID = 4;

  // backwards button
  public static final int LB_BUTTON_ID = 4;

  // arm setpoints
  public static final double ARM_POS_MIN = 0;
  public static final double ARM_POS_MAX = 60;

  // arm positions
  public static final double ARM_POS_LOWER = -1082.0;
  // real position is 566.0, but because of hard stop lowered it down a tiny bit
  public static final double ARM_POS_UPPER = 550.0;
}

// extra documentation

// For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
