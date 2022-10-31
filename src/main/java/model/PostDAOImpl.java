package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDAOImpl implements PostDAO {

	public static Connection con;

	public static void initDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded.");

			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "blackthorne");
			System.out.println("Connection is established.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int addPost(Post post) {

		int res = -1;

		try {
			PreparedStatement pst = con.prepareStatement("insert into posts(body) values(?)");
			pst.setString(1, post.getBody());
			res = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}