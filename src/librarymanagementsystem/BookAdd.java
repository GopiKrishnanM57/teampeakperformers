package librarymanagementsystem;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookAdd {

	Statement st = null;
	ResultSet rs = null;
	public DBConnection frm = new DBConnection();
	
	public void insertBook(String bookname, Date date, String theme, String notes, String user) {
		String sql = "insert into library values (?,?,?,?,?)";
		//String sql = "Insert into library" + "(book_name,date,theme,notes,user_email)" + "values(?,?,?,?,?)";
		try {
			st = frm.con.createStatement();
			PreparedStatement ps = frm.con.prepareStatement(sql);
			ps.setString(1, bookname);
			ps.setDate(2, date);
			ps.setString(3, theme);
			ps.setString(4, notes);
			ps.setString(5, user);

		     ps.execute();
				System.out.println("Book enter succesfully!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Book enter un-succesfull!!");
		}

		
	}
}
