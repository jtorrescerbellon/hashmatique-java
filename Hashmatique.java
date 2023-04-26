import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] agrs) {

        /* Creacion y llenado de HashMap */
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Titulo1", "letra1");
        tracklist.put("Titulo2", "letra2");
        tracklist.put("Titulo3", "letra3");
        tracklist.put("Titulo4", "letra4");
        tracklist.put("Titulo5", "letra5");

        /* Extraer letra segun titulo */
        String song = tracklist.get("Titulo1");
        System.out.println(song);

        /* Recorrido de HashMap */
        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key + " - " + "Lyrics: " + tracklist.get(key));
        }

    }
}