package Maze;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import java.util.Random;
import java.util.Scanner;

//TEMBEL
public class Board extends JPanel implements ActionListener {
	
	 
	
	private Timer timer;
	private Timer zaman;
	private Map m;
	private Player p;
	private Obje o;
	private boolean win = false;
	private String text = "";
	private Font font =new Font("Serif",Font.BOLD,48);

	public Board()
	{

		m = new Map();
		p = new Player();
		o = new Obje();
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(25, this);
		timer.start();
        
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (m.getMap(p.getTileX(), p.getTileY()).equals("b")) {
			text = "Kazandýnýz!";
			win = true;
		}
		repaint();

	}

	public void paint(Graphics g) {
		super.paint(g);
		
		Random r = new Random();
		int altinX = r.nextInt(13);
		int altinY = r.nextInt(11);
		int mantarX = r.nextInt(13);
		int mantarY = r.nextInt(11);

		if (!win) {
			for (int y = 0; y < 11; y++) {
				for (int x = 0; x < 13; x++) {
					if (m.getMap(x, y).equals("b")) {
						g.drawImage(m.getBitis(), x * 32, y * 32, null);
					}
					if (m.getMap(x, y).equals("g")) {
						g.drawImage(m.getGargamel(), x * 32, y * 32, null);
					}
					if (m.getMap(x, y).equals("0")) {
						g.drawImage(m.getWall(), x * 32, y * 32, null);
					}
					if (m.getMap(x, y).equals("1")) {
						g.drawImage(m.getFloor(), x * 32, y * 32, null);
					}if (m.getMap(altinX, altinY).equals("1")) {
						g.drawImage(o.getAltin(), altinX * 32, altinY * 32, null);
					}

					if (m.getMap(mantarX, mantarY).equals("1")) {
						g.drawImage(o.getMantar(), mantarX * 32, mantarY * 32, null);

					}
				}
			}
			g.drawImage(p.getTembel(), p.getTileX() * 32, p.getTileY() * 32, null);
			g.drawImage(o.getMantar(), o.getMX() * 32, o.getMY() * 32, null);
			g.drawImage(o.getAltin(), o.getAX() * 32, o.getAY() * 32, null);
		}
		if (win) {
			g.setColor(Color.ORANGE);
			g.setFont(font);
			g.drawString(text, 100, 200);
		}

		
	}
	

	public class Al extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			if (keycode == KeyEvent.VK_W) {
				if (!m.getMap(p.getTileX(), p.getTileY() - 1).equals("0")) {
					p.move(0, -1);
				}
			}
			if (keycode == KeyEvent.VK_S) {
				if (!m.getMap(p.getTileX(), p.getTileY() + 1).equals("0")) {
					p.move(0, 1);
				}
			}
			if (keycode == KeyEvent.VK_A) {
				if (!m.getMap(p.getTileX() - 1, p.getTileY()).equals("0")) {
					p.move(-1, 0);
				}
			}
			if (keycode == KeyEvent.VK_D) {
				if (!m.getMap(p.getTileX() + 1, p.getTileY()).equals("0")) {
					p.move(1, 0);
				}
			}
		}

		public void keyRelased(KeyEvent e) {

		}

		public void keyTyped(KeyEvent e) {

		}
	}

}