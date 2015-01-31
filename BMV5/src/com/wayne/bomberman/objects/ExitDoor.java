package com.wayne.bomberman.objects;

import java.awt.Graphics;

import java.awt.Rectangle;
import java.util.LinkedList;

import com.wayne.bomberman.framework.GameObject;

import com.wayne.bomberman.framework.ObjectId;
import com.wayne.bomberman.framework.Position;
import com.wayne.bomberman.framework.Texture;

import com.wayne.bomberman.windows.game;

public class ExitDoor extends GameObject {
	
	Texture tex = game.getInstance();
	//private int type;//block variation
	
	public ExitDoor(Position p, ObjectId id) {
		super(p, id);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void tick(LinkedList<GameObject> object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(tex.exitDoor[0], (int) position.x, (int) position.y, null);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) position.x, (int)position.y, 32,32); 
	}

	@Override
	public boolean isBombed(Bomb bomb) {
		// TODO Auto-generated method stub
		return false;
	}

}