package template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

	public JdbcTemplate() {

	}
	
	public static Connection getInit() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String user = "user1";
		String password = "1234";
		return DriverManager.getConnection(url, user, password);
		
	} // end getInit()

	public static void close(Connection conn) {
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end close() Connection
	
	public static void close(Statement stmt) {
		
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end close() Statement
	
	public static void close(PreparedStatement pstmt) {
		
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end close() PreparedStatement
	
	public static void close(ResultSet rs) {
		
		if (rs!= null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	} // end close() ResultSet
	
} // end class
