import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements Runnable{
	private BufferedImage back;
	
	public class StartScreen {
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> createAndShowGUI());
	    }

	    private static void createAndShowGUI() {
	        JFrame frame = new JFrame("Start Screen");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel label = new JLabel("Welcome to My Application");
	        frame.getContentPane().add(label);

	        frame.pack();
	        frame.setLocationRelativeTo(null); // Center the frame on the screen
	        frame.setVisible(true);
	    }
	}

	
	public void paint (Graphics g)
	{
		Graphics2D twoDgraph = (Graphics2D)g;
	//take a snap shop of the current screen and same it as an image
	//that is the exact same width and height as the current screen
		if (back==null) {
			back =(BufferedImage) (createImage(getWidth(), getHeight()));
				}

	//create a graphics reference to the back ground image
	//we will draw all changes on the background image
		Graphics g2d = back.createGraphics();
		
		//this clears the old image, like an EtchASketch. If you see the old image when we learn motion, you deleted this line.
		g2d.clearRect(0, 0, getSize().width, getSize().height); 
		
		
		//START CODING GRAPHICS HERE
		
		
		g2d.setColor(Color.black);
		g2d.fillRect(1750, 600, 50, 300);
	
		
		
	

		
		
		
		//This line tells the program to draw everything above. If you delete this, nothing will show up.
		twoDgraph.drawImage(back, 0, 0, null);
	}
	
	}


