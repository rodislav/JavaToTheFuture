package tothefuture;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

public class CollectionsToTypedArray {

    public static void main(String[] args) {
        var users = List.of("toto", "bula", "jdoe");

        final Object[] objects = users.toArray();

        // to array with type
        final String[] strings = users.toArray(String[]::new); // String[]::new --> magic lambda to be used to instantiate elements of the array

        var clients = new ArrayList<HttpClient>();
        final HttpClient[] httpClientsArray = clients.toArray(HttpClient[]::new); // HttpClient[]::new --> magic lambda to be used to instantiate elements of the array
    }

}
