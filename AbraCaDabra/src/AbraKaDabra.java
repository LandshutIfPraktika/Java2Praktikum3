import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by s-gheldd on 11/9/15.
 */
public class AbraKaDabra {

    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("abra", "ka", "dabra", "sim", "sa", "la", "bim");


        Stream<String> abraStream = strings.stream();

        abraStream
                .filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);

        abraStream = Arrays.asList("abra", "", "ka", "da", "bra", "", "simsala", "", "bim").stream();

        System.out.println();
        System.out.println(abraStream
                .filter(String::isEmpty)
                .count());
        System.out.println();


        IntStream.generate(()->((int)(2*(Math.random()-0.5)*Integer.MAX_VALUE)))
                .limit(10)
                .forEach(System.out::println);

        System.out.println();
        IntStream.generate(()->((int)(2*(Math.random()-0.5)*Integer.MAX_VALUE)))
                .limit(10)
                .filter(n->(n>=0))
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        IntStream.generate(()->((int)(2*(Math.random()-0.5)*Integer.MAX_VALUE)))
                .limit(10)
                .sorted()
                .forEach(System.out::println);

    }
}
