package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aps_Conexao {
    
    final private String aps_Driver="org.postgresql.Driver";
    final private String aps_Url="jdbc:postgresql://localhost:5432/"
            + "bd_aps_vendas";
    final private String aps_Usuario = "user_aulas";
    final private String aps_Senha = "123456";
    
    public Connection aps_Conectar()
    {
        Connection aps_Conn = null;
        try
        {  
            Class.forName(aps_Driver);
            aps_Conn = DriverManager.getConnection(aps_Url,aps_Usuario,aps_Senha);
        } catch(ClassNotFoundException ex) {  
            ex.printStackTrace();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        return aps_Conn;
    }
}
