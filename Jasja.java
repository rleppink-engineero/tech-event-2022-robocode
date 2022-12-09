package engineero;

import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;
import java.util.Random;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Jasja - a robot by Jasja
 */
public class Jasja extends Robot {
    /**
     * run: Jasja's default behavior.
     */
    public void run() {
        setColors(Color.black,Color.red,Color.white); // body,gun,radar

        // Robot main loop
        while (true) {
            ahead(new Random().nextDouble(300));
            turnLeft(new Random().nextDouble(180));
            turnGunRight(new Random().nextDouble(360));
            back(new Random().nextDouble(300));
            turnGunRight(new Random().nextDouble(360));
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        turnLeft(new Random().nextDouble(90));
        back(new Random().nextDouble(150));
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        turnLeft(new Random().nextDouble(90));
        back(new Random().nextDouble(200));
    }
}