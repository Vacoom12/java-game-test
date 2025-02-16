package main;

import object.DoorObj;
import object.KeyObj;
import object.BootsObj;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject () {
        gp.obj[0] = new KeyObj();
        gp.obj[0].worldX = 20 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new KeyObj();
        gp.obj[1].worldX = 34 * gp.tileSize;
        gp.obj[1].worldY = 14 * gp.tileSize; 

        gp.obj[2] = new DoorObj();
        gp.obj[2].worldX = 22 * gp.tileSize;
        gp.obj[2].worldY = 4 * gp.tileSize; 

        gp.obj[3] = new DoorObj();
        gp.obj[3].worldX = 31 * gp.tileSize;
        gp.obj[3].worldY = 6 * gp.tileSize; 

        gp.obj[4] = new DoorObj();
        gp.obj[4].worldX = 32 * gp.tileSize;
        gp.obj[4].worldY = 11 * gp.tileSize; 

        gp.obj[5] = new BootsObj();
        gp.obj[5].worldX = 18 * gp.tileSize;
        gp.obj[5].worldY = 15 * gp.tileSize; 

        gp.obj[6] = new KeyObj();
        gp.obj[6].worldX = 21 * gp.tileSize;
        gp.obj[6].worldY = 4 * gp.tileSize; 
    }
}
