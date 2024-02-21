
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    int[][] arr = new int[3][4];
    Random random = new Random();

    // Populate the array with random integers
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(10);
      }
    }

    // Print the contents of the array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
