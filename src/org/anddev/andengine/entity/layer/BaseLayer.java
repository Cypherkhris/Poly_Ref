package org.anddev.andengine.entity.layer;

import java.util.ArrayList;

import org.anddev.andengine.entity.Entity;
import org.anddev.andengine.entity.scene.Scene.ITouchArea;

/**
 * @author Nicolas Gramlich
 * @since 00:13:59 - 23.07.2010
 */
public abstract class BaseLayer extends Entity implements ILayer{
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final ArrayList<ITouchArea> mTouchAreas = new ArrayList<ITouchArea>();
	private int mZIndex = 0;

	// ===========================================================
	// Constructors
	// ===========================================================

	public BaseLayer() {

	}

	public BaseLayer(final int pZIndex) {
		this.mZIndex = pZIndex;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	@Override
	public int getZIndex() {
		return this.mZIndex;
	}

	@Override
	public void setZIndex(final int pZIndex) {
		this.mZIndex = pZIndex;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public void registerTouchArea(final ITouchArea pTouchArea) {
		this.mTouchAreas .add(pTouchArea);
	}

	@Override
	public void unregisterTouchArea(final ITouchArea pTouchArea) {
		this.mTouchAreas.remove(pTouchArea);
	}

	public ArrayList<ITouchArea> getTouchAreas() {
		return this.mTouchAreas;
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
