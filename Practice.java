public class Practice {

    static int fun(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return fun(n / 10, c + 1);
        }
        return fun(n / 10, c);

    }

    public static void main(String[] args) {
        // System.out.println("HEllo");

        System.out.println(fun(120022, 0));
    }
}