package com.hydrozoa.pokemon.screen;

import com.badlogic.gdx.Screen;
import com.hydrozoa.pokemon.Pokemon;

public abstract class AbstractScreen implements Screen{

	private Pokemon app;
	
	public AbstractScreen(Pokemon app) {
		 this.app = app;
	}
	
	@Override
	public abstract void dispose();
	
	@Override
	public abstract void hide();

	@Override
	public abstract void pause() ;

	@Override
	public abstract void render(float delta) ;

	@Override
	public abstract void resize(int width, int height);

	@Override
	public abstract void resume();

	@Override
	public abstract void show();
	
	public Pokemon getApp() {
		return app;
	}
}
