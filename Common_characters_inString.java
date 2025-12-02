import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
         boolean[] seen = new boolean[256];
         for(int i = 0; i < s1.length(); i++) {
            seen[s1.charAt(i)] = true;
        }
         for(int i = 0; i < s2.length(); i++) {
            if(seen[s2.charAt(i)]) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}