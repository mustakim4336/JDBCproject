package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

class Launch
{
	public static void main(String args[])
	{
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet res=null;
		Connection con=null;
		try
		{
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded successfully");
		}
		catch(Exception e)
		{
			System.out.println("Driver loaded failed");
			
		}
	}
}