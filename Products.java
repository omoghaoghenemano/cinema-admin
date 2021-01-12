/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamovies;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.animation.KeyValue;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.UserDataHandler;

/**
 *
 * @author elitebook
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products (){
        
    }
    public Products(String Username) {
        initComponents();
        addRowToJTable();
        
    }
    
    
    public class Product{
    
        public String id;
        public String pName;
        public String pPrice;
     
        public JLabel pImageIcon; 
        public String Genre;
        public String pDescription;
        public String pCondition;
        
        
        
        public Product(String Id, String PName, String Genre, String PDescription,  String PPrice,  JLabel PImageIcon){
            this.id = Id;
            this.pName = PName;
            this.pPrice = PPrice;
            
            this.pImageIcon = PImageIcon;
            this.Genre = Genre;
            this.pDescription = PDescription;
            
            
            
        }
        
        
    }
    
    public ArrayList ListProducts(){
        
       JSONParser parser = new JSONParser();
       ArrayList<String> ids = new ArrayList<>();
       ArrayList<String> names = new ArrayList<>();
       ArrayList<String> prices = new ArrayList<>();
 
       ArrayList<String> images = new ArrayList<>();
       ArrayList<String> genres = new ArrayList<>();
       ArrayList<String> descriptions = new ArrayList<>();
    
    try {
        JSONArray a = (JSONArray) parser.parse(new FileReader("check.json"));
        for (Object o : a)
        {
            JSONObject obj = (JSONObject) o;
            String id = (String) obj.get("id");
            ids.add(id);
            String name = (String) obj.get("name");
            names.add(name);
            String price = (String) obj.get("price");
            prices.add(price);
        
            String image = (String) obj.get("image");
            images.add(image);
            String genre = (String) obj.get("Genre");
            genres.add(genre);
            String description = (String) obj.get("description");
            descriptions.add(description);

             
            
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
        
        
        ArrayList<Product> list =  new ArrayList<Product>();
        
        
        
        
        
        for(int i=0; i<ids.size(); i++){
            ImageIcon img = new ImageIcon(new ImageIcon("images/"+images.get(i)).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            JLabel label = new JLabel();
            label.setIcon(img);
            Product p1 = new Product(ids.get(i), names.get(i), genres.get(i), descriptions.get(i),  prices.get(i), label);
            list.add(p1);
        }
        
        
        return list;
    }
    
    public void addRowToJTable(){
        
        jTable1.getColumn("Image").setCellRenderer(new LabelRenderer());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<Product> list = ListProducts();
        Object rowData[] = new Object[8];
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).id;
            rowData[1] = list.get(i).pName;
            rowData[2] = list.get(i).Genre;
            rowData[3] = list.get(i).pDescription;
            
            rowData[4] = list.get(i).pPrice;
            
            rowData[5] = list.get(i).pImageIcon;
            model.addRow(rowData);
        }
    }
    
    class LabelRenderer implements TableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            TableColumn tc = jtable.getColumn("Image");
            tc.setMinWidth(300);
            tc.setMaxWidth(200);
            jtable.setRowHeight(200);
            return (Component)value;
             //To change body of generated methods, choose Tools | Templates.
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtn = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(255, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Movie Name", "movie Genre", "Description", "Price", "Image"
            }
        ));
        jTable1.setDropMode(javax.swing.DropMode.INSERT);
        jScrollPane1.setViewportView(jTable1);

        jBtn.setBackground(new java.awt.Color(255, 51, 51));
        jBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtn.setForeground(new java.awt.Color(255, 255, 255));
        jBtn.setText("DELETE ");
        jBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtn.setContentAreaFilled(false);
        jBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActionPerformed(evt);
            }
        });

        jBtnAdd.setBackground(new java.awt.Color(255, 51, 51));
        jBtnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAdd.setText("ADD PRODUCT");
        jBtnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAdd.setContentAreaFilled(false);
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnUpdate.setBackground(new java.awt.Color(255, 51, 51));
        jBtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jBtnUpdate.setText("Update");
        jBtnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnUpdate.setContentAreaFilled(false);
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("B&M cinema");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(1007, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        dispose();
        new Moviemain().setVisible(true);
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        dispose();
        new Update().setVisible(true);
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActionPerformed
        dispose();
        Deletefromadmin p1 = new Deletefromadmin();
        p1.setVisible(true);
    }//GEN-LAST:event_jBtnActionPerformed

     
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
