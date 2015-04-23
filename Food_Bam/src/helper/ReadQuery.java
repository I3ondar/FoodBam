/**
 * 
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.Product;

/**
 * @author Dee
 *
 */
public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public ReadQuery(String dbName, String uName, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// set up driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uName, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void doRead(){
		String query = "select * from product";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table = "";
		table += "<table border = 1>";
		
		try {
			while(this.results.next()){
				Product product = new Product();
				product.setProductID(this.results.getInt(1));
				product.setName(this.results.getString("name"));
				product.setCost(this.results.getDouble("cost"));
				product.setPrice(this.results.getDouble("price"));
				product.setQuantity(this.results.getInt("quantity"));
				product.setImg(this.results.getString("img"));
				
				table += "<tr>";
				table += "<td>";
				table += product.getImg();
				table += "</td>";
				table += "<td>";
				table += product.getName();
				table += "</td>";				
				table += "<td>";
				table += product.getCost();
				table += "</td>";			
				table += "<td>";
				table += product.getPrice();
				table += "</td>";			
				table += "<td>";
				table += product.getQuantity();
				table += "</td>";		
				table += "<td>";
					table += "<a href=update?sku=" + product.getProductID() + ">Update</a> <a href=delete?sku=" + product.getProductID() + ">Delete</a>";
				table += "</td>";
				table += "</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
	
}
