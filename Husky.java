import java.util.Random;

public class Husky {
    //Instantiate variables

    public static int genPosNeg() {
        Random r = new Random();
        int dirVector = r.nextInt(2) - 1; //creates -1 or +1
        if (dirVector == 0) { //zero exclusive
            dirVector++;
        }
        return dirVector;
    }

    static int[] getCords(int speed, int width, int height) {
        int x = width/2;
        int y = height/2;
        Random rand = new Random();

        int dirVector = genPosNeg();
        int randomIncr = (int)(rand.nextDouble() * dirVector * speed);
        x += randomIncr;

        dirVector = genPosNeg();
        randomIncr = (int)(rand.nextDouble() * dirVector * speed);
        y += randomIncr;

        int[] xy = new int[]{x,y};

        return xy;
    }
}
