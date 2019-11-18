import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;

public class Lesson9 {

	private JFrame frame;
	private final JButton btnNewButton = new JButton("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson9 window = new Lesson9();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setForeground(new Color(0, 0, 255));
		getFrame().getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		getFrame().setBounds(100, 100, 579, 542);
		//Ställer in behållaren(container) för att avsluta när man trycker x-kanppen.
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("button");
		btnButton.setBounds(0, 0, 199, 222);
		btnButton.setIcon(new ImageIcon("C:\\Users\\swede\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\My projcets\\cuteMon.jpg"));
		btnButton.setPressedIcon(new ImageIcon("file:///C:/Users/swede/eclipse-workspace/Swing%20Lesson%20ex/image/skeleton.png"));
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnButton.setPressedIcon(new ImageIcon("C:\\Users/swede/eclipse-workspace/Swing%20Lesson%20ex/image/skeleton.png"));
		btnNewButton.setBounds(10, 23, 491, 402);
		getFrame().getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setMargin(new Insets(2, 9, 2, 14));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\swede\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\Image moum\\pngtree-vector-bank-icon-png-image_755671.jpg"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\swede\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\My projcets\\cuteMon.jpg"));
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
