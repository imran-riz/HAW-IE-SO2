package drawingTool;

import javax.swing.*;
import java.awt.*;

public class DrawingArea extends JPanel {
    private static final long serialVersionUID = 1L;
    private Scene scene;

    public DrawingArea(int width, int height) {
        scene = new Scene(width, height);
    }

    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        Drawing.set(pen);
        scene.drawRoosters();
    }
}
