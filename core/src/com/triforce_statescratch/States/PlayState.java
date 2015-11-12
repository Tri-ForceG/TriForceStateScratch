package com.triforce_statescratch.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.triforce_statescratch.TriForceStateScratch;

/**
 * Created by Matthew on 11/10/2015.
 */
public class PlayState extends TriForceStateScratch implements Screen {

    TriForceStateScratch triForceStateScratch;

    public PlayState(TriForceStateScratch triForceStateScratch){ //References the main class.
        this.triForceStateScratch=triForceStateScratch;
    }

    @Override
    public void show() { //This is called when you set the screen to this class.

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 1, 1); //Blue background.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() { //This is called when the other screen is displayed.

    }

    @Override
    public void dispose() {

    }
}
