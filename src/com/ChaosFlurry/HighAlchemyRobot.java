package com.ChaosFlurry;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Instant;
import java.util.Random;

public class HighAlchemyRobot {
    private Robot robot = new Robot();
    private Random random = new Random();
    private int keyEvent;
    private BackpackSlot backpackSlot;
    
    public HighAlchemyRobot(int keyEvent, BackpackSlot backpackSlot) throws AWTException {
        this.keyEvent = keyEvent;
        this.backpackSlot = backpackSlot;
    }
    
    public void start(int casts) {
        int delay;
        Instant start = Instant.now();
        while (true) {
            robot.keyPress(keyEvent);
            delay = 100 + random.nextInt(50);
            robot.delay(delay);
            robot.keyRelease(keyEvent);
            delay = 1500 + random.nextInt(500);
            robot.delay(delay);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            delay = 100 + random.nextInt(50);
            robot.delay(delay);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            delay = 200 + random.nextInt(50);
            robot.delay(delay);
            if (Instant.now().toEpochMilli() - start.toEpochMilli() > casts * 3000) {
                break;
            }
        }
    }
}
