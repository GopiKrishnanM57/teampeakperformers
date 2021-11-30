package librarymanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminAdd {
	
	Statement st = null;
	ResultSet rs = null;
	public DBConnection frm = new DBConnection();
	
	
	public void insertUser(String first_name, String last_name, String email, String password) {
		String sql = "insert into admin_info values (?,?,?,?)";
		//String sql = "Insert into admin_info" + "(first_name,last_name,email,Password)" + " values(?,?,?,?)";
        PreparedStatement ps;
		try {
			ps = frm.con.prepareStatement(sql);
			ps.setString(1, first_name);
	        ps.setString(2, last_name);
	        ps.setString(3, email);
	        ps.setString(4, password);
	        ps.execute();
				System.out.println("Admin enter succesfully!!");
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Admin enter un-succesfull!!");
		}
        
	}

}
