package xyz.phxqun.pojo;

import javax.swing.*;
import java.awt.*;

public class RandomPoint extends JPanel {

    private Integer coordX;
    private Integer coordY;
    private Integer coordZ;

    public Integer getCoordX() {
        return coordX;
    }

    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    public Integer getCoordY() {
        return coordY;
    }

    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }

    public Integer getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(Integer coordZ) {
        this.coordZ = coordZ;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke bs = new BasicStroke();
        g2.fillRect(this.coordX, this.coordY, 1, 1);
    }
}
