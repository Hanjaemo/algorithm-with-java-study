import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        int low = 0;
        int high = K;
        while (low + 1 < high) {
            int mid = (low + high) / 2;
            if (check(mid)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println(high);
    }

    static public boolean check(int mid) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count += Math.min(N, mid / i);
        }
        return count < K;
    }
}