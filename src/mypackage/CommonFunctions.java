
package mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class CommonFunctions
{
    private static CommonFunctions obj;
    private static Thread t;
    private static boolean val = true;
    
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","Jivan_Raundal","Jivan@123");
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error = "+e);
            e.printStackTrace();
        }
        return con;
    }
    
    public static void addLabelBackground(JLabel lbl, String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newimg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            lbl.setIcon(icon);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void clock(JLabel lbl)
    {
        val = true;
        t = new Thread()            //Inner anonymous Thred class for running time 
        {
            synchronized public void run()
            {
                try
                {
                    while(val)
                    {
                        Calendar cld = Calendar.getInstance();
                        java.util.Date d = cld.getTime();
                        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                        String str = sd.format(d);
                        lbl.setText(str);
                        wait(1000);
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        //starting Thread here
        t.start();
    }
    public static void addDateTime(JLabel lbl)
    {
        obj = new CommonFunctions();
        obj.clock(lbl);
    }
    public static void stopThread()    
    {
        val = false;
        //System.exit(0);
    }
    
    public static void alphabetValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isAlphabetic(ch) || ch == ' ')
        {
            //let the event happened
        }
        else
        {
            //consume the event
            evt.consume();
        }
    }
        
    public static void numericValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isDigit(ch) || ch=='.')
        {
            //let the event happened
        }
        else
        {
            //consume the event
            evt.consume();
        }
    }
    public static void integerValidation(java.awt.event.KeyEvent evt)
    {
        char ch = evt.getKeyChar();
        if(Character.isDigit(ch))
        {
            //let the event happened
        }
        else
        {
            //consume the event
            evt.consume();
        }
    }
}
