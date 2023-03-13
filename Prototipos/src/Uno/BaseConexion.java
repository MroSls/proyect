package Uno;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author MASN0
 */
public class BaseConexion {
    Connection SQLConexion;
    
    public BaseConexion(){
        
        String host="localhost";
        String puerto="3306";
        String nameBD="registro|";
        
        String usuario="root";
        String pass="";
        
        String driver="com.mysql.cj.jdbc.Driver";
        
        String databaseURL="jdbc:mysql://"+host+":"+puerto+"/"+nameBD+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion=DriverManager.getConnection(databaseURL,usuario, pass);
            System.out.println("Base de datos conectada");
        }catch(Exception ex){
            System.out.println("La base de datos no se a encontrado\n"+ex);
        }
    }
    
    public Connection getConectarDB(){
        return SQLConexion;
    }
}