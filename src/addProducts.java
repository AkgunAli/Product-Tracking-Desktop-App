
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class addProducts extends javax.swing.JFrame {

    Connection conn = null ;
    
    
    /**
     * Creates new form NewJFrame1
     */
    public addProducts() {
        
        initComponents();
        
               
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNumber = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productBarcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        errorproductNumber = new javax.swing.JLabel();
        errorproductBarcod = new javax.swing.JLabel();
        errorproductPrice = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        productVat2 = new javax.swing.JComboBox<>();
        errorproductName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        productNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNumberActionPerformed(evt);
            }
        });
        productNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productNumberKeyTyped(evt);
            }
        });

        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });
        productName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productNameKeyTyped(evt);
            }
        });

        productPrice.setToolTipText("");
        productPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceActionPerformed(evt);
            }
        });
        productPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productPriceKeyTyped(evt);
            }
        });

        productBarcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBarcodActionPerformed(evt);
            }
        });
        productBarcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productBarcodKeyTyped(evt);
            }
        });

        jLabel1.setText("Product Name");

        jLabel2.setText("Product Number");

        jLabel3.setText("Product Price");

        jLabel4.setText("Product Barcode");

        jLabel5.setText("Product Vat");

        saveButton.setBackground(new java.awt.Color(15, 247, 62));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        errorproductNumber.setForeground(new java.awt.Color(255, 0, 0));
        errorproductNumber.setText(" Sayı giriniz.1-99999 aralığı değer giriniz.");

        errorproductBarcod.setForeground(new java.awt.Color(255, 0, 0));
        errorproductBarcod.setText("Max 13 karakter girebilirsiniz.");

        errorproductPrice.setForeground(new java.awt.Color(255, 0, 0));
        errorproductPrice.setText("Ondalık sayı girebilirsiniz.\",\" \".\" kullanabilirsiniz.");

        jButton1.setBackground(new java.awt.Color(118, 186, 253));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        productVat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "8", "18" }));
        productVat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productVat2ActionPerformed(evt);
            }
        });

        errorproductName.setForeground(new java.awt.Color(255, 0, 0));
        errorproductName.setText("Max 20 karakter girebilirsiniz.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorproductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productBarcod)
                        .addComponent(errorproductNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorproductBarcod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productName)
                        .addComponent(productNumber)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(productVat2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errorproductName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(productPrice)))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorproductNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorproductName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(errorproductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productVat2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productBarcod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorproductBarcod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void productNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNumberActionPerformed
        // TODO add your handling code here:
    

                 //    String Total = productPrice.getText();
                  //    float total2 = Float.parseFloat(Total);
            //    productPrice.setText(String.format("%.2f", Total));

        
    }//GEN-LAST:event_productNumberActionPerformed

       
       
    
    private void productNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNumberKeyTyped

     

        
         char onlyNumber = evt.getKeyChar();
        if(!(Character.isDigit(onlyNumber))){
                                                      
 
            evt.consume();
            

              }
                    

        
        else if(productNumber.getText().length() <0   || productNumber.getText().length() >=5     ) {  
              
                evt.consume();
              }

             else if(productNumber.getText().length()>-1  ) {  
              
                 errorproductNumber.setText("");
              }
        
        
        
            
            
            
            
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_productNumberKeyTyped

    private void productNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameKeyTyped


 
       
       if(productName.getText().length() >= 20 ) {  
                evt.consume();

              }
  
       else if(productName.getText().length() >0 ) {  
                    errorproductName.setText("");


       }
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameKeyTyped

    private void productPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productPriceKeyTyped

        
                // ". , " KULLANIMI

        
        if(     !Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.' && 
                !Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!=','){
       evt.consume();
                        } 
        else if(evt.getKeyChar()=='.'&&productPrice.getText().contains("." )   &&
                evt.getKeyChar()==','&&productPrice.getText().contains(",")
                ){
           evt.consume();
            }   

        
                      
        //KURALLAR
        
        if(productPrice.getText().length() <0 ||    productPrice.getText().length()>=8     ) {  
              
                evt.consume();
              }
        
         else if(productPrice.getText().length() >0    ) {  
              
               errorproductPrice.setText("");
              }

                       
                
                
                
                // TODO add your handling code here:
;
    }//GEN-LAST:event_productPriceKeyTyped

    private void productBarcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBarcodActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_productBarcodActionPerformed

    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
        conn = Connect.ConnectDB();
        
    }//GEN-LAST:event_formWindowOpened

    
    
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        
            if (!productNumber.getText().isEmpty()&& !productName.getText().isEmpty() && 
                    !productPrice.getText().isEmpty() && !productVat2.getSelectedItem().toString().isEmpty()  )
            {
            
                try {
                    Operations.insertData(
                            
                           productNumber.getText(),
                            productName.getText(),
                          productPrice.getText(),
                            productVat2.getSelectedItem().toString(),
                            productBarcod.getText()
                            
                    );  } 
                catch (SQLException ex) {
                    Logger.getLogger(addProducts.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            
            clearTextbox();
            
            }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    public void clearTextbox ()
       {
       
                            productNumber.setText("");
                            productName.setText("");
                            productPrice.setText("");
                            productVat2.setSelectedItem("0");
                            productBarcod.setText("");
                            
       
       
       }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        this.toBack();
        setVisible(false);
        new mainJframe().toFront();
        new mainJframe().setState(java.awt.Frame.NORMAL);




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceActionPerformed

    private void productBarcodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productBarcodKeyTyped

             productBarcod.setTransferHandler(null);

        
 
                 
    if(   productBarcod.getText().length()>=13     ) {  
              
                evt.consume();
              }
     
    
    else if(productBarcod.getText().length()>-1  ) {  
              
                 errorproductBarcod.setText("");
              }
        
    
    

        // TODO add your handling code here:
    }//GEN-LAST:event_productBarcodKeyTyped

    private void productVat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productVat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productVat2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorproductBarcod;
    private javax.swing.JLabel errorproductName;
    private javax.swing.JLabel errorproductNumber;
    private javax.swing.JLabel errorproductPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField productBarcod;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productNumber;
    private javax.swing.JTextField productPrice;
    private javax.swing.JComboBox<String> productVat2;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}

