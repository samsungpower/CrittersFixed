import java.awt.*;
import javax.swing.JFrame;
import java.security.cert.Extension;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class TestingHuskyObject extends Canvas{

    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Critters");
        Canvas canvas = new TestingHuskyObject();
        canvas.setSize(WIDTH, HEIGHT);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make shit redraw
        try {
            while (true) {
                canvas.repaint();
                Thread.sleep(10);
            }
        } catch(Exception e) {};
    }

    public void paint(Graphics g) {
        int[] cords = Husky.getCords(10, WIDTH, HEIGHT);
        g.setColor(new Color(51, 0, 111));
        g.drawString("H", cords[0], cords[1]);
    }
}
