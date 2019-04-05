import java.util.*;

public class CF550_Div3_E {
    //Median String
    //26 进制的大数加减法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        String res = sln(s, t, k);
        System.out.println(res);
    }

    public static String sln(String s, String t, int k) {
        char[] S = new StringBuilder(s).reverse().toString().toCharArray();
        char[] T = new StringBuilder(t).reverse().toString().toCharArray();
        char[] C = new char[k + 1];
        for (int i = 0; i < k; i++) {
            C[i] = (char) (S[i] - 'a' + T[i] - 'a');
        }
        for (int i = 0; i < k; i++) {
            C[i + 1] += C[i] / 26;
            C[i] %= 26;
        }
        for (int i = k; i >= 0; i--) {
            if (C[i] % 2 != 0) C[i - 1] += 26;
            C[i] /= 2;
        }
        for (int i = 0; i < k; i++) C[i] += 'a';
        return new StringBuilder(String.valueOf(C, 0, k)).reverse().toString();
    }
}
