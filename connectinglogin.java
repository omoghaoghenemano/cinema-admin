
package cinemamovies;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class connectinglogin {
    
    String databaseUsername = "admin";
    String databasePassword = "1234";
    
    String username,password; // these i get from the user
    
     connectinglogin(String u, String pwd){
     
         this.username = u;
         this.password = pwd;
     }
    
     
     
     public void Connection(){
     
         if ((this.username.equals(databaseUsername)) && (this.password.equals(databasePassword)))
         {
             // login successfully done
             
          
            Products a1 = new Products(username);
            
            a1.setVisible(true);
            
            a1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            
            
             
            
                     }
         
         else
         {
             //failed connection
            JOptionPane.showMessageDialog(null, " wrong username/password");
            
            
         }
         
     
     }
   
}
