package main.core;

import main.auth.Register;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManageCustomers extends javax.swing.JFrame {

    private int count;

    public ManageCustomers() {        
        initComponents();
        loadCustomersFromFile();
    }
    
    private void loadCustomersFromFile() {
        DefaultTableModel model = (DefaultTableModel) tbl_managecus.getModel();
        model.setRowCount(0); 

        try (BufferedReader reader = new BufferedReader(new FileReader("txtRegistered_customers.txt"))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 5) {
                    model.addRow(new Object[]{parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4])});
                    count++;
                } else {
                    System.err.println("Invalid data format in line " + (count + 1) + ": " + line);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Error loading customers: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            System.err.println("Error parsing integer: " + ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_addman = new javax.swing.JButton();
        btn_editman = new javax.swing.JButton();
        btn_deleteman = new javax.swing.JButton();
        btn_searchman = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_managecus = new javax.swing.JTable();
        txt_searchman = new javax.swing.JTextField();
        btn_backtohomepage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_idman = new javax.swing.JTextField();
        txt_nameman = new javax.swing.JTextField();
        txt_unitcon = new javax.swing.JTextField();
        txt_rembal = new javax.swing.JTextField();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        btn_reset = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        lblLogo.setText("jLabel1");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE CUSTOMERS");

        btn_addman.setText("Add");
        btn_addman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addmanActionPerformed(evt);
            }
        });

        btn_editman.setText("Edit");
        btn_editman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editmanActionPerformed(evt);
            }
        });

        btn_deleteman.setText("Delete");
        btn_deleteman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletemanActionPerformed(evt);
            }
        });

        btn_searchman.setText("Search");
        btn_searchman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchmanActionPerformed(evt);
            }
        });

        tbl_managecus.setBackground(new java.awt.Color(204, 204, 255));
        tbl_managecus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Unit Consumed", "Remaining Balance", "Month"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_managecus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_managecusMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_managecus);

        txt_searchman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchmanActionPerformed(evt);
            }
        });

        btn_backtohomepage.setBackground(new java.awt.Color(255, 51, 51));
        btn_backtohomepage.setText("Back");
        btn_backtohomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backtohomepageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Unit Consumed:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Remaining Balance:");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Month:");

        txt_idman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idmanActionPerformed(evt);
            }
        });

        txt_nameman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namemanActionPerformed(evt);
            }
        });

        txt_unitcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unitconActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(264, 264, 264))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_searchman, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btn_searchman)
                                .addGap(221, 221, 221))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(146, 146, 146)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nameman)
                                            .addComponent(txt_idman)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_unitcon)
                                            .addComponent(txt_rembal)
                                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_addman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_editman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_deleteman, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(35, 35, 35)
                        .addComponent(btn_backtohomepage)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addman))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nameman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_unitcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_rembal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_editman)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_deleteman)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchman)
                    .addComponent(txt_searchman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btn_backtohomepage))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addmanActionPerformed
                                                                                                                                                                              
        count++;

        String id = Integer.toString(count);
        String name = txt_nameman.getText();
        String unitcon = txt_unitcon.getText();
        String remainbal = txt_rembal.getText();
        int month = jMonthChooser1.getMonth() + 1; // Month is zero-based in JMonthChooser

        try (FileWriter writer = new FileWriter("txtRegistered_customers.txt", true)) {
            if ("".equals(name)) {
                JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(unitcon)) {
                JOptionPane.showMessageDialog(new JFrame(), "Unit Consume is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(remainbal)) {
                JOptionPane.showMessageDialog(new JFrame(), "Remaining Balance is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                writer.write(id + "," + name + "," + unitcon + "," + remainbal + "," + month);
                writer.write(System.getProperty("line.separator"));
                JOptionPane.showMessageDialog(new JFrame(), "User added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);


                DefaultTableModel model = (DefaultTableModel) tbl_managecus.getModel();
                model.addRow(new Object[]{id, name, unitcon, remainbal, month});
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }


        txt_nameman.setText("");
        txt_unitcon.setText("");
        txt_rembal.setText("");


    }//GEN-LAST:event_btn_addmanActionPerformed

    private void btn_editmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editmanActionPerformed
                                                 
        int selectedRow = tbl_managecus.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "No row selected", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String id = tbl_managecus.getValueAt(selectedRow, 0).toString(); // Assuming ID is not editable and is at column 0
        String name = txt_nameman.getText();
        String unitcon = txt_unitcon.getText();
        String remainbal = txt_rembal.getText();

        if ("".equals(name)) {
            JOptionPane.showMessageDialog(new JFrame(), "Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(unitcon)) {
            JOptionPane.showMessageDialog(new JFrame(), "Unit Consume is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if ("".equals(remainbal)) {
            JOptionPane.showMessageDialog(new JFrame(), "Remaining Balance is required", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbl_managecus.getModel();
        model.setValueAt(name, selectedRow, 1);
        model.setValueAt(unitcon, selectedRow, 2);
        model.setValueAt(remainbal, selectedRow, 3);

        try (BufferedReader reader = new BufferedReader(new FileReader("txtRegistered_customers.txt"));
             FileWriter writer = new FileWriter("txtRegistered_customers_tmp.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    writer.write(id + "," + name + "," + unitcon + "," + remainbal);
                    writer.write(System.getProperty("line.separator"));
                } else {
                    writer.write(line);
                    writer.write(System.getProperty("line.separator"));
                }
            }

            File originalFile = new File("txtRegistered_customers.txt");
            File tempFile = new File("txtRegistered_customers_tmp.txt");
            originalFile.delete();
            tempFile.renameTo(originalFile);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }

        txt_nameman.setText("");
        txt_unitcon.setText("");
        txt_rembal.setText("");

        JOptionPane.showMessageDialog(new JFrame(), "User edited successfully", "Success", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_btn_editmanActionPerformed

    private void btn_searchmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchmanActionPerformed
                                             
                                               
        String searchQuery = txt_searchman.getText().trim();

        if (searchQuery.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Please enter an ID to search", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tbl_managecus.getModel();
        boolean found = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            String id = model.getValueAt(i, 0).toString();

            if (id.equals(searchQuery)) {
                // If a match is found, populate the text fields with the user's information
                txt_nameman.setText(model.getValueAt(i, 1).toString());
                txt_unitcon.setText(model.getValueAt(i, 2).toString());
                txt_rembal.setText(model.getValueAt(i, 3).toString());
                tbl_managecus.setRowSelectionInterval(i, i);
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(new JFrame(), "No matching user found", "Error", JOptionPane.ERROR_MESSAGE);
        }



    }//GEN-LAST:event_btn_searchmanActionPerformed

    private void txt_searchmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchmanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchmanActionPerformed

    private void btn_backtohomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backtohomepageActionPerformed
        Home home = new Home();
        home.setVisible(true);        
        dispose();
    }//GEN-LAST:event_btn_backtohomepageActionPerformed

    private void txt_unitconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unitconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unitconActionPerformed

    private void txt_namemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namemanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namemanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_idman.setText("");
        txt_nameman.setText("");
        txt_rembal.setText("");
        txt_unitcon.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tbl_managecusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_managecusMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_tbl_managecusMouseClicked

    private void txt_idmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idmanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idmanActionPerformed

    private void btn_deletemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletemanActionPerformed
                                            
    int selectedRow = tbl_managecus.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(new JFrame(), "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirmation = JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to delete this customer?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) tbl_managecus.getModel();
            model.removeRow(selectedRow);

    }

    }//GEN-LAST:event_btn_deletemanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addman;
    private javax.swing.JButton btn_backtohomepage;
    private javax.swing.JButton btn_deleteman;
    private javax.swing.JButton btn_editman;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_searchman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTable tbl_managecus;
    private javax.swing.JTextField txt_idman;
    private javax.swing.JTextField txt_nameman;
    private javax.swing.JTextField txt_rembal;
    private javax.swing.JTextField txt_searchman;
    private javax.swing.JTextField txt_unitcon;
    // End of variables declaration//GEN-END:variables
}
