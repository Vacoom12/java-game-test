package object;

import java.io.IOException;
import javax.imageio.ImageIO;

import main.GamePanel;

public class DoorObj extends SuperObject {
    GamePanel gp;
    
    public DoorObj(GamePanel gp) {
        name = "Door";
        
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/door.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }

        collision = true;
    }
}