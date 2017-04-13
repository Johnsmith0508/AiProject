package org.dynalogic.SchiitAi;

import org.dynalogic.SchiitAi.dataType.Object2D;
import org.dynalogic.SchiitAi.dataType.Position;

/**
 * Created by School on 4/11/17.
 */
public class Example {
    public static void main(String [] args)
    {
        SchiitBall ball = new SchiitBall(0.5,0.5,0.2,35);

        Environment env = new Environment();
        Object2D sampleObj = new Object2D();

        sampleObj.addVertex(.7,.6);
        sampleObj.addVertex(.8,.8);
        sampleObj.addVertex(.6,.7);

        env.addObject(sampleObj);

        for(int i = 1; i < 100; i++)
        {
            Position pos = ball.getPosition(i);
            System.out.println(pos.x + " " + pos.y);
        }
    }
}
