import java.util.*;

public class Game_with_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ) {
            int n = sc.nextInt();

            //for (int i = 0; i < n; i++) {
                if(n%3 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");

                }

            //}
        }
    }
}
