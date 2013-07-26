import java.sql.*; 
import java.net.*; 
import java.util.*;
import java.util.logging.*;

/**
	Simple JAVA class for connecting to the SAP HANA DB and running select query.
	
	@author Viktor Dmitriyev
**/
public class SapHanaConnectionTest{

	private final String SAP_HANA_IP = "";
	private final String SAP_HANA_PORT = "";
	private final String SAP_HANA_USER = "";
	private final String SAP_HANA_PASSWORD = "";

	/**
		Return the connection instance to the SAP HANA.
	**/
	public Connection getConnection(){

		try {
			Class.forName("com.sap.db.jdbc.Driver");
			String connStr = "jdbc:sap://" + SAP_HANA_IP + ":" + SAP_HANA_PORT;
			Connection conn = java.sql.DriverManager.getConnection( connStr, SAP_HANA_USER, SAP_HANA_PASSWORD); 
			return conn;
		} catch(Exception ex) { 
			ex.printStackTrace();
		}

		return null;
	}

	public void runQuery(Connection conn, String query) throws SQLException{
		
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery(query); 

		// Iteratiog through records of the table
		int MAX_NUMBER_COLUMNS = 6;
		while (rs.next()){

			for (int i = 1 ; i < MAX_NUMBER_COLUMNS; i++)
				System.out.print(rs.getString(i) + " | \t\t" );

			System.out.println(rs.getString(MAX_NUMBER_COLUMNS));
		}

		rs.close();
		stmt.close();
	}

	public String formTestQuery01(){
		String query =  "select  \"ID\", \"AMOUNT\", \"TRAN_DATE\", \"POST_DATE\", \"DESCRIPTION\", \"CATEGORY_TEXT\"" + 
					    "from \"DEMOUSER00\".\"TBL_LOADED_DATA\"";

		return query;
	}

	public void processQuery(){
		try {
			Connection conn = this.getConnection();
			if (conn != null){
				String query = this.formTestQuery01();
				this.runQuery(conn, query);
				conn.close();
			} else {
				System.out.println("Connection is not established properly.");
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

	public SapHanaConnectionTest(){

	}
	
	public static void main(String[] args){
		
		SapHanaConnectionTest obj = new SapHanaConnectionTest();
		obj.processQuery();

	}	
	
}