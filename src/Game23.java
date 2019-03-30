import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int res = sln(n, m);
        System.out.println(res);
    }

    public static int sln(int n, int m) {
        int res = 0;
        if (m % n != 0) return -1;
        int remain = m / n;
        while (remain > 1) {
            while (remain % 2 == 0) {
                remain /= 2;
                res++;
            }
            while (remain % 3 == 0) {
                remain /= 3;
                res++;
            }
            if (remain != 1) return -1;
        }
        return res;
    }
}
