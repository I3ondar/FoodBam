/**
 * 
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * @author ioanabondar
 *
 */
public class RegisterQuery {
	
public Connection connection;
private ResultSet results;
int userID;
	
	public RegisterQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addUser(String username, String password){
		String query = "insert into user (username,password) values (?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int readUserID(){
		
			String query = "SELECT LAST_INSERT_ID()";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			
			userID = this.results.getInt(1);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return userID;
	}
	
	
	
	public void addCustomer(String firstName,String lastName,String email,int userID){
		String query = "insert into customer (firstName,lastName,email,user_userID) values (?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, email);
			ps.setInt(4, userID);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
