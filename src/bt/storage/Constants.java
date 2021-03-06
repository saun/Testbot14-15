/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.storage;

/**
 *
 * @author Dlock
 */
public interface Constants {
    public static final int XBOX_CONTROLLER_PORT = 1;
    public static final int XBOX_CONTROLLER_BUTTONS = 10;
    public static final int XBOX_CONTROLLER_AXES = 10;
    public static final double CON_FUDGE_FACTOR = .15;
    public static final int COMP_SENSOR_PORT = 8;
    public static final int COMP_RELAY_PORT = 1;
    public static final int PRESSURE_SENSOR_PORT = 5;
    public static final int PRESSURE_ISFILLED = 505;
    public static final double PSI_PER_VAL = 120.0/570.0; 
    
    //B MAP
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int LEFT_BUMPER_BUTTON = 5;
    public static final int RIGHT_BUMPER_BUTTON = 6;
    public static final int LEFT_STICK_BUTTON = 9;
    public static final int RIGHT_STICK_BUTTON = 10;
    
    
    //A MAP
    public static final int LEFT_STICK_UP_DOWN_PORT = 2;
    public static final int LEFT_STICK_LEFT_RIGHT_PORT = 1;
    public static final int RIGHT_STICK_UP_DOWN_PORT = 5;
    public static final int RIGHT_STICK_LEFT_RIGHT_PORT = 4;
    public static final int TRIGGER_PORT = 3;
    public static final double LEFT_TRIGGER = 1.0;
    public static final double RIGHT_TRIGGER = -1.0;
    public static final int DPAD_LEFT_RIGHT_PORT = 6;
    public static final double LEFT_DPAD = -1.0;
    public static final double RIGHT_DPAD = 1.0;

    //SmartDashboard
    public static final int CAP_LIMIT_OUTPUT = 10;
    
    //Debugger Constants
    public static final int DEBUG_LOCATION_AMOUNT = 1;
    public static final int DEBUG_CAP_LIMIT = 1000;
    
    
    public static final class DebugLocation
    {
        public static final DebugLocation BTMain = new DebugLocation("BTmain");
        public static final DebugLocation ControlBoard = new DebugLocation("ControlBoard");
        public static final DebugLocation BTController = new DebugLocation("BTController");
        public static final DebugLocation BTDebug = new DebugLocation("BTDebug");
        public static final DebugLocation BTMotor = new DebugLocation("BTMotor");
        public static final DebugLocation GUI = new DebugLocation("GUI");
        public static final DebugLocation BTDriveTrain = new DebugLocation("DriveTrain");
        public static final DebugLocation BTManipulator = new DebugLocation("BTManipulator");
        public static final DebugLocation BTHealthCheck = new DebugLocation("BTHealthCheck");
        public static final DebugLocation BTVision = new DebugLocation("BTVision");
        public static final DebugLocation BTData = new DebugLocation("BTData");
        
        String name;
        private DebugLocation(String name)
        {
            this.name = name;
        }
        public String toString()
        {
            return name;
        }
    }
    
    public static final class Severity 
    {
        public static final Severity DEBUG = new Severity(0, "DEBUG");
        public static final Severity INFO = new Severity(1, "INFORMATION");
        public static final Severity WARNING = new Severity(2, "WARNING");
        public static final Severity SEVERE = new Severity(3, "SEVERE");
        
        
        int ordinal;
        String name;
        private Severity(int ordinal, String name) {
            this.ordinal = ordinal;
            this.name = name;
        }
        
        public String toString()
        {
            return name;
        }
        
    }
    
    public static final boolean DEBUGMODE = true;
    public static final boolean DEBUG_DURING_DISABLED = false;
    public static final boolean SMARTDASHBOARD_DEBUG = false;
    public static final boolean SPEEDDEBUG = false;
    public static final int TIME_LENGTH = 5000;
    
    //HealthCheck Constants
    public static final int ID_LIM = -256;
    public static final int HEALTHCHECK_ID_LEFTMOTOR1 = 0;
    public static final String[][] PARAMS_2220 = 
    {
        {"BTVision",""},{}
    };
    
    //Vision
    public static final int RED_LOW_THRESHOLD = 0;
    public static final int RED_HIGH_THRESHOLD = 45;
    public static final int GREEN_LOW_THRESHOLD = 25;
    public static final int GREEN_HIGH_THRESHOLD = 255;
    public static final int BLUE_LOW_THRESHOLD = 0;
    public static final int BLUE_HIGH_THRESHOLD = 47;
    
    public static final int CAM_WIDTH_LOW = 30;
    public static final int CAM_WIDTH_HIGH = 400;
    public static final int CAM_HEIGHT_LOW = 40;
    public static final int CAM_HEIGHT_HIGH = 400;
    
    //DriveTrain
    public static final int RIGHT_MOTOR_PORT = 3;
    public static final int LEFT_MOTOR_PORT = 1;
    public static final int SONAR_PORT = 3;
    public static final boolean IS_DT_CANBUS = false;
    public static final boolean IS_DT_VOLTAGE = false;
    public static final int LEFT_ENCODE_A = 3;
    public static final int LEFT_ENCODE_B = 4;
    public static final int RIGHT_ENCODE_A = 1;
    public static final int RIGHT_ENCODE_B = 2;
    public static final double WHEEL_CIRCUMFERENCE = Math.PI*4.444;
    public static final double DT_RAMPRATE = 50;
    
    public static final double ENCODER_TEETH = 128;
    
    //Manipulator
    public static final boolean IS_SHOOTER_CANBUS = false;
    public static final boolean IS_SHOOTER_VOLTAGE = false;
    public static final double HINGE_FUDGE_FACTOR = .08;
    public static final int WINCH_MOTOR_PORT = 5;
    public static final int COLLECTOR_MOTOR_PORT = 7;
    public static final int HINGE_MOTOR_PORT = 4;
    public static final int MANIP_SHOOT_ENCODE_A = 5;
    public static final int MANIP_SHOOT_ENCODE_B = 6;
    public static final int BALL_DETECTION_PORT = 2;
    public static final double MANIP_WHEEL_CIRCUMFERENCE = Math.PI*2;
    public static final int MANIP_RELEASE_EXTEND_PORT = 3;
    public static final int MANIP_RELEASE_RETRACT_PORT = 4;
    public static final int COLLECTOR_PISTON_EXTEND_PORT = 8;
    public static final int COLLECTOR_PISTON_RETRACT_PORT = 7;
    public static final int LOCK_PISTON_EXTEND_PORT = 5;
    public static final int LOCK_PISTON_RETRACT_PORT = 6;
    public static final int HINGE_POT_CHANNEL = 2;
    public static final int COLLECTOR_POT_CHANNEL = 6;
    public static final int MAX_LIMIT_SWITCH_PORT = 7;
    public static final int MIN_LIMIT_SWITCH_PORT = 10;
    public static final int WINCH_LIMIT_SWITCH_PORT = 11;
    public static final double POT_ANGLE_CALC = 360 / 5.0;
    public static final double HINGE_LIMIT_MAX = 1.27;
    public static final double HINGE_LIMIT_MIN = .24;
    public static final double PASS_SPEED = .80;
    public static final double COLLECT_SPEED = 1;
    public static final double DPAD_ADJUSTMENTS = 1;
    public static final double RELOAD_TIME = 2000;
    public static final double RELOADING_DISTANCE = 24;
    public static final double MANIP_WINCH_MIN = 0;
    public static final double MANIP_WINCH_MAX = 48;
    public static final double MANIP_SPEED = .8;
    public static final double MANIP_LOW_SPEED = .1;
    public static final double PITCH_SHOOTING = 0.87;
    public static final double PITCH_DOWN = 0;
    public static final double PITCH_UP = 4.0;
    public static final double TRUSS_POSITION = (MANIP_WINCH_MAX - RELOADING_DISTANCE) / 2.0 + RELOADING_DISTANCE;
    public static final double SWEET_SPOT_POSITION = (MANIP_WINCH_MAX - RELOADING_DISTANCE) * (3.0 / 4.0) + RELOADING_DISTANCE;
    
    //Climber
    //TODO: Creat Climber Constants
    
}
