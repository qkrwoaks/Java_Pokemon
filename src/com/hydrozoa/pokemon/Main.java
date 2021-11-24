package com.hydrozoa.pokemon;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "Pokemon GSM";
		config.height = 400;
		config.width = 600;
		config.vSyncEnabled = true;
		config.foregroundFPS = 200;
		config.addIcon("res/graphics/pokeball_icon.png", Files.FileType.Local);
		
		new LwjglApplication(new Pokemon(), config);
	}
}
