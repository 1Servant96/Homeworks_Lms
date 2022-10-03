package homework28Stream.first;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
       List<Integer> massive =  random.ints(0,100).limit(10).boxed().collect(Collectors.toList());
        System.out.println(massive);
        System.out.println(massive.stream().filter(x -> x.intValue() % 2 == 0).map(x -> x * x).max(Comparator.comparing(x -> x.intValue())));

    }
}
