import java.util.ArrayList;


public class MusicPlayer {
    public static void main(String[] args){
       Artist artist = new Artist();
       artist.show();


       TrumpetPlayer musician = new TrumpetPlayer();
       musician.show();


       Vocalist singer = new Vocalist();
       singer.show();


       Guitarist guitarist = new Guitarist();
       guitarist.show();


       Song song = new Song();
       song.show();
    }

   public ArrayList<String> createArtists(){
      ArrayList<String> artist = new ArrayList<>();

      artist.add("Sevyn Streeter");
      artist.add( "USA");
      artist.add("RnB/Pop");
      artist.add("21st Century");
      return artist;
   }
}
