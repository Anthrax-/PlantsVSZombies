package com.mygdx.game.Timers;

import com.mygdx.game.Factories.GameObjectFactory;
import com.mygdx.game.GameObject;
import com.mygdx.game.Plants.PuffShroom;
import com.mygdx.game.Plants.Repeater;
import com.mygdx.game.Timers.Timer;
import com.mygdx.game.Zombies.Zombie;

public class PuffShroomTimer extends Timer {
      private final PuffShroom puffShroom;

    public PuffShroomTimer(PuffShroom puffShroom) {
        super(2.2f);
        this.puffShroom=puffShroom;
    }

    

   
    @Override
    public void task() {
        for (GameObject obj : GameObjectFactory.GetObjectsInRow(puffShroom.Row)) {
            if (obj instanceof Zombie) {
                puffShroom.Shot();
                return;
            }

        }
    }
}