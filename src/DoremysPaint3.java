import java.util.*;

public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
           int n = sc.nextInt();
           int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Map<Integer, Integer> frq = new HashMap<>();
            for(int val : arr) {
                frq.put(val, frq.getOrDefault(val,0) + 1);
            }

            if (frq.size() >= 3) {
                System.out.println("No");
            } else {


                int frq1 = frq.values().iterator().next();
                int frq2 = (int) frq.values().toArray()[frq.size() - 1];

                if (n % 2 == 1 && Math.abs(frq1 - frq2) == 1) {
                    System.out.println("Yes");
                } else if (frq1 == frq2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
