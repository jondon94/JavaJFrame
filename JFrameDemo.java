//javac JFrameDemo.java
//java JFrameDemo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameDemo {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JFrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("hello world");
        emptyLabel.setPreferredSize(new Dimension(325, 250));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        JPanel contentpane = new JPanel(new BorderLayout());
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
