import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
        
            int[] a = new int[50];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            for (int i = 0; i < n; i++) {
                int s = sum - a[i];
                
                if (s == a[i] * (n - 1)) {
                    System.out.println("Yes");
                    break;
                }

                if (i == n - 1) {
                    System.out.println("No");
                }
            }
        }
}