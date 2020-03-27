package com.mygdx.game.Timers;

import com.mygdx.game.Factories.SunFactory;

public class DropSunTimer extends Timer {
    public DropSunTimer() {
        super(20f);
    }

    @Override
    public void task() {
        SunFactory.DropSun();
    }
}