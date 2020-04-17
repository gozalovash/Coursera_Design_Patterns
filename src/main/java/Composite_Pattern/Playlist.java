package Composite_Pattern;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }
    public void add(IComponent component){
        playlist.add(component);
    }

    public void remove(IComponent component){
        playlist.remove(component);
    }

    @Override
    public void play() {
        System.out.println(playlistName + "is playing");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent song:playlist){
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }
}
