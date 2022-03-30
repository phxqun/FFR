package xyz.phxqun.test;

import xyz.phxqun.pojo.Base3DRect;
import xyz.phxqun.pojo.RandomPoint;
import xyz.phxqun.pojo.UnitSquare;
import xyz.phxqun.util.RandomUtil;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 400);
        RandomPoint randomPoint = new RandomPoint();
        randomPoint.setCoordX(RandomUtil.randomInteger(100, 200));
        randomPoint.setCoordY(RandomUtil.randomInteger(100, 200));
        jFrame.add(randomPoint);

        jFrame.setVisible(true);

        while (true) {
            Thread.sleep(100);
            randomPoint.setCoordX(RandomUtil.randomInteger(100, 200));
            randomPoint.setCoordY(RandomUtil.randomInteger(100, 200));
            jFrame.repaint(0, 0, 0, 400, 400);
        }

//        Base3DRect base3DRect = new Base3DRect();
//        jFrame.add(base3DRect);
//        jFrame.setVisible(true);
    }
}
