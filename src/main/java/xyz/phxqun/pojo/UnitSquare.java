package xyz.phxqun.pojo;

import javax.swing.*;
import java.awt.*;

public class UnitSquare extends JLabel {
    public UnitSquare(){
        super("□");
        this.setLocation(200, 200);
        this.setSize(1,1);
        this.setBackground(Color.BLACK);
    }
}
