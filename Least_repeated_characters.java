import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        int minFreq = Integer.MAX_VALUE;
        for (int val : freq.values()) {
            minFreq = Math.min(minFreq, val);
        }
        StringBuilder result = new StringBuilder();
        Set<Character> printed = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c != ' ' && freq.get(c) == minFreq && !printed.contains(c)) {
                result.append(c);
                printed.add(c);
            }
        }
        if (result.length() == 0)
            System.out.println("-1");
        else
            System.out.println(result.toString());
    }
}