package com.hydrozoa.pokemon;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.hydrozoa.pokemon.screen.GameScreen;

public class Pokemon extends Game {

	private GameScreen screen;
	
	@Override
	public void create() {
		screen = new GameScreen(this);
		
		this.setScreen(screen);
	}
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}

}
