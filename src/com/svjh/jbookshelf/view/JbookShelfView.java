package com.svjh.jbookshelf.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class JbookShelfView {
	
	public JbookShelfView() {
		initUI();
	}
	
	
	public void initUI() {
		JFrame frame = new JFrame("JBOOKSHELF");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel panel = new JPanel(new BorderLayout());
        JPanel top = new JPanel();

        top.setBackground(Color.gray);
        top.setPreferredSize(new Dimension(250, 150));
        panel.add(top);

        panel.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));

        frame.add(panel);

        frame.pack();
	}
	
	public static void main(String[] args) {

	        SwingUtilities.invokeLater(new Runnable() {

	            public void run() {

	            	JbookShelfView ex = new JbookShelfView();
	               
	            }
	        });
		
		
		
		
	}

}
