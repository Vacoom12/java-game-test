package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class KeyObj extends SuperObject {
    public KeyObj() {
        name = "Key";
        
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}