package main.core;

import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.core.model.User;

public class Billing extends javax.swing.JFrame {

    private User currentUser = null;
    private double charge, grossAmount;
    private int unitConsumed;
    private Date currentDate = new Date(); 
    private String currentDateInString = currentDate.toString();
    
    public Billing() {
        initComponents();
    }

    public void setCurrentUser(User user) {
        currentUser = user;
        lbl_name.setText(user.getName());
        lblId.setText(user.getId());
    }
    
    public void calculateBill() {        
        if (unitConsumed <= 100) {
            charge = 7.50;  
        }
        else if (unitConsumed<=200 ) {
            charge = 9.00; 
        }
        else if (unitConsumed<=300) {
            charge = 10.50;
        }
        else {
            charge = 11.00; 
        }
        
        grossAmount = charge *  unitConsumed;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPanel = new javax.swing.JTabbedPane();
        customerInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_customerid = new javax.swing.JLabel();
        lbl_customername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_unit = new javax.swing.JTextField();
        btn_generate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        invoice = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_reciept = new javax.swing.JTextArea();
        btn_print = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        tabbedPanel.setBackground(new java.awt.Color(204, 204, 255));
        tabbedPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        customerInput.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setText("jLabel1");

        lbl_customerid.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lbl_customerid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_customerid.setText("Customer ID:");

        lbl_customername.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lbl_customername.setForeground(new java.awt.Color(255, 255, 255));
        lbl_customername.setText("Customer Name:");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unit Consumed: ");

        txt_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unitActionPerformed(evt);
            }
        });

        btn_generate.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_generate.setText("Generate Bill");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proceed to \"Customer Bill\" tab after input");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Electricity Billing System");

        lbl_name.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("Name");

        lblId.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Month:");

        javax.swing.GroupLayout customerInputLayout = new javax.swing.GroupLayout(customerInput);
        customerInput.setLayout(customerInputLayout);
        customerInputLayout.setHorizontalGroup(
            customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInputLayout.createSequentialGroup()
                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerInputLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(customerInputLayout.createSequentialGroup()
                        .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customerInputLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_customerid)
                                    .addComponent(lbl_customername)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lbl_name)
                                    .addComponent(txt_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(customerInputLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel6))
                            .addGroup(customerInputLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customerInputLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        customerInputLayout.setVerticalGroup(
            customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_customerid)
                    .addComponent(lblId))
                .addGap(34, 34, 34)
                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_customername)
                    .addComponent(lbl_name))
                .addGap(32, 32, 32)
                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(customerInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_unit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        tabbedPanel.addTab("Customer Info", customerInput);

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setText("jLabel1");

        txtarea_reciept.setColumns(20);
        txtarea_reciept.setRows(5);
        jScrollPane1.setViewportView(txtarea_reciept);

        btn_print.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(255, 102, 102));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_done.setBackground(new java.awt.Color(153, 153, 255));
        btn_done.setText("Done");
        btn_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(btn_done)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_save)
                .addGap(28, 28, 28))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_done))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout invoiceLayout = new javax.swing.GroupLayout(invoice);
        invoice.setLayout(invoiceLayout);
        invoiceLayout.setHorizontalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        invoiceLayout.setVerticalGroup(
            invoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPanel.addTab("Customer Bill/Receipt", invoice);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void printInvoice() {
        String lbl_unit = txt_unit.getText();
        txtarea_reciept.setText(txtarea_reciept.getText() + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "\n"+ currentDateInString);
        txtarea_reciept.setText(txtarea_reciept.getText() + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "--------------------------------------\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "|    Electricity Billing System    |" + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "--------------------------------------");
        txtarea_reciept.setText(txtarea_reciept.getText() + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "ID:" + currentUser.getId() + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "Name: " + currentUser.getName() + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "Unit Consumed/kWh: ₱" + lbl_unit + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText()+ "Charge per kWh: ₱" + charge + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "Total Amount: = " +"₱" +  grossAmount + "\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "Transaction Succesful!\n");
        txtarea_reciept.setText(txtarea_reciept.getText() + "--------------------------------------\n");
    }
        
    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
        
        if (txt_unit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields before clicking the button", "Input Required", JOptionPane.WARNING_MESSAGE);
            return; 
        }
                
        unitConsumed = Integer.parseInt(txt_unit.getText());
       
        calculateBill();
        printInvoice(); 
        
        tabbedPanel.setSelectedIndex(1);

    }//GEN-LAST:event_btn_generateActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {

            txtarea_reciept.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doneActionPerformed
        // TODO add your handling code here:
        
        Feedback fb = new Feedback();
        fb.show();
        
        dispose();
    }//GEN-LAST:event_btn_doneActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       
        String id = currentUser.getId();
        String name = currentUser.getName();
        String unit = txt_unit.getText();
        String reciept = txtarea_reciept.getText(); // Corrected variable name

        try {  
            FileWriter writer = new FileWriter("txtRecord_Receipt.txt", true);
            writer.write(" " + id + "," + /*name*/  "," + reciept);
            writer.write(System.getProperty("line.separator")); // Corrected property name
            writer.close();
            JOptionPane.showMessageDialog(this, " Record Saved Successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_done;
    private javax.swing.JButton btn_generate;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_save;
    private javax.swing.JPanel customerInput;
    private javax.swing.JPanel invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lbl_customerid;
    private javax.swing.JLabel lbl_customername;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTextField txt_unit;
    private javax.swing.JTextArea txtarea_reciept;
    // End of variables declaration//GEN-END:variables
}
