package OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import HelperClasses.DriveController;

public class ExampleTeleOp extends LinearOpMode {

    DcMotorEx frontLeft, frontRight, backLeft, backRight;

    void initialize() {
        frontLeft = hardwareMap.get(DcMotorEx.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");
        backLeft = hardwareMap.get(DcMotorEx.class, "backLeft");
        backRight = hardwareMap.get(DcMotorEx.class, "backRight");
    }

    @Override
    public void runOpMode() throws InterruptedException {

        initialize();

        DriveController driveController = new DriveController(frontLeft, frontRight, backLeft, backRight);
        driveController.init();

        waitForStart();

        while(!isStopRequested()) {

            driveController.drive(gamepad1.left_stick_y, gamepad1.right_stick_y);

        }

    }

}
