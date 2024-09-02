import java.util.ArrayList;

/**
 * Example main class for music-organizer-v5.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Track> anOrganizer = new ArrayList<>();
        MusicOrganizer organizer1 = new MusicOrganizer();
        organizer1.addFile("../audio/BlurS2.mp3");
        organizer1.playTrack(7);
    }
}
