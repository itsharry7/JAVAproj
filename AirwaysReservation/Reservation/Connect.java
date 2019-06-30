import java.sql.*;
public class Connect
{
public Connection con;
public Connect()
{
try
{
con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Harry\\Desktop\\ProjC2\\ProjC2\\Reservation\\Airway.mdb");
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}
}