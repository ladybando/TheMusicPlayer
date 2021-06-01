import java.util.HashMap;

public class Artist {
    String name;
    String countryOrigin;
    String genre;
    String time_period;

    public Artist(){}

    public Artist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period){
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
    }

    public HashMap<String, String> createArtist(){
        HashMap<String, String> artist
                = new HashMap<>();

        artist.put("name", "Sevyn Streeter");
        artist.put("countryOrigin", "USA");
        artist.put("genre","RnB/Pop");
        artist.put("time_period","21st Century");
        return artist;
    }
    public void show(){
        HashMap<String, String> artist = createArtist();
        System.out.println(
                "\n----____Artist in Artist____----\n"+
               "  Artist name        | " + artist.get("name") + "\n" +
               "  Artist Home Country| " + artist.get("countryOrigin") + "\n" +
               "  Artist genre       | " + artist.get("genre") + "\n" +
               "  Artist time-period | " + artist.get("time_period") +"\n"
       );
    }

}
