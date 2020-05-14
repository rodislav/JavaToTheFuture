package tothefuture;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class StringLines {

    public static void main(String[] args) {

        out.println("-- with split ----------------------------------\n");

        // with previous versions of java we could do something like this
        final String[] split = "some string\nwith\nlines".split("\\n");
        final List<String> strings = Arrays.asList(split);
        strings.forEach(s -> out.println(s.concat(" -->")));

        out.println("\n-- with arrays ----------------------------------\n");

        Arrays.asList("some string\nwith\nlines".split("\\n"))
                .forEach(s -> out.println(s.concat(" -->")));

        out.println("\n-- with lines ----------------------------------\n");

        // lines
        "some string\nwith\nlines"
                .lines()
                .forEach(s -> out.println(s.concat(" -->")));
    }

}
