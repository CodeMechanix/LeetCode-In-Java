public class LeetCode_1486 {
    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }

    public static int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ (start + 2 * i);
        }
        return xor;
    }
}