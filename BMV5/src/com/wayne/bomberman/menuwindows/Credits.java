package com.wayne.bomberman.menuwindows;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Credits {
	//buttons
	public Rectangle backButton = new Rectangle(650,540,120,40);

		public void render(Graphics g){
			
			Graphics2D g2d = (Graphics2D) g;
			g.setColor(Color.magenta);
			g.setFont(new Font("CenturyGothic", Font.BOLD, 20));
			g.drawString("Back", 685, 565);
			g2d.draw(backButton);
			
			int xPos = 25;
			int yPos = 75;
			int x1 = 75;
			int y1 = 40;
			
			g.setColor(Color.magenta);
			//Title
			g.setFont(new Font("CenturyGothic", Font.BOLD, 30)); 
			g.drawString("BomberMan Reloaded", 255, 40);
			
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			//acting titles
			g.drawString("President:",xPos, yPos);//President
			g.drawString("Chief Executive Officer:",xPos, yPos+y1);//CEO
			g.drawString("Chief Financial Officer:",xPos, yPos+2*y1);//CFO
			g.drawString("Chief Operating Officer:",xPos, yPos+3*y1);//COO
			g.drawString("Vice-President:",xPos, yPos+4*y1);//VP
			g.drawString("Intern #4:",xPos, yPos+5*y1);//intern
			
			//names
			int x2=xPos+3*x1;
			g.setColor(Color.magenta);
			g.setFont(new Font("CenturyGothic", Font.ITALIC, 18));
			g.setColor(Color.white);
			g.drawString("Sean Ryan",x2, yPos);
			g.drawString("Heng Kang",x2, yPos+y1);
			g.drawString("Alistair Russell",x2, yPos+2*y1);
			g.drawString("Qianyu Liu",x2, yPos+3*y1);
			g.drawString("Simon Krafft",x2, yPos+4*y1);
			g.drawString("Wayne Tam",x2, yPos+5*y1);
			
			int xTitle3 = 60;
			int yTitle3 = 345;
			int x3=xTitle3+25;
			int y3=25;
			//project part credits
			
			//Core Programming
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Core Programming",xTitle3, yTitle3);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Heng Kang",x3, yTitle3+y3);
			g.drawString("Simon Krafft",x3, yTitle3+2*y3);
			g.drawString("Qianyu Liu",x3, yTitle3+3*y3);
			g.drawString("Alistair Russell",x3, yTitle3+4*y3);
			g.drawString("Sean Ryan",x3, yTitle3+5*y3);
			g.drawString("Wayne Tam",x3, yTitle3+6*y3);
			
			
			int xTitle4=60;
			int yTitle4=525;
			int x4 = xTitle4+25;
			int y4 = 25;
			
			//AI
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Artificial Intelligence",xTitle4, yTitle4);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Simon Krafft", x4, yTitle4+y4);
			g.drawString("Alistair Russell", x4, yTitle4+2*y4);
			
			
			int xTitle5=500;
			int yTitle5=70;
			int x5 = xTitle5+15;
			int y5 = 25;
			
			//Level Design
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Level Design",xTitle5, yTitle5);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Wayne Tam", x5, yTitle5+y5);
			
			int xTitle6=500;
			int yTitle6=130;
			int x6 = xTitle6+15;
			int y6 = 25;
			
			//Game Logic
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Game Logic Scenarios",xTitle6, yTitle6);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Heng Kang", x6, yTitle6+y6);
			g.drawString("Qianyu Liu", x6, yTitle6+2*y6);
			
			int xTitle7=500;
			int yTitle7=210;
			int x7 = xTitle6+15;
			int y7 = 25;
			
			//Menu & Sound
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Menu/Sound/Graphics",xTitle7, yTitle7);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Sean Ryan", x7, yTitle7+y7);
			g.drawString("Wayne Tam", x7, yTitle7+2*y7);
			
			int xTitle8=500;
			int yTitle8=290;
			int x8 = xTitle6+15;
			int y8 = 25;
			
			//Character Positions and Coordinations
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Character Positions/Coorditions",xTitle8, yTitle8);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Simon Krafft", x8, yTitle8+y8);
			g.drawString("Alistair Russell", x8, yTitle8+2*y8);
			
			
			int xTitle9=280;
			int yTitle9=345;
			int x9 = xTitle9+15;
			int y9 = 25;
			
			//Additional Programming
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Additional Programming",xTitle9, yTitle9);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.setColor(Color.white);
			g.drawString("Heng Kang", x9, yTitle9+y9);
			g.drawString("Simon Krafft", x9, yTitle9+2*y9);
			g.drawString("Qianyu Liu", x9, yTitle9+3*y9);
			g.drawString("Alistair Russell", x9, yTitle9+4*y9);
			g.drawString("Sean Ryan", x9, yTitle9+5*y9);
			g.drawString("Wayne Tam", x9, yTitle9+6*y9);
			
			int xTitle10 = 500;
			int yTitle10 = 375;
			int x10 = xTitle10 + 15;
			int y10 = 25;
			
			//Bonus Programming
			g.setFont(new Font("CenturyGothic", Font.BOLD, 18));
			g.setColor(Color.magenta);
			g.drawString("Bonus Programming",xTitle10, yTitle10);
			g.setColor(Color.white);
			g.setFont(new Font("CenturyGothic", Font.PLAIN, 16));
			g.drawString("Heng Kang", x10, yTitle10+y10);
			g.drawString("Simon Krafft", x10, yTitle10+2*y10);
			g.drawString("Qianyu Liu", x10, yTitle10+3*y10);
			g.drawString("Alistair Russell", x10, yTitle10+4*y10);
			g.drawString("Sean Ryan", x10, yTitle10+5*y10);
			g.drawString("Wayne Tam", x10, yTitle10+6*y10);
		}
		
}
