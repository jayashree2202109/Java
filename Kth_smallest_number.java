import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : arr) {
            set.add(x);
        }
        if (K > set.size()) {
            System.out.println(-1);
            return;
        }
        int i = 1;
        for (int x : set) {
            if (i == K) {
                System.out.println(x);
                return;
            }
            i++;
        }
    }
}
