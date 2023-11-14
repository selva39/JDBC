package com.demo;
import java.sql.*;
public class Main {
	public static void main(String[] args) throws SQLException {
		//insert();
		//update();
		//delete();
		retrive();
	}
	public static void retrive()
	{
		String url="jdbc:mysql://192.168.1.135:3306/selva?enabledTLSProtocols=TLSv1.2";
	     String user="UAESUPPORT";
	     String password="P@ssword";
	     String query="select * from employee";
	       try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
		ResultSet result=	st.executeQuery(query);
	while(result.next())
	{
		System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3));
	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert()
	{
		String url="jdbc:mysql://192.168.1.135:3306/selva?enabledTLSProtocols=TLSv1.2";
	     String user="UAESUPPORT";
	     String password="P@ssword";
	     String query="insert into employee(ename,age) values('amaravathy',53),('eddy',29),('vijay',56)";
	       try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
		int result=	st.executeUpdate(query);
		System.out.println(result+"successfully inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void update()
	{
		String url="jdbc:mysql://192.168.1.135:3306/selva?enabledTLSProtocols=TLSv1.2";
	     String user="UAESUPPORT";
	     String password="P@ssword";
	     String query="update employee set ename='dhanush' where id=3";
	       try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
		int result=	st.executeUpdate(query);
		System.out.println(result+"successfully updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	       
	}
	public static void delete()
	{
		String url="jdbc:mysql://192.168.1.135:3306/selva?enabledTLSProtocols=TLSv1.2";
	     String user="UAESUPPORT";
	     String password="P@ssword";
	     String query="delete from employee where id=9";
	       try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
		int result=	st.executeUpdate(query);
		System.out.println(result+"successfully deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
