import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        if (N == 0) {
            System.out.println("-1");
            return;
        }
        int maxLen = 1;
        int currLen = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
            } else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }
        maxLen = Math.max(maxLen, currLen);
        if (maxLen == 1)
            System.out.println("-1");
        else
            System.out.println(maxLen);
    }
}