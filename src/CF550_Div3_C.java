import java.util.*;

public class CF550_Div3_C {
    //Two Shuffled Sequences
    //把一个打乱的数组分割成两个数组: 一个严格递增,一个严格递减, 输出 yes or no

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bucket = new int[200001];
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            bucket[index]++;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                l1.add(i);
                bucket[i]--;
            }
        }
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] > 0) {
                l2.add(i);
                bucket[i]--;
            }
        }
        boolean f = true;
        for (int b : bucket) {
            if (b > 0) {
                System.out.println("NO");
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("YES");
            System.out.println(l1.size());
            for (int l : l1) System.out.print(l + " ");
            System.out.println();
            System.out.println(l2.size());
            for (int l : l2) System.out.print(l + " ");
        }
    }
}
