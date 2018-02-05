package bdk.game.component;

import java.awt.Graphics2D;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Components are top-level classes that have control over a section of the
 * game.(Menu/Level)
 * 
 * @author Andreas Farley
 *
 */
public abstract class Component implements Serializable {

	// Contains the imagesPaths used by every Entity of this component, only set during runtime.
	protected transient ArrayList<String> imagePathList;
	// protected ArrayList<Sprite> spriteList;
	protected String componentName;

	/**
	 * Updates all entities in the entityList. This is abstract since components
	 * might want to change the update order of their entities.
	 */
	public abstract void update();

	/**
	 * Renders all entities in the entityList. This is abstract since components
	 * might want to change the render order of their entities.
	 * 
	 * @param g
	 */
	public abstract void render(Graphics2D g);

	public ArrayList<String> getImagePathList() {
		return imagePathList;
	}

	public void setImagePathList(ArrayList<String> imagePathList) {
		this.imagePathList = imagePathList;
	}

}
