import java.sql.*;

public class RegisterDao {
	 private String jdbcUrl = "jdbc:mysql://localhost:3306/database1"; // Update with your database URL
	 private String jdbcUsername = "root"; // Update with your database username
	 private String jdbcPassword = "Jayanth@mysql";
	 private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	 
	 public void loadDriver(String jdbcDriver) {
		 
		 try {
			 Class.forName(jdbcDriver);
		 }
		 catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 public Connection getConnection() {
		 Connection connection = null;
		 try {
			connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return connection ;
		 
	 }
	 
	 public String insert(Member member) {
		 
		 loadDriver(jdbcDriver);
		 Connection con = getConnection();
		 
		 String insertQuery = "INSERT INTO members (username, email, password, phonenumber) VALUES (?, ?, ?, ?)";
	        PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(insertQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        // Set values in the prepared statement
	     try {
			ps.setString(1, member.getUsername());
			ps.setString(2, member.getEmail());
		    ps.setString(3, member.getPassword());
		    ps.setString(4, member.getPhonenumber());
		    ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     
	     return null;
		 
		 
		 
	 }

}
