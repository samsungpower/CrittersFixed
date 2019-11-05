import java.util.Random;

public class Husky {
    //Instantiate variables
    int x = 200;
    int y = 200;


    public static int genPosNeg() {
        Random r = new Random();
        int dirVector = r.nextInt(2) - 1; //creates -1 or +1
        if (dirVector == 0) { //zero exclusive
            dirVector++;
        }
        return dirVector;
    }

    int[] getCords(int speed, int generation, int width, int height) {

        Random rand = new Random();

        if(generation == 0) {
            int dirVector = genPosNeg();
            int randomIncr = (int) (rand.nextDouble() * dirVector * speed);
            x += randomIncr;

            dirVector = genPosNeg();
            randomIncr = (int) (rand.nextDouble() * dirVector * speed);
            y += randomIncr;

            int[] xy = new int[]{x, y}; //pack coordinates into an array to send to the constructor

            return xy;
        } else {

            int dirVector = genPosNeg();
            int randomIncr = (int) (rand.nextDouble() * dirVector * speed);
            x += randomIncr;

            dirVector = genPosNeg();
            randomIncr = (int) (rand.nextDouble() * dirVector * speed);
            y += randomIncr;



            int[] xy = new int[]{x, y}; //pack coordinates into an array to send to the constructor
            return xy;
        }

    }
}
