package frc.constants;

public class AutoConstants {

    public static final double kStabilizationP = 1;
    public static final double kStabilizationI = 0.5;
    public static final double kStabilizationD = 0;
    //Less than .5 not .25 more than .01 .08 too high .0605 dead on
    public static final double kTurnP = 0.0005;
    public static final double kTurnI = 0.00;
    public static final double kTurnD = 0.0;

    public static final double kMaxTurnRateDegPerS = 100;
    public static final double kMaxTurnAccelerationDegPerSSquared = 300;

    public static final double kMaxSpeedMetersPerSecond = 10; //Somewhat random number right now
    public static final double kMaxAccelerationMetersPerSSquared = 25; //Also somewhat random number

    public static final double kLevel = 0; //0 degrees is level
    public static final double kBalanceToleranceDeg = 3.5; // 1.5;
    public static final double kBalanceP = .01; //0.006; //0.01
    public static final double kBalanceI = 0;
    public static final double kBalanceD = 0;  
    
    public static final double kAutoDriveP = 0.01;
    public static final double kAutoDriveI = 0;
    public static final double kAutoDriveD = 0;  

    public static final double kTurnToleranceDeg = 5;
    public static final double kTurnRateToleranceDegPerS = 10; // degrees per second

    public static final double kAngleCorrectionP = .01; //coefficient for course correction in autoDrive commands

    public static final double kDriveToChargeStationPower  = 0.4; //power for drive to charge station command
    public static final double kDriveToDistancePower       = 0.3; //power for drive to distance command
    public static final double kDriveToAprilTagPower       = 0.3; //power for drive to April tag command

    // public static final double kSubStationSideDriveDistance = -4.29; // FIXME: Units? (Only Used by deprecated command)

    // Tolerances for Autonomous driving
    public static final double kAutoDriveToleranceMeters = 0.05; // About 2 inches
    public static final double kRollThresholdDegrees = 9.0;
    
}
