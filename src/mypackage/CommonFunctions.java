
package mypackage;

import java.sql.*;
import javax.swing.JOptionPane;


public class CommonFunctions
{
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error = "+e);
            e.printStackTrace();
        }
        return con;
    }
}
