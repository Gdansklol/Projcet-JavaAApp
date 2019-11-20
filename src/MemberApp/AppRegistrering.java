package MemberApp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.sun.tools.javadoc.Main;

@SuppressWarnings("removal")
public class AppRegistrering {
	
	private JFrame frame;
	private JTextField name;
	private JTextField age;
	private JTextField adress;
	private JTextField phone;
	private JTextField birthday;
	private JTextField occupation;
	/**
	 * @param args
	 * @Launch the application.
	 */
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					AppRegistrering window = new AppRegistrering();
					
					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}
	

	/**
	 * Launch the application.
	 * 
	 */
	
		
	/**
	 * Create the application.
	 */
	 
	public  AppRegistrering() {
		initialize();
	 }

	/**
	 * Initialize the contents of the frame.
	 */
	 private void initialize() {
		frame = new JFrame();
		frame.setSize( 930, 608);
		frame.setLocationRelativeTo(null);//frame placeras i mitten
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		JPanel RegistrerigKunder = new JPanel();
		RegistrerigKunder.setForeground(Color.BLACK);
		RegistrerigKunder.setBackground(Color.BLUE);
		RegistrerigKunder.setBounds(10, 0, 904, 571);
		frame.getContentPane().add(RegistrerigKunder);
		RegistrerigKunder.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcom This Is Main Panel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 25));
		lblNewLabel.setBounds(213, 31, 425, 31);
		RegistrerigKunder.add(lblNewLabel);
		
		JLabel Name = new JLabel("Name");
		Name.setFont(new Font("Dialog", Font.PLAIN, 25));
		Name.setBounds(117, 127, 117, 39);
		RegistrerigKunder.add(Name);
		
		JLabel Age = new JLabel("Age");
		Age.setFont(new Font("Dialog", Font.PLAIN, 25));
		Age.setBounds(117, 204, 108, 39);
		RegistrerigKunder.add(Age);
		
		JLabel Gender = new JLabel("Gender");
		Gender.setFont(new Font("Dialog", Font.PLAIN, 25));
		Gender.setBounds(117, 281, 108, 39);
		RegistrerigKunder.add(Gender);
		
		JLabel Adress = new JLabel("Adress");
		Adress.setFont(new Font("Dialog", Font.PLAIN, 25));
		Adress.setBounds(117, 364, 103, 39);
		RegistrerigKunder.add(Adress);
		
		JLabel Phone = new JLabel("Phone");
		Phone.setFont(new Font("Dialog", Font.PLAIN, 25));
		Phone.setBounds(462, 128, 155, 39);
		RegistrerigKunder.add(Phone);
		
		JLabel Birthday = new JLabel("Birthday");
		Birthday.setFont(new Font("Dialog", Font.PLAIN, 25));
		Birthday.setBounds(462, 191, 155, 39);
		RegistrerigKunder.add(Birthday);
		
		JLabel Note = new JLabel("Note");
		Note.setFont(new Font("Dotum", Font.ITALIC, 25));
		Note.setBounds(462, 322, 130, 39);
		RegistrerigKunder.add(Note);
		
		JLabel Occupation = new JLabel("Occupation");
		Occupation.setFont(new Font("Dialog", Font.PLAIN, 25));
		Occupation.setBounds(462, 261, 138, 39);
		RegistrerigKunder.add(Occupation);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 22));
		name.setBounds(224, 128, 200, 39);
		RegistrerigKunder.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 22));
		age.setColumns(10);
		age.setBounds(224, 192, 200, 39);
		RegistrerigKunder.add(age);
		
		adress = new JTextField();
		adress.setFont(new Font("Tahoma", Font.PLAIN, 22));
		adress.setColumns(10);
	    adress.setBounds(224, 349, 200, 71);
		RegistrerigKunder.add(adress);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 22));
		phone.setColumns(10);
		phone.setBounds(603, 128, 200, 39);
		RegistrerigKunder.add(phone);
		
		birthday = new JTextField();
		birthday.setFont(new Font("Tahoma", Font.PLAIN, 22));
		birthday.setColumns(10);
	    birthday.setBounds(603, 192, 200, 47);
		RegistrerigKunder.add(birthday);
		
		occupation = new JTextField();
		occupation.setFont(new Font("Tahoma", Font.PLAIN, 22));
		occupation.setColumns(10);
		occupation.setBounds(603, 254, 200, 47);
		RegistrerigKunder.add(occupation);
		
		JTextArea note = new JTextArea();
		note.setFont(new Font("MV Boli", Font.PLAIN, 15));
		note.setBounds(608, 322, 195, 118);
		RegistrerigKunder.add(note);
		
		//String array för comboBOx,bästämda värde som han eller hon
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox gender = new JComboBox(new String[]{"Male","Female"});
		gender.setBackground(Color.WHITE);
		gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gender.setBounds(224, 249, 200, 71);
		RegistrerigKunder.add(gender);
		
		JButton subButton = new JButton("Submit");
		subButton.setFont(new Font("Verdana Pro Black", Font.PLAIN, 20));
		subButton.setBounds(339, 475, 246, 47);
		RegistrerigKunder.add(subButton);
	    subButton.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// String värde sätter i varje variabelt värde.
				String nameTxt = name.getText();

                String ageTxt = age.getText();

                String phoneTxt = phone.getText();

                String occupationTxt = occupation.getText();

                String birthxt = birthday.getText();

                String noteTxt = note.getText();

                String genderTxt = gender.getSelectedItem().toString();

			}

      });
				
			}

	 }



	
  
