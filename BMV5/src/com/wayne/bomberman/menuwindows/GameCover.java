package com.wayne.bomberman.menuwindows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class GameCover 
{
	int Xpos = 500;

	public void render(Graphics g) 
	{
		g.setColor(Color.white);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 22)); 
		if(Xpos==250)
		g.drawString("Press SpaceBar to Continue", Xpos, 560);
		Xpos-=250;
		if(Xpos < 0)
			Xpos = 500;
	}
}


