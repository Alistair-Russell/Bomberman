package com.wayne.bomberman.framework;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.wayne.bomberman.objects.Bomb;

public abstract class GameObject {

	
	public Position position; // for coordinates
	protected ObjectId id; // for identification of what it is, ex block, player, power up
	protected int velX=0, velY=0;//used for characters, sets speed values
	
	public GameObject(Position p, ObjectId id){
		//constructor for object
		
		position = p;
		this.id = id;
	}
	
	public abstract void tick(LinkedList<GameObject> object);
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	public abstract boolean isBombed(Bomb bomb);
	
	
	public float getVelX(){
		return velX;
	}
	public float getVelY(){
		return velY;
	}
	public void setVelX(int velX){
		this.velX= velX;
	}
	public void setVelY(int velY){
		this.velY= velY;
	}	

	public  ObjectId getId(){
		return id;
	}


	public void moveUp(int velocity) {
		this.velY = (-1)*velocity;
	}
	public void moveDown(int velocity) {
		this.velY = velocity;
	}
	public void moveLeft(int velocity) {
		this.velX = (-1)*velocity;
	}
	public void moveRight(int velocity) {
		this.velX = velocity;
	}


	public Position getPosition() {
		return position;
	}
	public void setPosition(int x, int y) {
		position.setX(x);
		position.setY(y);
	}

}
