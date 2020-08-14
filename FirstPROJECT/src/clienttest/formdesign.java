package clienttest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import dbtest.dbconn;
import help.Helpmodelimp;
import modeltest.Userinfo;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;

import java.awt.event.ActionEvent;

public class formdesign extends JFrame {

	private JPanel contentPane;
	private JTextField emailid;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formdesign frame = new formdesign();
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
	
	
	public formdesign() throws ClassNotFoundException, SQLException {
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 314);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Email id");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 20));
		lblUsername.setBounds(101, 23, 108, 44);
		contentPane.add(lblUsername);
		
		emailid = new JTextField();
		emailid.setBounds(251, 29, 173, 37);
		contentPane.add(emailid);
		emailid.setColumns(10);
		
		JLabel password1 = new JLabel("Password");
		password1.setFont(new Font("FreeSerif", Font.BOLD, 25));
		password1.setBounds(101, 77, 108, 47);
		contentPane.add(password1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(251, 84, 173, 37);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Userinfo ui=new Userinfo();
			ui.setEmail(emailid.getText());
			ui.setPassword(password1.getText());	
				
			try {
				Helpmodelimp imp=new Helpmodelimp();
				if (imp.login(ui));
					
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
				
				
				
			}
		});
		btnNewButton.setForeground(SystemColor.controlDkShadow);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 19));
		btnNewButton.setBounds(3, 228, 117, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("create account");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new createAccountpage().setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 19));
		btnNewButton_1.setBounds(130, 228, 194, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/ronisha/Pictures/logindesign"));
		label.setBounds(-11, -19, 781, 320);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(12, 23, 77, 37);
		label_1.setIcon(new ImageIcon(new ImageIcon("/home/ronisha/Pictures/index.png").getImage().getScaledInstance(label_1.getWidth(),label_1 .getHeight(),Image.SCALE_DEFAULT)));
	
	    contentPane.add(label_1);
		
	}
}
