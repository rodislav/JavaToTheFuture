package tothefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        // this is today possible, but not doable at class level
        // we can use a workaround with Arrays.toList() --> A WORKAROUND!
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        List<String> listWithValues = List.of("1", "2", "3");

        Map<String, Integer> mapWithValues = Map.of(
                "1", 1,
                "2", 2,
                "3", 3
        );

    }
}
