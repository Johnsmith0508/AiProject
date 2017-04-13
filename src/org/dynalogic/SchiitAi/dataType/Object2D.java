package org.dynalogic.SchiitAi.dataType;

import java.util.ArrayList;

/**
 * Created by Logan Waldman on 4/11/17.
 */
public class Object2D {
    ArrayList<Position> vertex = new ArrayList<>();

    public void addVertex(Position vert)
    {
        vertex.add(vert);
    }
    public void addVertex(double x, double y)
    {
        vertex.add(new Position(x,y));
    }
}
