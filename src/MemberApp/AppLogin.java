package MemberApp;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// @author Båmi Lee

public class AppLogin {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private Window welcomePanel;
	private Object butLogIn;
	private JMenuItem FQA;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppLogin window = new AppLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Sitka Small", Font.ITALIC, 30));
		frame.getContentPane().setLayout(null);
		ImagePane welcomePanel = new ImagePane(new ImageIcon("C:/Users/swede/eclipse-workspace/Swing Lesson ex/image/tablet.jpg").getImage());
		welcomePanel.setSize(930,730);
		//frame.getContentPane().add(welcomePanel);
		
		JLabel lblNewLabel = new JLabel("Log In");
			
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(368, 186, 290, 129);
		frame.getContentPane().add(lblNewLabel);
		
		id = new JTextField();
		id.setToolTipText("Enter ID");
		id.setText("Enter ID");
		id.setFont(new Font("Tahoma", Font.PLAIN, 26));
		id.setBounds(411, 326, 247, 67);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 30));
		password.setBounds(409, 403, 249, 67);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("ID:");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 30));
		btnNewButton.setBounds(262, 326, 108, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnPw = new JButton("PW:");
		btnPw.setFont(new Font("Tahoma", Font.ITALIC, 30));
		btnPw.setBounds(262, 403, 108, 67);
		frame.getContentPane().add(btnPw);
		
		JButton btnLogIn = new JButton("login button");
		btnLogIn.setIcon(new ImageIcon("C:\\Users\\swede\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\Image moum\\start.png"));
		btnLogIn.setBounds(411, 493, 249, 113);
		frame.getContentPane().add(btnLogIn);
		frame.setSize(940,720);
	  //frame.setVisible(false);
		frame.setLocationRelativeTo(null); // frame placeras i mitten
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Funktion för log in button(start button)
		btnLogIn.addActionListener(new ActionListener() {

			private Window mainPanel;

			@Override
			public void actionPerformed(ActionEvent e){
				if(id.getText().equals("Hello")&&Arrays.equals(password.getPassword(),"World88".toCharArray())) {
					System.out.println(" Welcome");
					welcomePanel.setVisible(false);
					//mainPanel.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "You faild to log in");
				}
				
			}

			public Window getMainPanel() {
				return mainPanel;
			}

			public void setMainPanel(Window mainPanel) {
				this.mainPanel = mainPanel;
			}
		});
        welcomePanel.add(butLogIn);
		frame.setJMenuBar( menuBar());
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	 /**
	 * @return
	 */
	public JMenuBar menuBar() {
		 JMenuBar bar = new JMenuBar();
		 JMenu fileMenu = new JMenu("File");
  	   JMenu aboutMenu = new JMenu("About");
  	 
  	   bar.add(fileMenu);
  	   bar.add(aboutMenu);
  	   
  	   JMenuItem openFile = new JMenuItem("Open");
  	   JMenuItem exit = new JMenuItem("Exit");
  	   JMenuItem fqa = new JMenuItem("FQA");
  	   
  	   fileMenu.add(openFile);
  	   fileMenu.addSeparator();
  	   fileMenu.add(exit);
  	   aboutMenu.add(fqa);
  	   
  	   
  	   exit.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			System.exit(0); //programmnet avsultas med button exit.
		}
  		   
  		   
  	   });
  	   
  	   return bar;
     }

	public Window getWelcomePanel() {
		return welcomePanel;
	}

	public void setWelcomePanel(Window welcomePanel) {
		this.welcomePanel = welcomePanel;
	}

	public JMenuItem getFQA() {
		return FQA;
	}

	public void setFQA(JMenuItem fQA) {
		FQA = fQA;
	}
} 

@SuppressWarnings("serial")
class ImagePane1 extends JPanel{
	
	private Image img;
	
	

	public ImagePane1(Image image) {
		// TODO Auto-generated constructor stub
	}


	public void ImagePanel (Image img) {
	 this.img=img;// ska byta funkionen av JPanel,kan använda image utanför
	 setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
	 
	 setLayout(null);
	 
	}


    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
	   }
     
		
 

	@SuppressWarnings("unused")
	private JMenuBar menuBar() {
		return null;
	}
}	
