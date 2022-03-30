package xyz.phxqun.pojo;

import javax.swing.*;
import java.awt.*;

public class Base3DRect extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        this.setLocation(0, 0);
        g2.draw3DRect(0, 0, 100, 200, false);
    }
}
