import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Background_image extends JFrame {
	
	JLabel L1;
	
	public Background_image() {
		
		setTitle("MiniFlap");
		setSize(1200,1200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\s1890980\\OneDrive - Houston Independent School District\\Pictures\\Saved Pictures\\MiniFlap.png")));
		setLayout(new FlowLayout());
		L1 = new JLabel();
		add(L1);
		setSize(1200,700);
	}

	public static void main (String arg[]) {
		
		new Background_image();
	}
	
}
