import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fib {
    public static void main(String[] args) {
        firFor(10).stream().forEach(System.out::println);
    }

    public static List firFor(int a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            list.add(fib(i));
        }
        return new ArrayList(list);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}