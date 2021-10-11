/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Car;
import Model.CarHistory;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;  

/**
 *
 * @author DELL
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarHistory history;
    
    public ViewJPanel(CarHistory history) {
        initComponents();
        this.history = history;
        
        populateTable ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFilterSerialNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        chkAvailable = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chkFilterAvailable = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMinSeat = new javax.swing.JTextField();
        txtMaxSeat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtFilterBrand = new javax.swing.JTextField();
        btnBrand = new javax.swing.JButton();
        txtModelNo = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        txtFilterModelNo = new javax.swing.JTextField();
        lblModelNo1 = new javax.swing.JLabel();
        btnModelNo = new javax.swing.JButton();
        btnSerialNo = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(100000, 1000));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Records");

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Name", "Brand", "Serial No", "Seat No", "Available", "Model No", "Updated Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);
        if (tblView.getColumnModel().getColumnCount() > 0) {
            tblView.getColumnModel().getColumn(5).setResizable(false);
        }

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Expiry Date ");

        jLabel8.setText("Availability:- ");

        jLabel9.setText("Serial Number ");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name:-");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Manufacturing Date");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Brand");

        txtFilterSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterSerialNoActionPerformed(evt);
            }
        });

        jLabel5.setText("No of seats");

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        jLabel6.setText("City");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Editted View");

        jLabel11.setText("Filters");

        chkFilterAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFilterAvailableActionPerformed(evt);
            }
        });

        jLabel12.setText("Availability:- ");

        jLabel13.setText("Availability:- ");

        jLabel14.setText("No of seats:-");

        txtMinSeat.setToolTipText("min no of seat");
        txtMinSeat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMinSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSeatActionPerformed(evt);
            }
        });

        txtMaxSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxSeatActionPerformed(evt);
            }
        });

        jLabel15.setText("-");

        btnFilter.setText("Go");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        jLabel16.setText("Brand:-");

        txtFilterBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterBrandActionPerformed(evt);
            }
        });

        btnBrand.setText("Go");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        txtModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNoActionPerformed(evt);
            }
        });

        lblModelNo.setText("Model Number");

        txtFilterModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterModelNoActionPerformed(evt);
            }
        });

        lblModelNo1.setText("Model Number");

        btnModelNo.setText("Go");
        btnModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNoActionPerformed(evt);
            }
        });

        btnSerialNo.setText("Go");
        btnSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(265, 265, 265)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(343, 343, 343)
                                        .addComponent(btnUpdate))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblModelNo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(240, 240, 240)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel4))
                                                    .addGap(234, 234, 234)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(chkAvailable)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 362, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkFilterAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMinSeat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFilter))
                            .addComponent(txtFilterBrand))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btnBrand))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelNo1)
                                    .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFilterModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtFilterSerialNo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(btnModelNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSerialNo)))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel12)
                    .addContainerGap(1105, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chkFilterAvailable)
                        .addComponent(jLabel13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModelNo1)
                        .addComponent(txtFilterModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModelNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFilterSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerialNo))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFilter)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFilterBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkAvailable))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnUpdate)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(804, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(280, 280, 280)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblView.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex, 0);

        if(selectedCar.getAvailable() == true){
            chkAvailable.setSelected(true);
        }
        else{
            chkAvailable.setSelected(false);

        }
        txtName.setText(selectedCar.getName());
        txtBrand.setText(selectedCar.getBrand());
        txtSeats.setText(String.valueOf(selectedCar.getNoSeats()));
        txtFilterSerialNo.setText(String.valueOf(selectedCar.getSerialNo()));
        txtModelNo.setText(selectedCar.getModelNumber());
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtFilterSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterSerialNoActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblView.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex, 0);

        history.deleteCar(selectedCar);
        JOptionPane.showMessageDialog(this, "Car Record Deleted....");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String brand = txtBrand.getText();
        int seats = Integer.parseInt(txtSeats.getText());
        Double serial_no = Double.parseDouble(txtFilterSerialNo.getText());
        Boolean available = false;
        String modelNo = txtModelNo.getText();

                
        if (chkAvailable.isSelected()){
            available = true;
        }
        
        int selectedRowIndex = tblView.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        Car selectedCar = (Car)model.getValueAt(selectedRowIndex, 0);

        Car c = history.addNewCar();
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimeStamp = new java.sql.Timestamp(now.getTime());
                
        c.setName(name);
        c.setBrand(brand);
        c.setNoSeats(seats);
        c.setSerialNo(serial_no);
        c.setUpdatedDate(currentTimeStamp.toString());
        c.setAvailable(available);
        c.setModelNumber(modelNo);
        
        txtName.setText("");
        txtBrand.setText("");
        txtSeats.setText("");
        txtFilterSerialNo.setText("");
        chkAvailable.setSelected(false);
        txtModelNo.setText("");
        
        
        history.deleteCar(selectedCar);
        JOptionPane.showMessageDialog(this, "Car Record Updated successfully....");
        
        populateTable();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void chkFilterAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFilterAvailableActionPerformed
        // TODO add your handling code here:
        if (chkFilterAvailable.isSelected()){
            populateTableBasedOnAvailability();
        }
        else{
            populateTable();
        }
    }//GEN-LAST:event_chkFilterAvailableActionPerformed

    private void txtMinSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinSeatActionPerformed

    private void txtMaxSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxSeatActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        if(txtMinSeat.getText()!= null && Integer.parseInt(txtMinSeat.getText()) > 0 && txtMaxSeat.getText()!= null && Integer.parseInt(txtMaxSeat.getText()) < 11){
            populateTableBasedOnMinMaxSeat(Integer.parseInt(txtMinSeat.getText()), Integer.parseInt(txtMaxSeat.getText()));

    }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void txtFilterBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterBrandActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        populateTableForBrand();
    }//GEN-LAST:event_btnBrandActionPerformed

    private void txtModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNoActionPerformed

    private void txtFilterModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterModelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterModelNoActionPerformed

    private void btnModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);



    for(Car ch : history.getHistory() ){
    if (ch.getModelNumber().equalsIgnoreCase(txtFilterModelNo.getText())){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();


           model.addRow(row);
       }



        }
    }//GEN-LAST:event_btnModelNoActionPerformed

    private void btnSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);

        for(Car ch : history.getHistory() ){
            if (String.valueOf(ch.getSerialNo()).equalsIgnoreCase(txtFilterSerialNo.getText())){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();


           model.addRow(row);
       }



        }
    }//GEN-LAST:event_btnSerialNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnModelNo;
    private javax.swing.JButton btnSerialNo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkAvailable;
    private javax.swing.JCheckBox chkFilterAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblModelNo1;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtFilterBrand;
    private javax.swing.JTextField txtFilterModelNo;
    private javax.swing.JTextField txtFilterSerialNo;
    private javax.swing.JTextField txtMaxSeat;
    private javax.swing.JTextField txtMinSeat;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeats;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for(Car ch : history.getHistory() ){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();

           model.addRow(row);
        }
    }

    private void populateTableBasedOnAvailability() {
            
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for(Car ch : history.getHistory() ){

           if (ch.getAvailable().equals(true)){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();


           model.addRow(row);
           }
           
        }
    }

    private void populateTableBasedOnMinMaxSeat(Integer min, Integer max) {
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for(Car ch : history.getHistory() ){

           if (ch.getNoSeats() > min && ch.getNoSeats() < max){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();


           model.addRow(row);
           }
           
        }
    }
    private void populateTableForBrand() {
    DefaultTableModel model = (DefaultTableModel) tblView.getModel();
    model.setRowCount(0);



    for(Car ch : history.getHistory() ){
    if (ch.getBrand().contains(txtFilterBrand.getText())){
           Object[] row = new Object[8];
           
           row[0] = ch;
           row[1] = ch.getName();
           row[2] = ch.getBrand();
           row[3] = ch.getSerialNo();
           row[4] = ch.getNoSeats();
           row[5] = ch.getAvailable();
           row[6] = ch.getModelNumber();
           row[7] = ch.getUpdatedDate();


           model.addRow(row);
       }



        }
    }
}
