
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Cursor;
import java.sql.Connection;
import org.sqlite.SQLiteConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.CDL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.google.gson.reflect.TypeToken;
import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;
import java.awt.List;
import java.io.Reader;
import java.util.HashMap;
import javax.net.ssl.SSLEngineResult.Status;
import javax.xml.ws.Response;
import org.json.JSONTokener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Operations {
    
    public static void insertData (  String number, String name, String price , String vat, String barcode) throws SQLException {
    
                String sqlQuery = " INSERT INTO tableProduct (number,name,price,vat,barcode) VALUES (?,?,?,?,?)";
                try {                    
                    

                Connection  conn = DriverManager.getConnection("jdbc:sqlite:database01.db");
                JOptionPane.showMessageDialog(null, " Database Connect Successful");                    
                    
                    PreparedStatement preparedStatement;
                preparedStatement = conn.prepareStatement(sqlQuery);
                    
                   
                    preparedStatement.setString(1,number);
                    preparedStatement.setString(2,name);
                    preparedStatement.setString(3,price);
                    preparedStatement.setString(4,vat);
                    preparedStatement.setString(5,barcode);
                    preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data has been insert!");                    


                    

                }
                catch (SQLException ex )
                {
                
                    Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Data has been not insert, \n please check the product number!");                 
                }
    }
    
    
    public static DefaultTableModel getData(String query, JTable table ) throws SQLException
    {
    
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    
    try {
    
                Connection  conn = DriverManager.getConnection("jdbc:sqlite:database01.db");
                JOptionPane.showMessageDialog(null, " Database Connect Successful");                
            
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            
            if (resultSet.isBeforeFirst()){
            while (resultSet.next()){
            Object dataObject[] = {
                       resultSet.getInt("id"),
                    resultSet.getString("number"),
                    resultSet.getString("name"),
                    resultSet.getString("price"),
                    resultSet.getString("vat"),
                    resultSet.getString("barcode") 
                                            
            
            }
          
                            
                            ;
                    
                    model.addRow(dataObject);
                  
            }
            System.out.println("Data model has been generated");
            
            }
            
    }
    
     catch (SQLException ex )
                {
                
            System.out.println("Error" + ex.getMessage());
                
                }
    return model;
    }
             
    
    
    
    
    
public static String coverttoJson(String query ) throws SQLException
    {
    ArrayList<String> data = null ; 
   String json = null;
   JSONArray result ;
     String jsonnnn;     
   
   
   
    try {
    
                Connection  conn = DriverManager.getConnection("jdbc:sqlite:database01.db");
              JOptionPane.showMessageDialog(null, " Database Connect Successful");                
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            
            if (resultSet.isBeforeFirst()){
            while (resultSet.next()){
                
         
                
                
          ArrayList<String> list = new ArrayList<String>();
            JsonArray jsonArray3 = new JsonArray();

  while (resultSet.next()){
                
         
          list.add(  resultSet.getString("id")  );
          list.add(  resultSet.getString("number") );
          list.add(  resultSet.getString("name") );
          list.add(  resultSet.getString("price") );
          list.add(  resultSet.getString("vat") );
          list.add( resultSet.getString("barcode") );
      
               jsonArray3.add("key");
               jsonArray3.add("id");
               jsonArray3.add("number");
               jsonArray3.add("name");
               jsonArray3.add("price");
               jsonArray3.add("vat");
               jsonArray3.add("barcode");
  }       
  
  
  String  s2=String.valueOf(list);

        JsonObject jsonObj = new JsonObject();
       JsonArray jsonArray1 = new Gson().toJsonTree(list).getAsJsonArray();
               
            jsonObj.add("Product", jsonArray1);
             jsonObj.add("Product Name", jsonArray3);

          String asd =list.toString();
   
      Gson gson = new GsonBuilder().setPrettyPrinting().create();


      org.json.JSONArray jsonArrayyyy = CDL.rowToJSONArray(new JSONTokener(asd));        

     
      
      
               json =  gson.toJson(jsonObj); 
      
              
              
            }
            System.out.println("Data model has been generated");
            
            }
            
    }
    
     catch (SQLException ex )
                {
                
            System.out.println("Error" + ex.getMessage());

                
                }
                                  System.out.println(json );
                 
                                  
                                  
                                  
                                  
                     return json;


                  
                  
                  
                  
                  
    }
     

}
