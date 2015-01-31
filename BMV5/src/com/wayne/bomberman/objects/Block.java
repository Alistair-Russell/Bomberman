package com.wayne.bomberman.objects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;
import com.wayne.bomberman.framework.GameObject;
import com.wayne.bomberman.framework.ObjectId;
import com.wayne.bomberman.framework.Position;
import com.wayne.bomberman.framework.Texture;
import com.wayne.bomberman.windows.game;

public class Block extends GameObject{

	Texture tex = game.getInstance();
	private int type;//block variation
	public Block(Position p,int type, ObjectId id) {
		super(p, id);
		this.type=type;
		// TODO Auto-generated constructor stub
	}


	public void tick(LinkedList<GameObject> object) {
		// TODO Auto-generated method stub
		
	}

	
	public void render(Graphics g) {//create block on map 
	
		//use next two lines only when no texture files are available 
		//g.setColor(Color.blue);
		//g.drawRect((int) x,(int) y, 32, 32);
		
		//use next two lines only when texture files are available
		
		//type 0 = bound blocks, type 1 = middle structures, type 2 = destructible rocks
		if(type==0)
			g.drawImage(tex.block[0], (int) position.x, (int) position.y, null);
		if(type==1)
			g.drawImage(tex.block[1], (int) position.x, (int) position.y, null);
		if(type==2)
			g.drawImage(tex.block[2], (int) position.x, (int) position.y, null);
		if(type==4)
			g.drawImage(tex.block[4], (int) position.x, (int) position.y, null);
	}


	public Rectangle getBounds() { //bounderies for each block
		
		return new Rectangle((int) position.x, (int)position.y, 32,32); 
	}


	@Override
	public boolean isBombed(Bomb bomb) {
		// TODO Auto-generated method stub
		return false;
	}

}