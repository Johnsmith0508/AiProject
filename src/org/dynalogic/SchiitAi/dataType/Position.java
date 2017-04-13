package org.dynalogic.SchiitAi.dataType;

/**
 * Created by School on 4/11/17.
 */
public class Position {
    public double x,y;
    public Position()
    {
        this(0,0);
    }
    public Position(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public Position set(double x, double y)
    {
        this.x = x;
        this.y = y;
        return this;
    }
}
