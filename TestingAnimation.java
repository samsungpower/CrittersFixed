import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class TestingAnimation extends Canvas{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public static void main(String[] args){
        JFrame frame = new JFrame("Critters");
        Canvas canvas = new TestingAnimation();
        canvas.setSize(WIDTH, HEIGHT);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //paint a H
    public void paint(Graphics g){
        try {
            //center starting cords on the canvas
            Random r = new Random();
            int x = WIDTH / 2;
            int y = HEIGHT / 2;
            Color Purple = new Color(51, 0, 111, 100);
            while(true) {
                while (x < WIDTH && y < HEIGHT) {
                    int num = r.nextInt(2) - 1; //creates -1 or +1
                    if (num == 0) {
                        num++;
                    }
                    x += (int)(r.nextDouble() * num * r.nextInt(10));
                    num = r.nextInt(2) - 1; //creates -1 or +1
                    if (num == 0) {
                        num++;
                    }
                    y += (int)(r.nextDouble() * num * r.nextInt(10));
                    g.setColor(Color.DARK_GRAY);
                    g.clearRect(0, 0, WIDTH, HEIGHT);
                    g.setColor(Purple);
                    g.drawString("H", x, y);
                    Thread.sleep(100);
                    System.out.println("X: " + x + "|| y: " + y);
                }
            }
        } catch(Exception e) {};
    }
}
