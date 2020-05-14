package tothefuture;

import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;

@SuppressWarnings("Convert2MethodRef")
public class LambdaTypeInference {

    public static void main(String[] args) {
        Function<String, String> append = (String string) -> string + " ";

        Function<String, String> append2 = (var s) -> s + " concat";

        out.println(append2.apply("string"));

        // compile error in Java 10
        // Function<String, String> append3 = (var string) -> string + " ";

        List<EnterpriseGradeType<With, Generics>> listOfItems = List.of();

        // WITHOUT lambda type inference
        listOfItems.forEach((EnterpriseGradeType<With, Generics> item) -> out.println(item));

        // WITH lambda type inference
        listOfItems.forEach((var item) -> out.println(item));
    }

    class With {}

    class Generics {}

    class EnterpriseGradeType<T, G> {}
}
