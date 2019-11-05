import java.util.Random;

public class Husky {
    //Instantiate variables


    static int[] getCords(int speed, int width, int height) {
        int x = width/2;
        int y = height/2;
        Random rand = new Random();

        int dirVector = rand.nextInt(2) - 1; //creates -1 or +1
        if (dirVector == 0) { //zero exclusive
            dirVector++;
        }

        int randomIncr = (int)rand.nextDouble() * dirVector * speed;
        x += randomIncr;
        randomIncr = (int)rand.nextDouble() * dirVector * speed; //regen randomIncr
        y += randomIncr;

        int[] xy = new int[]{x,y};
        System.out.println("x = " + xy[0] + " y = " + )
        return xy;
    }
}
