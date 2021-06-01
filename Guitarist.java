import java.util.HashMap;

public class Guitarist extends Artist{
    private int numStrings;

    public Guitarist(int numStrings) {
        this.numStrings = numStrings;
    }
    public Guitarist(){}

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public HashMap<String, String> createGuitarist(){
        HashMap<String, String> songs
                = new HashMap<>();
        songs.put("title", "Samba Pa Ti");
        songs.put("playlist", "Smooth");
        songs.put("numStrings","6");
        songs.put("musician","Carlos Santana");
        songs.put("guitarist", "Carlos Santana");
        return songs;
    }
    public void show(){
        HashMap<String, String> song = createGuitarist();
        System.out.println(
                "\n----____Guitarist in Guitarist____----\n"+
                        "  Song Title         | " + song.get("title") + "\n" +
                        "  Playlist Name      | " + song.get("playlist") + "\n" +
                        "  Guitar Strings     | " + song.get("numStrings") + "\n" +
                        "  Musician           | " + song.get("musician") +"\n" +
                        "  Guitarist          | " + song.get("guitarist") +"\n"
        );
    }
}
