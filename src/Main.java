import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("satou","tanaka","takahashi","suzuki");
        names.stream()
                .filter(name -> name.startsWith("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(3,4,7,1,2);
        numbers.stream()
                .filter(n -> n < 4)
                .sorted()
                .forEach(System.out::println);
    }
}