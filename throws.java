
import java.sql.*;
class throws1
{
 public static void main(String[] args)throws SQLException
 {
  try
  {
    new throws1().m1();
  }
  catch(SQLException s)
  {
   System.out.println("handled");
  }
 }
 public void m1()throws SQLException
 {
   m2();
 }
  public void m2()throws SQLException
  {
   m3();
  }
  public void m3()throws SQLException

  {
   m4();
  }
  public void m4() throws SQLException
  {
   throw new SQLException();
  }
}
   