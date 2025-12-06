import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < N; i++) {
            if (arr[i] < arr[i - 1]) asc = false;
            if (arr[i] > arr[i - 1]) desc = false;
        }
        if (asc || desc)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}