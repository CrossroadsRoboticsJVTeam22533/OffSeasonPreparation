package HelperClasses;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveController {

    DcMotorEx frontLeft, frontRight, backLeft, backRight;

    public DriveController(DcMotorEx frontLeft, DcMotorEx frontRight, DcMotorEx backLeft,DcMotorEx backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

    public void init() {
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }


    public void drive(float leftStickY, float rightStickY) {
        frontLeft.setPower(-leftStickY);
        backLeft.setPower(-leftStickY);
        frontRight.setPower(-rightStickY);
        backRight.setPower(-rightStickY);
    }



}
