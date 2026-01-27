
import java.util.*;

public class fullstack {
    public static void main(String[] args) {
              int[] arr = {21,31,41,71,81};

        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        System.out.println("" + Arrays.toString(arr));
    }
}

// my name is dhruv jain . currently i am pursuing my btech cse from gla university mathura 