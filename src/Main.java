import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        int[] arr = new int[ARRAY_SIZE];
        Random rand = new Random();

        int count = 0;
        while (count < ARRAY_SIZE) {
          int randomNum = rand.nextInt(10);
          boolean exists = false;

          for (int i = 0; i < count; i++) {
              if(arr[i] == randomNum) {
                  exists = true;
                  break;
              }
          }

          if(!exists) {
              arr[count] = randomNum;
              count++;
          }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}