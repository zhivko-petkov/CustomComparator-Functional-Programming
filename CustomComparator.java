package EXERCISE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        List<Integer> sortedNums = new ArrayList<>();
        Predicate<Integer> isEven =
                number -> number % 2 == 0;
        int [] evenNum = Arrays.stream(numbers).filter(num -> num % 2 == 0).sorted().toArray();
        Arrays.stream(evenNum).forEach(a -> System.out.print(a + " "));
        int [] oddNum = Arrays.stream(numbers).filter(num -> num % 2 != 0).sorted().toArray();
        Arrays.stream(oddNum).forEach(a -> System.out.print(a + " "));
    }
}
