package tothefuture;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalEnhacenments {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> numbers2 = List.of(1, 3, 5); // this list will fail


        // or Else Throw - get value or else throw java.util.NoSuchElementException exception
        Integer firstEven = numbers.stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow();

        System.out.println(firstEven);

        final Optional<String> string = Optional.of("string with value");
        final Optional<String> stringEmpty = Optional.empty();


        // if Present Or Else - if present then execute first lamba, or else execute second lamba
        stringEmpty.ifPresentOrElse(
                s -> System.out.println(s),
                () -> System.out.println("oh no, the thing is emty"));


        // or - get the value -OR- execute the lamba which should provide an optional with value or empty
        final Optional<String> orString = stringEmpty.or(() -> Optional.of("this is a backup string"));
        System.out.println(orString.get());


        // stream
        final List<String> collect = string.stream().collect(Collectors.toList());
        System.out.println(Arrays.toString(collect.toArray()));

        final List<String> collectEmpty = stringEmpty.stream().collect(Collectors.toList());
        System.out.println(Arrays.toString(collectEmpty.toArray()));
    }

}
