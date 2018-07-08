package com.ChaosFlurry;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        /*
        taking screenshots with java:
        Robot r = new Robot();
        Instant start;
        Instant end;
        long ms;
        start = Instant.now();
        BufferedImage bi = r.createScreenCapture(new Rectangle(1920, 1080));
        end = Instant.now();
        ms = end.toEpochMilli() - start.toEpochMilli();
        System.out.println("elapsed: " + ms);
        start = Instant.now();
        ImageIO.write(bi, "png", new File("C:/Users/John/Desktop/test.png"));
        end = Instant.now();
        ms = end.toEpochMilli() - start.toEpochMilli();
        System.out.println("elapsed: " + ms);
         */
    
        HighAlchemyRobot highAlchemyRobot = new HighAlchemyRobot(KeyEvent.VK_2, BackpackSlot.SLOT_2);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        highAlchemyRobot.start();
    }
}
