package tothefuture;

public class TextBlocks {

    public static void main(String[] args) {
        String jsonString = "{\r\n\"field\" : \"value\",\r\n\"otherField\" : \"otherValue\"\r\n}";

        jsonString = "{\"field\" : \"value\",\"otherField\" : \"otherValue\"}";

        jsonString
                = "{"
                + "\"field\" : \"value\","
                + "\"otherField\" : \"otherValue\""
                + "}";

        // Text blocks in action
        // we can inject language or reference in Intellij Idea
        jsonString
                = """
                {
                    "field" : "value",
                    "otherField" : "otherValue"
                }
                """;
    }

}
