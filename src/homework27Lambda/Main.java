package homework27Lambda;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(4.0));
    }

    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> a = x-> Math.sqrt(x);
        return a;
    }
}
