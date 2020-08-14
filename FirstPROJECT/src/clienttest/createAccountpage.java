package clienttest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import help.Helpmodelimp;
import modeltest.Userinfo;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class createAccountpage extends JFrame {
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField phone;
	private JPasswordField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField confirmpasssword;
	private JButton btnNewButton;
	private JTextField id;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAccountpage frame = new createAccountpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public createAccountpage() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 582, 443);
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Dialog", Font.BOLD, 17));
		lblFirstName.setBounds(12, 12, 116, 28);
		getContentPane().add(lblFirstName);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setFont(new Font("Dialog", Font.BOLD, 17));
		lblLastname.setBounds(12, 45, 116, 28);
		getContentPane().add(lblLastname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 17));
		lblEmail.setBounds(12, 106, 96, 28);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(12, 141, 96, 28);
		getContentPane().add(lblPassword);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPhone.setBounds(12, 212, 70, 23);
		getContentPane().add(lblPhone);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Dialog", Font.BOLD, 17));
		lblGender.setBounds(12, 247, 86, 23);
		getContentPane().add(lblGender);
		
		firstname = new JTextField();
		firstname.setBackground(Color.LIGHT_GRAY);
		firstname.setBounds(181, 7, 125, 28);
		getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBackground(Color.LIGHT_GRAY);
		lastname.setColumns(10);
		lastname.setBounds(181, 41, 125, 28);
		getContentPane().add(lastname);
		
		email = new JTextField();
		email.setBackground(Color.LIGHT_GRAY);
		email.setColumns(10);
		email.setBounds(181, 106, 125, 28);
		getContentPane().add(email);
		
		phone = new JTextField();
		phone.setBackground(Color.LIGHT_GRAY);
		phone.setColumns(10);
		phone.setBounds(181, 207, 125, 28);
		getContentPane().add(phone);
		
		password = new JPasswordField();
		password.setBackground(Color.LIGHT_GRAY);
		password.setBounds(181, 137, 125, 28);
		getContentPane().add(password);
		
		JRadioButton malerbtm = new JRadioButton("Male");
		malerbtm.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonGroup.add(malerbtm);
		malerbtm.setBounds(130, 244, 70, 28);
		getContentPane().add(malerbtm);
		
		JRadioButton femalerbtm = new JRadioButton("Female");
		femalerbtm.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonGroup.add(femalerbtm);
		femalerbtm.setBounds(202, 243, 104, 27);
		getContentPane().add(femalerbtm);
		
		JRadioButton othersrbtm = new JRadioButton("Others");
		othersrbtm.setFont(new Font("Dialog", Font.BOLD, 16));
		buttonGroup.add(othersrbtm);
		othersrbtm.setBounds(309, 244, 96, 26);
		getContentPane().add(othersrbtm);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblConfirmPassword.setBounds(12, 178, 170, 28);
		getContentPane().add(lblConfirmPassword);
		
		confirmpasssword = new JPasswordField();
		confirmpasssword.setBackground(Color.LIGHT_GRAY);
		confirmpasssword.setBounds(181, 173, 125, 28);
		getContentPane().add(confirmpasssword);
		
		btnNewButton = new JButton("Register!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Userinfo  ui=new Userinfo();
			//	ui.setId(Integer.parseInt(phone.getText()));
				ui.setFirstname(firstname.getText());
				ui.setLastname(lastname.getText());
				ui.setPassword(password.getText());
				ui.setEmail(email.getText());
				ui.setPhone(phone.getText());
				if(malerbtm.isSelected())
				{
					ui.setGender("male");
				}
				 if(femalerbtm.isSelected())
				{
					ui.setGender("female");
				}
				if(othersrbtm.isSelected())
				{
					ui.setGender("other");
				}
			
				try {
					Helpmodelimp h=new Helpmodelimp();
					if (h.register(ui))
					{
						JOptionPane.showMessageDialog(null,"registered successfully");
					}
					
				}
				catch (Exception e1) {
					
					e1.printStackTrace();
				     }
				
			
				
			}
			
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setBounds(130, 291, 275, 25);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("already have an account ? ");
		lblNewLabel_1.setBounds(79, 325, 227, 28);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login..");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new formdesign().setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 17));
		btnLogin.setBounds(276, 326, 97, 25);
		getContentPane().add(btnLogin);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Dialog", Font.BOLD, 19));
		lblId.setBounds(12, 74, 70, 28);
		getContentPane().add(lblId);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBackground(Color.LIGHT_GRAY);
		id.setBounds(181, 74, 125, 28);
		getContentPane().add(id);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/ronisha/Pictures/attendanceworks3.png"));
		label.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		label.setBounds(0, 0, 570, 360);
		getContentPane().add(label);
	}
}
