package Maze;

import java.awt.*;

import javax.swing.ImageIcon;

public class Player {
	
	private int tileX,tileY;
	private Image tembel;
	private Image gozluklu;
	
	public Player() {
		ImageIcon img=new ImageIcon("C://prolab21//tembel.png");
		tembel =img.getImage();
		img=new ImageIcon("C://prolab21//gozluklu.png");
        gozluklu=img.getImage();
		tileX=6;
		tileY=5;
	}
	
	public Image getTembel() {
		return tembel;
		
	}
	public Image getGozluklu() {
		return gozluklu;
		
	}
	
	public int getTileX() {
		return tileX;
	}
	public int getTileY() {
		return tileY;
	}
	
	public void move(int dx ,int dy) {
	
		tileX+=dx;
		tileY+=dy;
		
	}

}

