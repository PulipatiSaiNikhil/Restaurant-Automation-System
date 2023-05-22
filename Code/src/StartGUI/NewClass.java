/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StartGUI;

import java.sql.*;

/**
 *
 * @author P.SAI NIKHIL
 */
public class NewClass {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/restaurant";
        String username="root";
        String password="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            if(con!=null){
                System.out.println("Connection Established");
                //Statement stat=con.createStatement();
            }
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("An Error occured");
        }
    }
}
