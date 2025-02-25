package main;

import object.DoorObj;
import object.KeyObj;
import object.BootsObj;
import object.ChestObj;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject () {
        // gp.obj[0] = new KeyObj();
        // gp.obj[0].worldX = 20 * gp.tileSize;
        // gp.obj[0].worldY = 7 * gp.tileSize;

        // gp.obj[1] = new KeyObj();
        // gp.obj[1].worldX = 34 * gp.tileSize;
        // gp.obj[1].worldY = 14 * gp.tileSize; 

        // gp.obj[2] = new DoorObj();
        // gp.obj[2].worldX = 22 * gp.tileSize;
        // gp.obj[2].worldY = 4 * gp.tileSize; 

        // gp.obj[3] = new DoorObj();
        // gp.obj[3].worldX = 31 * gp.tileSize;
        // gp.obj[3].worldY = 6 * gp.tileSize; 

        gp.obj[0][0] = new DoorObj(gp);
        gp.obj[0][0].worldX = 20 * gp.tileSize;
        gp.obj[0][0].worldY = 12 * gp.tileSize; 

        gp.obj[0][1] = new BootsObj(gp);
        gp.obj[0][1].worldX = 15 * gp.tileSize;
        gp.obj[0][1].worldY = 13 * gp.tileSize; 

        gp.obj[0][2] = new KeyObj(gp);
        gp.obj[0][2].worldX = 7 * gp.tileSize;
        gp.obj[0][2].worldY = 4 * gp.tileSize;

        gp.obj[0][3] = new ChestObj(gp);
        gp.obj[0][3].worldX = 23 * gp.tileSize;
        gp.obj[0][3].worldY = 3 * gp.tileSize;
    }
}
