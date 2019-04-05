import java.util.*;

public class CF550_Dive3_A {
    //Diverse Strings
    //都是lower case letters, 放进bucket后判断是否 bucket 的桶是连续的, 且都只出现了一次
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (sln(s)) System.out.println("yes");
            else System.out.println("no");
        }
    }

    static boolean sln(String s) {
        int n = s.length();
        if (n == 1) return true;
        int[] bucket = new int[26];
        for (char c : s.toCharArray()) bucket[c - 'a']++;
        int left = -1, right = -1, count = 0;
        for (int i = 0; i < 26; i++) {
            if (bucket[i] > 1) return false;
            if (bucket[i] == 1) {
                if (count == 0) {
                    left = i;
                }
                right = i;
                count++;
            }
        }
        return count == right - left + 1;
    }
}
