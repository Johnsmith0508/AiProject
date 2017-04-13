package org.dynalogic.SchiitAi;

import org.dynalogic.SchiitAi.dataType.Position;

/**
 * Created by Logan Waldman on 4/11/17.
 */
public class Ball {
    private double startX, startY, velX, velY;
    private Environment env;
    private Position currentPos;
    public Ball(double startX, double startY, double velMag, double velTheta, Environment env) {
        this.startX     = startX;
        this.startY     = startY;
        this.velX       = velMag * Math.sin(Math.toRadians(velTheta));
        this.velY       = velMag * Math.cos(Math.toRadians(velTheta));
        this.env        = env;
        currentPos.set(startX,startY);
    }

    public Position getPosition(double keyFrame)
    {
        double posX = startX + velX * keyFrame;
        if(posX >= 1) {
            posX = 1 - posX;
            velX *= -1;
        }
        if(posX <= 0 ) {
            posX = posX % 1 * -1;
            velX *= -1;
        }
        double posY = startY + velY * keyFrame;
        if(posY >= 1) {
            posY = 1 - posY;
            velY *= -1;
        }
        if(posY <= 0 ) {
            posY = posY % 1 * -1;
            velY *= -1;
        }

        return new Position(posX,posY);

    }
    public Position step(double incerement)
    {
        double posX = currentPos.x + velX * incerement;
        if(posX >= 1) {
            posX = 1 - posX;
            velX *= -1;
        }
        if(posX <= 0 ) {
            posX = posX % 1 * -1;
            velX *= -1;
        }
        double posY = currentPos.y + velY * incerement;
        if(posY >= 1) {
            posY = 1 - posY;
            velY *= -1;
        }
        if(posY <= 0 ) {
            posY = posY % 1 * -1;
            velY *= -1;
        }
        return currentPos.set(posX,posY);
    }
}
