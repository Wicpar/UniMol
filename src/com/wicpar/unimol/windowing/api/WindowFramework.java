package com.wicpar.unimol.windowing.api;

/**
 * Created by Frederic on 05/04/2016 at 21:33.
 *
 * Windowing interface in case you don't like GLFW,
 * See, I even care for you people :)
 */
public interface WindowFramework
{
	/**
	 * the initialization function, will be called at the start
	 * Has to init OpenGl context for now, a seperate framework for rendering and physics will be used later
	 * GLFW does OpenGl initialization implicitly so it's ok
	 */
	void init();

	/**
	 * the deinitialization function, will be called in the end
	 */
	void deInit();

	/**
	 * sets the callback of the loop body, usually used for rendering, but should be used for real time physics too
	 * @param body the class containing the body callback
	 */
	void setLoopBody(LoopBody body);

	/**
	 * used to set a maximum framerate
	 * @return the actual FPS set, should be closest possible to demanded one, or -1 for infinite
	 */
	double setMaxFPS();

	/**
	 * used to get the time passed in the last frame, also called DeltaT
	 * @return the DeltaT
	 */
	double getFrameDelta();

	/**
	 * called to put an end to the program loop. it should result in the termination of the program
	 * @return success
	 */
	boolean setLoopShouldEnd();
}
