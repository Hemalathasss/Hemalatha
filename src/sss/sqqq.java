package sss;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class sqqq {
		public static void main(String[] args) {
			
			try {
				
				//1.load the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//2.connect to the db
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "sami123");
				
				//3. write a sql query
				String sql = "select * from Reg";
				
				//4.Prepare the statement
				PreparedStatement ps = con.prepareStatement(sql);
				
				//5. Execute the query
				ResultSet rs = ps.executeQuery();
				
				//6.Iterate the results
				while(rs.next()) {
					String first = rs.getString("first_name");
					String last = rs.getString("last_name");
					
					System.out.println(first + last+" " );
					//System.out.print(last);
					
				}
				
				
				
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
