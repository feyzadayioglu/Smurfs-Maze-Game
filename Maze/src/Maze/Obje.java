package Maze;
import java.awt.Image;


import javax.swing.ImageIcon;


public class Obje  {
	private int aX,aY,mX,mY;
	private Image altin;
	private Image mantar;
	
	public Obje() {
		ImageIcon img=new ImageIcon("C://prolab21//altin.png");
		ImageIcon img1=new ImageIcon("C://prolab21//mantar.png");
		
		altin=img.getImage();
		mantar=img1.getImage();
		aX=-1;
		aY=-1;
		mX=-1;
		mY=-1;
		
	    
		
		
	}
	public Image getAltin() {
		return altin;		
	}
	
	public int getAX() {
		return aX;
	}
	public int getAY() {
		return aY;
	}
	public Image getMantar() {
		return mantar;
		
	}
	
	public int getMX() {
		return mX;
	}
	public int getMY() {
		return mY;
	}
	
	
	/*public void move(int dx ,int dy) {
	
		aX+=dx;
		aY+=dy;
		
	}*/

}