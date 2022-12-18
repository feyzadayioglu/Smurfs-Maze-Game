package Maze;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Maze {

	public static void main(String[] args) {
		new Maze();
	}

	public Maze() {

		JFrame f = new JFrame();
		f.setTitle("Labirent Oyunu");
		// f.add(new Board());
		f.setSize(470, 485);
		f.setLocationRelativeTo(null);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame f1 = new JFrame();
		f1.setTitle("Labirent Oyunu");
		f1.setSize(470, 485);
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel gozlukluSirin = new JLabel("      GOZLUKLU SÝRÝN");
		f1.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 10, 230));
		gozlukluSirin.setBackground(Color.pink);
		gozlukluSirin.setOpaque(true);

		// gozlukluSirin.setSize(50, 50);
		// gozlukluSirin.setLocation(180, 380);
		f1.getContentPane().add(gozlukluSirin);
		gozlukluSirin.addMouseListener((MouseListener) new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// gozlukluSirin.setVisible(false);
				f1.setVisible(false);
				f.setVisible(true);
				f.add(new Board2());

			}

		});

		JLabel tembelSirin = new JLabel("      TEMBEL SÝRÝN");
		tembelSirin.setBackground(Color.pink);
		tembelSirin.setOpaque(true);
		// tembelSirin.setSize(250, 100);
		// tembelSirin.setLocation(500, 800);

		f1.getContentPane().add(tembelSirin);
		tembelSirin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// tembelSirin.setVisible(false);
				f1.setVisible(false);
				f.setVisible(true);
				f.add(new Board());

			}

		});

	}

}
