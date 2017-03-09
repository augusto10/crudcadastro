
package crudcadastro;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author augusto
 */

// variaveis da conexao banco de dados
public class Dao {
   Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    
    //  conexao banco mysql
    public void open(){
       try {
           Class.forName("org.gjt.mm.mysql.Driver");

           
       }
       catch (ClassNotFoundException ex){
         
           ex.printStackTrace();
       }
       
        try {
           conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/cadastro","root","");
           stmt=(Statement) conn.createStatement();
       }
       catch(SQLException ex){
            ex.printStackTrace();
           
       }
           
    }
    public void close(){
        try{
            conn.close();
        }catch(Exception ex){
            ex.printStackTrace();
            
            
            
        }
        
    }
    
    // metodo cadastrar cliente
    public void cadastrar(String cad){
        try{
            open();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(cad);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"O cliente foi cadastrado");
            stmt.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel fazer o cadastro"+erro.toString());
            close();
        }
        
    }
    //alterar
    public void altera(String alterar){
        try{
            open();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(alterar);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"O cliente foi alterado");
            stmt.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel fazer alterar"+erro.toString());
            close();
        }
        
    }
    
    
    
    // ecluir dados
     public void exclui(String excluir){
        try{
            open();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(excluir);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"O cliente foi excluido");
            stmt.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possivel fazer excluir"+erro.toString());
            close();
        }
        
    }
     
     //receber dados na tabela
    public void consulta(DefaultTableModel dtm,String consulta){
        Vector <Vector> dados= new Vector();
        open();
        try{
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(consulta);
            pst.executeQuery();
            
            rs= pst.executeQuery(consulta);
            while(rs.next()){
                 int id=rs.getInt("id");
                 String nome=rs.getString("nome");
                 int cpf = rs.getInt("cpf");
                  String end=rs.getString("endereco");
                   int rg = rs.getInt("rg");
                   String data=rs.getString("data_nascimento");
                   String email=rs.getString("email");
                   
                 Vector registrolido = new  Vector(); 
                 registrolido.add(id);
                 registrolido.add(nome);
                 registrolido.add(cpf);
                 registrolido.add(end);
                 registrolido.add(rg);
                 registrolido.add(data);
                 registrolido.add(email);
                 
                 dados.add(registrolido);
                 
                 
            }
            for(int i =0 ; i<dados.size();i++){
                
            
                dtm.addRow(dados.get(i));
            }
            stmt.close();
        }catch(java.sql.SQLException e){
            throw new java.lang.RuntimeException(e.getMessage());
            
            
        }
        
        
        close();
        
        
    }
}

