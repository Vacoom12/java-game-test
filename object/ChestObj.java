package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class ChestObj extends SuperObject {
    public ChestObj() {
        name = "Chest";
        
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/chest.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}