package org.dynalogic.SchiitAi;

/**
 * Created by Logan Waldman on 4/13/17.
 */
public class Ai {
    private double startX, startY, playerX, playerY;

    public Ai(double startX, double startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public Ai(double startX, double startY, double playerX, double playerY) {

        this.startX = startX;
        this.startY = startY;
        this.playerX = playerX;
        this.playerY = playerY;
    }

    public Ai setPlayerPosition(double playerX, double playerY) {
        this.playerX = playerX;
        this.playerY = playerY;
        return this;
    }
}
