package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;


@TeleOp(name = "test")
public class test extends LinearOpMode {

    DcMotor mo;

    @Override
    public void runOpMode() {

        mo = hardwareMap.get(DcMotor.class, "0");

        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                telemetry.addData("조이스틱x",gamepad1.left_stick_y);
                telemetry.update();
                telemetry.addData("조이스틱y",gamepad1.right_stick_y);
                telemetry.update();
                if(gamepad1.x){
                    mo.setPower(gamepad1.left_stick_y);
                }
                if (gamepad1.y)
                    mo.setPower(gamepad1.right_stick_y);

                }
            }
        }
    }

