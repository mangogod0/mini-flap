import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private JFrame frame;
    private JLabel titleLabel;
    private JButton startButton;

    public Game() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Start Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        titleLabel = new JLabel("Welcome to My Application");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));

        startButton = new JButton("Start");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setFont(new Font("Arial", Font.PLAIN, 16));
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to start the application or switch to the main screen
            }
        });

        panel.add(titleLabel);
        panel.add(startButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Game();
            }
        });
    }
}
