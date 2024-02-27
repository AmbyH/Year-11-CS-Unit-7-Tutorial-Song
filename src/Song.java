import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> old;

    public Song(String a, String b) {
        title = a;
        artist = b;
        old = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int count = 0;
        for (String listener : listeners) {
            if (!old.contains(listener.toLowerCase())) {
                old.add(listener.toLowerCase());
                count++;
            }
        }
        return count;
    }


}
