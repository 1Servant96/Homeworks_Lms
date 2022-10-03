package homework28Stream.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("The list:\n"+list);
       int sum = list.stream().reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println("The sum: "+sum);
        int arithmeticalMean = (int) (sum / (list.stream().count()));
        System.out.println("Arithmetical mean: "+arithmeticalMean);
        System.out.println("The numbers of elements in array: "+list.stream().count()+"\nNumbers of repeated elements: "
                +(list.stream().count()-list.stream().distinct().count()));

    }

}