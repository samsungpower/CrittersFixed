import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class TestingHuskyMovement extends Canvas{
    //OBJECT AND CANVAS CONSTANTS
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public static void main(String[] args){
        JFrame frame = new JFrame("Critters");
        Canvas canvas = new TestingHuskyMovement();
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
            int x = WIDTH / 2;
            int y = HEIGHT / 2;
            while(true) {
                System.out.println("===============");
                Random rand = new Random();
                while (x < WIDTH && y < HEIGHT) {
                    int dirVector = rand.nextInt(2) - 1; //creates -1 or +1
                    if (dirVector == 0) {
                        dirVector++;
                    }
                    System.out.println(dirVector + "==========");
                    x += (int)(rand.nextDouble() * dirVector * rand.nextInt(10));
                    y += (int)(rand.nextDouble() * dirVector * rand.nextInt(10));
                    g.setColor(Color.lightGray);
                    g.clearRect(0, 0, WIDTH, HEIGHT);
                    g.setColor(Color.darkGray);
                    g.drawString("H", x, y);
                    Thread.sleep(10);
                    System.out.println("X: " + x + "|| y: " + y);
                }

//                while(x > 0 && y > 0) {
//                    x -= (int)(rand.nextDouble() * 10);
//                    y -= (int)(rand.nextDouble() * 10);
//                    g.setColor(Color.lightGray);
//                    g.fillRect(0, 0, WIDTH, HEIGHT);
//                    g.setColor(Color.darkGray);
//                    g.drawString("H", x, y); //centers the object
//                    Thread.sleep(50);
//                    System.out.println("X: " + x + "|| y: " + y);
//                }
            }
        } catch(Exception e) {};
    }
}