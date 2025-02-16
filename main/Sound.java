package main;

import java.net.URL;
import javax.sound.sampled.Clip;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30];

    public Sound() {
        soundURL[0] = getClass().getResource("/res/sound/BlueBoyAdventure");
        soundURL[0] = getClass().getResource("/res/sound/coin");
        soundURL[0] = getClass().getResource("/res/sound/powerup");
        soundURL[0] = getClass().getResource("/res/sound/unlock");
        soundURL[0] = getClass().getResource("/res/sound/fanfare");
    }
}
