import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private static final int WIDTH =1900;
	private static final int HEIGHT=1000;
	
	public Main () {
		super("Mini Flap");
		setSize(WIDTH, HEIGHT);
		Game play = new Game();
		
		
		
		
		setBackground(Color.GREEN);
		  getContentPane().add(play);
		
			
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

	public static void main(String[] args) {
		Main run = new Main();
		
		

	}


}
