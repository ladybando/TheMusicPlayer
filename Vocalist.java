import java.util.HashMap;

public class Vocalist extends Artist{
    String influencedBy;

/*    public String getInfluencedBy() {
        return influencedBy;
    }

    public void setInfluencedBy(String influencedBy) {
        this.influencedBy = influencedBy;
    }*/

    public Vocalist(String influencedBy) {
        this.influencedBy = influencedBy;
    }
    public Vocalist() {}


    public void show() {
        Artist artist = new Artist();
        HashMap<String, String> singer = artist.createArtist();
        singer.put("influencedBy", "Stevie Wonder");
        System.out.println(
                "----____Artist in Vocalist____----\n " + "\n" +
                        "  Artist name        | " + singer.get("name") + "\n" +
                        "  Artist Home Country| " + singer.get("countryOrigin") + "\n" +
                        "  Artist genre       | " + singer.get("genre") + "\n" +
                        "  Artist time-period | " + singer.get("time_period") + "\n" +
                        "  Influenced by      | " + singer.get("influencedBy") + "\n"
        );
    }

}
