package main;


import object.KeyObj;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

public class UI {
    GamePanel gp;
    Graphics2D g2;
    Font arial40, arial80B;
    BufferedImage keyImg;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0; 
    public boolean gameFinished = false;
    public int commandNum = 0;

    double playTime;
    DecimalFormat dFormat = new DecimalFormat("#0.00");

    public UI(GamePanel gp) {
        this.gp = gp;

        arial40 = new Font("Arial", Font.PLAIN, 40);
        arial80B = new Font("Arial", Font.BOLD, 80);
        KeyObj key = new KeyObj();
        keyImg = key.image;
    }

    public void showMessage(String text) {
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2) {
        this.g2 = g2;
        g2.setFont(arial40);

        if (gp.gameState == gp.titleState) {
            drawTitleScreen();
        }
        if (gp.gameState == gp.playState) {
            drawGameContent();
        }
        if (gp.gameState == gp.pauseState) {
            drawPauseScreen();
        }
    }

    public void drawTitleScreen() {
        g2.setColor(Color.black);
        g2.fillRect(0, 0, gp.screenWidth, gp.screenWidth);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 96F));
        String text = "Ryan Adventure";
        int x = getCenterX(text);
        int y = gp.tileSize * 3;

        // g2.setColor(Color.black);
        // g2.drawString(text, x+5, y+5);
        g2.setColor(Color.white);
        g2.drawString(text, x, y);

        x = gp.screenWidth / 2 - (gp.tileSize * 2) / 2;
        y += gp.tileSize * 2;
        g2.drawImage(gp.player.down1, x, y, gp.tileSize * 2, gp.tileSize * 2, null);

        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 48F));
        text = "PLAY";
        x = getCenterX(text);
        y += gp.tileSize * 6;
        g2.drawString(text, x, y);
        if (commandNum == 0) {
            g2.drawString(">", x - gp.tileSize, y);
        }

        g2.setFont(g2.getFont().deriveFont(Font.BOLD, 48F));
        text = "QUIT";
        x = getCenterX(text);
        y += gp.tileSize * 2;
        g2.drawString(text, x, y);
        if (commandNum == 1) {
            g2.drawString(">", x - gp.tileSize, y);
        }
    }

    public void drawPauseScreen() {
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN, 80F));
        g2.setColor(Color.white);
        String text = "PAUSED";
        int x = getCenterX(text);
        int y = gp.screenHeight / 2;

        g2.drawString(text, x, y);
    }

    public void drawGameContent() {
        if (gameFinished) {
            g2.setFont(arial40);
            g2.setColor(Color.white);

            String text;
            int textLenght;
            int x;
            int y;

            text = "You found treasure";
            textLenght = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLenght / 2;
            y = gp.screenHeight / 2 - (gp.tileSize * 3);
            g2.drawString(text, x, y);
            
            text = "Play time is : " + dFormat.format(playTime);
            textLenght = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLenght / 2;
            y = gp.screenHeight / 2 + (gp.tileSize * 4);
            g2.drawString(text, x, y);

            g2.setFont(arial80B);
            g2.setColor(Color.yellow);
            text = "Congratulation!";
            textLenght = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth / 2 - textLenght / 2;
            y = gp.screenHeight / 2 + (gp.tileSize * 2);
            g2.drawString(text, x, y);

            gp.gameThread = null;

        } else {
            g2.setFont(arial40);
            g2.setColor(Color.white);
            g2.drawImage(keyImg, gp.tileSize / 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            g2.drawString(": " + gp.player.hasKey, 74, 65);

            playTime += (double) 1/60;
            g2.drawString("Time: " + dFormat.format(playTime), gp.tileSize * 23, 65);
    
            if (messageOn) {
                g2.setFont(g2.getFont().deriveFont(20));
                g2.drawString(message, gp.tileSize / 2, gp.tileSize * 3);
                messageCounter++;
    
                if (messageCounter == 90) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }
    }

    public int getCenterX(String text) {
        int length = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gp.screenWidth/2 - length/2;
        return x;
    }
}
