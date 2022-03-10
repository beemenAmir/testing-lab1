import java.util.Scanner;


public class Young {


    public static String main(int n, int... args) {
        int arr[][] = new int[n][3];
        int k = 0;
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
        for (int j = 0; j < n; j++) {

        while (k< args.length) {
            arr[j][0] = args[k];
            k++;
            arr[j][1] = args[k];
            k++;
            arr[j][2] = args[k];
            k++;

            sumX += arr[j][0];
            sumY += arr[j][1];
            sumZ += arr[j][2];
        }
        }


        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            return ("YES");

        } else {
            return ("NO");
        }


    }

}
