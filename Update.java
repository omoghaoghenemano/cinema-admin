/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamovies;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author elitebook
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form AdminUpdate
     */
    public Update() {
        initComponents();
        
       
        jLabelImage.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtext = new javax.swing.JTextField();
        moviename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        moviegenre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionmovie = new javax.swing.JTextArea();
        sd = new javax.swing.JLabel();
        movieprice = new javax.swing.JTextField();
        jTxtImage = new javax.swing.JTextField();
        jBtnBrowse = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jBtnSearch = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnSearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MOVIE NAME");

        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOVIE TYPE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MOVIE DESCRIPTION");

        descriptionmovie.setColumns(20);
        descriptionmovie.setFont(descriptionmovie.getFont());
        descriptionmovie.setRows(5);
        descriptionmovie.setBorder(null);
        jScrollPane1.setViewportView(descriptionmovie);

        sd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sd.setForeground(new java.awt.Color(255, 255, 255));
        sd.setText("Price:");

        movieprice.setText("$");

        jBtnBrowse.setBackground(new java.awt.Color(255, 51, 51));
        jBtnBrowse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnBrowse.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBrowse.setText("Broswe Image");
        jBtnBrowse.setToolTipText("");
        jBtnBrowse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnBrowse.setContentAreaFilled(false);
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });

        jLabelImage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelImage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImage.setText("<image will be displayed here>");

        jBtnSearch.setBackground(new java.awt.Color(255, 51, 51));
        jBtnSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSearch.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSearch.setText("Search");
        jBtnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnSearch.setContentAreaFilled(false);
        jBtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearchActionPerformed(evt);
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

        jBtnSearch1.setBackground(new java.awt.Color(255, 51, 51));
        jBtnSearch1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSearch1.setText("Back");
        jBtnSearch1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnSearch1.setContentAreaFilled(false);
        jBtnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(moviegenre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(idtext, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(72, 72, 72)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelImage)
                                        .addComponent(jBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(movieprice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBtnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(jBtnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sd))
                .addGap(525, 525, 525))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moviename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(moviegenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabelImage))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sd)
                    .addComponent(movieprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTxtImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(931, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        
        JSONArray jrr = new JSONArray();
        JSONParser jp = new JSONParser();
       
        String quantityStr;
        if(idExists()){
        try{
            FileReader file = new FileReader("check.json");
            jrr = (JSONArray) jp.parse(file);
        }
            catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, "Error Occured");
                    }
        for(int i=0; i<jrr.size(); i++){
        JSONObject itemArr = (JSONObject)jrr.get(i);
        if(itemArr.get("id").toString().equals(idtext.getText().toString())){
            itemArr.put("name", moviename.getText().toString());
            itemArr.put("Genre", moviegenre.getText().toString());
            itemArr.put("description", descriptionmovie.getText().toString());
            
           
            itemArr.put("price", movieprice.getText().toString());
            
            
           
            itemArr.put("image", jLabelImage.getText().toString());
            try{
            FileWriter file =  new FileWriter("check.json");
            file.write(jrr.toJSONString());
            file.close();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "please check field for error");
        }
            JOptionPane.showMessageDialog(null, "Item has  been stored");
            clearFields();
            
            
        }
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "invalid id");
        }
        
        
        
    }//GEN-LAST:event_jBtnUpdateActionPerformed
    public boolean idExists(){
        boolean condition = false;
        JSONParser parser = new JSONParser();
        ArrayList<String> ids = new ArrayList<>();
         try {
        JSONArray a = (JSONArray) parser.parse(new FileReader("check.json"));
        for (Object o : a)
        {
            JSONObject obj = (JSONObject) o;
            String id = (String) obj.get("id");
            ids.add(id);
           
             
            
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
         for(int i=0; i<ids.size(); i++){
             if(idtext.getText().equals(ids.get(i))){
             condition = true;
             }
         }
        
        
        
        return condition;
    }
    public void clearFields(){
        idtext.setText(null);
        moviename.setText(null);
        moviegenre.setText(null);
        descriptionmovie.setText(null);
        movieprice.setText(null);
        
        
        jTxtImage.setText(null);
        jLabelImage.setIcon(null);
        buttonGroup1.clearSelection();
        
    }
    private void jBtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchActionPerformed
        JSONParser parser = new JSONParser();
       
       if(idExists()){
           
       
       
    try {
        JSONArray a = (JSONArray) parser.parse(new FileReader("check.json"));
        for (Object o : a)
        {
            JSONObject obj = (JSONObject) o;
            if(obj.get("id").equals(idtext.getText())){
            
            moviename.setText((String) obj.get("name"));
            moviegenre.setText((String) obj.get("Genre"));
            descriptionmovie.setText((String) obj.get("description"));
            
            
            movieprice.setText((String) obj.get("price"));
            
            jTxtImage.setText((String) obj.get("image"));
            ImageIcon img = new ImageIcon(new ImageIcon("images/"+(String) obj.get("image")).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
            jLabelImage.setIcon(img);
            jLabelImage.setText((String) obj.get("image"));
            
            
            }
            
            
            
        }
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
       }
       else{
           JOptionPane.showMessageDialog(null, "No such product Id. Try another Id");
           
       }
    }//GEN-LAST:event_jBtnSearchActionPerformed

    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File b = chooser.getSelectedFile();
        String fileName = b.getAbsolutePath();
        String short_filename = b.getName();
        jLabelImage.setText(short_filename);
        
        jTxtImage.setText(fileName);
        ImageIcon img = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT));
        jLabelImage.setIcon(img);
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void jBtnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearch1ActionPerformed
        dispose(); 
        Products a1 = new Products();
         a1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jBtnSearch1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea descriptionmovie;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnSearch;
    private javax.swing.JButton jBtnSearch1;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtImage;
    private javax.swing.JTextField moviegenre;
    private javax.swing.JTextField moviename;
    private javax.swing.JTextField movieprice;
    private javax.swing.JLabel sd;
    // End of variables declaration//GEN-END:variables
}
