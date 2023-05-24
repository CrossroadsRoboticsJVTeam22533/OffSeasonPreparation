package OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import HelperClasses.DriveController;

@TeleOp
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

            //driveController.drive(gamepad1.left_stick_y, gamepad1.right_stick_y);
            driveController.driveDir('f', 0.5f);
            driveController.driveDir('r', 0.75f);
            driveController.driveDir('b',1.0f);

        }

    }

}
