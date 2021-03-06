package com.ray3k.splashscreen.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ray3k.splashscreen.Core;

public class DesktopLauncher {

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        Core core = new Core();
        core.setSplashWorker(new DesktopSplashWorker());
        new LwjglApplication(core, config);
    }
}
