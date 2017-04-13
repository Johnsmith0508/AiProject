package org.dynalogic.SchiitAi;

import org.dynalogic.SchiitAi.dataType.Object2D;

import java.util.ArrayList;

/**
 * Created by Logan Waldman on 4/11/17.
 */
public class Environment {
    ArrayList<Object2D> objects = new ArrayList<>();
    public void addObject(Object2D object)
    {
        objects.add(object);
    }
}
