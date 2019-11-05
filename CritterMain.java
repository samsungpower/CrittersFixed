import java.awt.*;
import javax.swing.JFrame;
//Husky test = new Husky();
public class CritterMain extends Canvas {
    //OBJECT AND CANVAS CONSTANTS
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public static final int RADIUS = 25;


    public static void main(String[] args){
        Husky testing = new Husky();
        JFrame frame = new JFrame("Critters");
        Canvas canvas = new CritterMain();
        canvas.setSize(WIDTH, HEIGHT);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //paint a CIRCLE
    public void paint(Graphics g){
        try {
            int x;
            int y;
            while(true) {
                System.out.println("===============");
                double t = 0;
                while (t < 100) {
                    t += .01;
                    x = (int)((WIDTH / 2 - RADIUS) + Math.cos(t) * 100);
                    y = (int)((HEIGHT / 2 - RADIUS) + Math.sin(t) * 100);
                    g.setColor(Color.lightGray);
                    g.fillRect(0, 0, WIDTH, HEIGHT);
                    g.setColor(Color.darkGray);
                    g.fillOval(x, y, RADIUS, RADIUS); //centers the object
                    Thread.sleep(10);
                    System.out.println("X: " + x + "|| y: " + y);
                }
            }
        } catch(Exception e) {};
    }
}