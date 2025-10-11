import java.util.*;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ) {
            int n = sc.nextInt();
            String s = sc.next();

            int emptyCell = 0;

            for(int i = 0; i<n; i++) {
                if(s.charAt(i) == '.') {
                    emptyCell++;
                }
            }

            System.out.println(s.contains("...") ? 2 : emptyCell);

        }
    }

}
