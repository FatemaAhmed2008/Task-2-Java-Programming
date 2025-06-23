import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {

    // Song class representing a song with title and artist
    static class Song {
        private String title;
        private String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        @Override
        public String toString() {
            return title + " by " + artist;
        }
    }

    // MusicLibrary class managing a collection of songs
    private List<Song> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    // Add a song to the library
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the library by title
    public boolean removeSong(String title) {
        return songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    // Display all songs in the library
    public void displaySongs() {
        System.out.println("All songs:");
        for (Song song : songs) {
            System.out.println(song);
        }
        System.out.println();
    }

    // Play a random song from the library
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs available to play.");
            return;
        }
        int index = random.nextInt(songs.size());
        Song randomSong = songs.get(index);
        System.out.println("Now playing: " + randomSong);
    }

    // Main method to test the MusicLibrary
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Add songs
        library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        library.addSong(new Song("Imagine", "John Lennon"));
        library.addSong(new Song("All by Myself", "Eric Carmen"));
        library.addSong(new Song("What'd I Say", "Ray Charles"));
        library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
        library.addSong(new Song("In the Air Tonight", "Phil Collins"));

        // Display all songs
        library.displaySongs();

        // Play random songs
        System.out.println("*Playing Random Song*");
        library.playRandomSong();
        library.playRandomSong();
        library.playRandomSong();
   }
}

