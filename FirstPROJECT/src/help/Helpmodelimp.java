package help;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import clienttest.Mainform;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbtest.dbconn;
import modeltest.Userinfo;

public class Helpmodelimp implements Helpmodel{

	Connection con=null;
	
	public Helpmodelimp() throws ClassNotFoundException, SQLException
	{
		con=dbconn.getDb();
	}
	
	
	
	@Override
	public boolean register(Userinfo e) {
		
		String sql="insert into registerstd(idno,Firstname,Lastname,Email,password,phone, gender)values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstm= con.prepareStatement(sql);
			pstm.setInt(1,e.getId());
			pstm.setString(2,e.getFirstname());
			pstm.setString(3,e.getLastname());
			pstm.setString(4,e.getEmail());
			pstm.setString(5,e.getPassword());
			pstm.setString(6,e.getPhone());
			pstm.setString(7,e.getGender());
			pstm.execute();
			return true;
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		return false;
	}



	@Override
	public  boolean login(Userinfo e) {
		
		
		String sql="SELECT*FROM registerstd";
		try {
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery(sql);
			
			while (rs.next())
			{
			if (e.getEmail()==rs.getString("email")&&e.getPassword()==rs.getString("password"));
			{
			
			JOptionPane.showMessageDialog(null,"email and password matched");
			new Mainform().setVisible(true);
			return true;
			 
		     }
			
			
			}	
		}
			catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		return false;
		
		
		
		
		}



	
	
		
}


