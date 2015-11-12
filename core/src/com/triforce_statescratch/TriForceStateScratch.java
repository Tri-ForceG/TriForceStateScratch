package com.triforce_statescratch;

import com.badlogic.gdx.Game;
import com.triforce_statescratch.States.MainMenuState;
import com.triforce_statescratch.States.PlayState;

import java.util.ArrayList;

public class TriForceStateScratch extends Game { //https://code.google.com/p/libgdx-users/wiki/ScreenAndGameClasses

	ArrayList<Integer> arListState; //An ArrayList to hold Integers.

	public Integer nCurrentState, nPlayState, nMenuState, nInstructState; //Make them Public; accessible to other classes.

	MainMenuState mainMenuState; //Instances of the other classes to call.
	PlayState playState;

	@Override
	public void create () {

		mainMenuState = new MainMenuState(this);
		playState = new PlayState(this);

		arListState = new ArrayList<Integer>(3); //Set the initial capacity to 3.

		for(int i = 0; i <= 2; i++) { //Can't loop through initial size of ArrayList - doesn't contain anything.
			arListState.add(new Integer(i));
		}

		nMenuState = new Integer(arListState.get(0)); //Index 0 = 0, Index 1 = 1, Index 2 = 2
		nPlayState = new Integer(arListState.get(1));
		nInstructState = new Integer(arListState.get(2));

		System.out.println(arListState);
		System.out.println(nMenuState);
		System.out.println(nPlayState);
		System.out.println(nInstructState);

		nCurrentState = nMenuState; //Initial screen needs to be the MainMenuState.

		System.out.println(nCurrentState);

		if(nCurrentState.equals(nMenuState)){ //Will initially display MainMenuState, PlayState will display if screen is clicked.
			System.out.println("CurrentState equals MenuState");
			setScreen(mainMenuState);
		}else if(nCurrentState.equals(nPlayState)){
			System.out.println("CurrentState equals PlayState");
			setScreen(playState);
		}
	}
    //If you include this render, it will display whatever is here, and not the render in the other classes.
	//@Override
	//public void render () {
	//Gdx.gl.glClearColor(1, 0, 0, 1);
	//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	//}
}
