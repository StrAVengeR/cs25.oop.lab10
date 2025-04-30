import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class StringProcessor {
    public void processStrings(List<String> input,
                               Predicate<String> predicate,
                               Function<String, String> transformer,
                               Consumer<String> action) {

        input.stream()
             .filter(predicate)
             .map(transformer)
             .forEach(action);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("гаршил", "моргаль", "тусламж");

        StringProcessor processor = new StringProcessor();

        Predicate<String> pred = s -> s.length() > 5;
        Function<String, String> func = s -> new StringBuilder(s).reverse().toString();
        Consumer<String> cons = s -> System.out.println("ГАРШИЛ: " + s.toUpperCase());

        processor.processStrings(words, pred, func, cons);
    }
}
