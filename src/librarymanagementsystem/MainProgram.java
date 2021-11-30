package librarymanagementsystem;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;


public class MainProgram {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Library management system");
		System.out.println("1.add admin details to db \n 2. add user details to db \n 3. add book details to db");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the admin first name");
			String admin_first_name=sc.next();
			System.out.println("enter the admin last name");
			String admin_last_name=sc.next();
			System.out.println("enter the admin mail id");
			String admin_mail=sc.next();
			System.out.println("Enter the admin password ");
			String admin_pwd=sc.next ();
			AdminAdd ad = new AdminAdd();
			//ad.insertUser("Admin", "Admin-Duumy", "admin@admin.com", "12345");
			ad.insertUser(admin_first_name,admin_last_name,admin_mail,admin_pwd);
			break;
		case 2:
			System.out.println("enter user first name");
			String user_first_name=sc.next();
			System.out.println("enter user last name");
			String user_last_name=sc.next();
			System.out.println("enter user mail id");
			String user_mail=sc.next();
			System.out.println("Enter user password ");
			String user_pwd=sc.next ();
			UserAdd ud=new UserAdd();
			//ud.insertUser("Dummay", "Duumy", "abc@abc.com", "12345");
			ud.insertUser(user_first_name,user_last_name,user_mail,user_pwd);
			break;
		case 3:
			System.out.println("enter book name");
			String book_name=sc.next();
			sc.nextLine();
			//System.out.println("enter book issue date");
			Date book_issue_date=new Date(new java.util.Date().getTime());
			System.out.println(book_issue_date);
			System.out.println("enter book theme");
			String book_theme=sc.next();
			sc.nextLine();
			System.out.println("Enter book notes ");
			String notes=sc.next ();
			sc.nextLine();
			System.out.println("Enter email ");
			String mail=sc.next ();
			BookAdd bd = new BookAdd();
			//bd.insertBook("Book1", new Date(new java.util.Date().getTime()), "Theme", "Notes", "abc@abc.com");
			//bd.insertBook("Book2",new Date(new java.util.Date().getTime()) , "Theme", "Notes", "supr@gmail.com");
			bd.insertBook(book_name,book_issue_date, book_theme, notes, mail);
			break;
			default:
				System.out.println("invalid option");

			
		}
		
		
		

	}
}