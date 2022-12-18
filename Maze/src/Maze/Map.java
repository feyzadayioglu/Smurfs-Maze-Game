package Maze;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class Map {
	
	private Scanner m;
	private String Map[] = new String[13];
	private Image floor;
	private Image wall;
	private Image bitis;
	private Image gargamel;
	private Image azman;

	public Map() {
		ImageIcon img = new ImageIcon("C://prolab21//floor.png");
		floor = img.getImage();
		img = new ImageIcon("C://prolab21//wall.png");
		wall = img.getImage();
		img=new ImageIcon("C://prolab21//sirine.png");
		bitis=img.getImage();
		img=new ImageIcon("C://prolab21//gargamel.png");
		gargamel=img.getImage();
		img=new ImageIcon("C://prolab21//azman.png");
		azman=img.getImage();
		openFile();
		readFile();
		closeFile();

	}

	public Image getFloor() {
		return floor;
	}

	public Image getWall() {
		return wall;
	}
	public Image getBitis() {
		return bitis;
	}
	public Image getGargamel() {
		return gargamel;
	}
	public Image getAzman() {
		return azman;
	}

	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x + 1);
		return index;
	}

	public void openFile() {
		try {
			m = new Scanner(new File("C://prolab21//harita.txt"));
		} catch (Exception e) {
			System.out.println("error loading map");
		}
	}

	public void readFile() {
		while (m.hasNext()) {
			for (int i = 0; i < 13; i++) {
				Map[i] = m.next();
			}
		}

	}

	public void closeFile() {
		m.close();

	}

}
