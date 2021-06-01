import java.util.HashMap;

public class Song {
    String title;
    String playlist;
    String url;
    Vocalist musician;
    TrumpetPlayer trumpeter;
    Guitarist guitarist;

    public Song(){}

    public Song(String title, String playlist, String url, Vocalist musician, TrumpetPlayer trumpeter, Guitarist guitarist) {
        this.title = title;
        this.playlist = playlist;
        this.url = url;
        this.musician = musician;
        this.trumpeter = trumpeter;
        this.guitarist = guitarist;
    }

    public HashMap<String, String> createSong(){
        HashMap<String, String> songs
                = new HashMap<>();

        songs.put("title", "Kissez");
        songs.put("playlist", "Smooth");
        songs.put("url","https://www.youtube.com/watch?v=nNpASlGAgcI");
        songs.put("musician","Sevyn Streeter");
        songs.put("guitarist", "none :(");
        return songs;
    }

    public void show(){
        HashMap<String, String> songList = createSong();
        System.out.println(
                "\n----____Songs in Songs____----\n"+
                        "  Song Title       | " + songList.get("title") + "\n" +
                        "  Playlist Name    | " + songList.get("playlist") + "\n" +
                        "  Website          | " + songList.get("url") + "\n" +
                        "  Musician Name    | " + songList.get("musician") +"\n" +
                        "  Guitarist        | " + songList.get("guitarist")
        );
    }
}
