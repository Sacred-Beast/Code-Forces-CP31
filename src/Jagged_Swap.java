import java.util.*;

public class Jagged_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }



            /*if(n==3 && arr[0] == 1 && arr[1] == 2 && arr[2] == 3){
                //System.out.println("YES");
                //break;
            }
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {*/
                if(arr[0] == 1){
                    System.out.println("YES");
                    //break;
                } else {
                    System.out.println("NO");
                    //break;
                }

            //}
        }
    }
}