/**
 * Provides a test application window with a panel.
 *
 * @author Björn Gottfried
 *
 * @version 1.0
 */

package drawingTool;

import javax.swing.*;
import java.awt.*;

public class TestDrawingTool {
    private JFrame applicationFrame;

    public TestDrawingTool(String title) {
        applicationFrame = new JFrame(title);
        Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
        applicationFrame.add(new DrawingArea());
        applicationFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new TestDrawingTool("The Amazing Rooster");
    }
}