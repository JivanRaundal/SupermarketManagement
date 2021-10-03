
package mypackage;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class productsFrame extends javax.swing.JFrame
{
    Connection con = null; 
    Statement st = null;
    ResultSet rs = null;
    
    public productsFrame()
    {
        initComponents();
        selectProduct();
    }
  
    public void selectProduct()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM producttable");
            productTable.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        lblclose1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        txtProdID = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtProdQuantity = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        btnedit = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblclose2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();
        lblseller = new javax.swing.JLabel();
        lblcategories = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 102, 0));

        subPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblclose1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblclose1.setForeground(new java.awt.Color(255, 102, 0));
        lblclose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose1.setText("MANAGE PRODUCTS");
        lblclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 102, 0));
        lbl1.setText("PRODID");

        txtProdID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtProdID.setForeground(new java.awt.Color(255, 102, 0));

        lbl2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 102, 0));
        lbl2.setText("NAME");

        lbl3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 102, 0));
        lbl3.setText("QUANTITY");

        lbl4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 102, 0));
        lbl4.setText("PRICE");

        lbl5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 102, 0));
        lbl5.setText("CATEGORY");

        txtProdName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtProdName.setForeground(new java.awt.Color(255, 102, 0));

        txtProdQuantity.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtProdQuantity.setForeground(new java.awt.Color(255, 102, 0));

        txtProdPrice.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtProdPrice.setForeground(new java.awt.Color(255, 102, 0));

        cmbCategory.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmbCategory.setForeground(new java.awt.Color(255, 102, 0));
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vegetable", "Meat" }));

        btnedit.setBackground(new java.awt.Color(255, 102, 0));
        btnedit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 255));
        btnedit.setText("EDIT");
        btnedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btneditActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(255, 102, 0));
        btnadd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("ADD");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 102, 0));
        btndelete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndeleteActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 102, 0));
        btnclear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclearActionPerformed(evt);
            }
        });

        lblclose2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblclose2.setForeground(new java.awt.Color(255, 102, 0));
        lblclose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose2.setText("PRODUCTS LIST");
        lblclose2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        productTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        productTable.setRowHeight(25);
        productTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        productTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        btnsearch.setBackground(new java.awt.Color(255, 102, 0));
        btnsearch.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanelLayout.createSequentialGroup()
                        .addComponent(lbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtProdID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProdPrice)
                                    .addComponent(txtProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addComponent(lblclose2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addComponent(lblclose1)
                        .addGap(294, 294, 294))))
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose1)
                .addGap(32, 32, 32)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblclose2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblclose.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 255, 255));
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblclose.setText("X");
        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblseller.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblseller.setForeground(new java.awt.Color(255, 255, 255));
        lblseller.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblseller.setText("SELLER");
        lblseller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblseller.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblsellerMouseClicked(evt);
            }
        });

        lblcategories.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblcategories.setForeground(new java.awt.Color(255, 255, 255));
        lblcategories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcategories.setText("CATEGORIES");
        lblcategories.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcategories.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcategoriesMouseClicked(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcategories)
                            .addComponent(lblseller)
                            .addComponent(lblLogout))
                        .addGap(18, 18, 18)
                        .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(lblclose)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblseller)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcategories)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclearActionPerformed
    {//GEN-HEADEREND:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtProdID.setText("");
        txtProdName.setText("");
        txtProdPrice.setText("");
        txtProdQuantity.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnaddActionPerformed
    {//GEN-HEADEREND:event_btnaddActionPerformed
        // TODO add your handling code here:
        if(txtProdID.getText().isEmpty() || txtProdName.getText().isEmpty() || txtProdPrice.getText().isEmpty() ||
           txtProdQuantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
                PreparedStatement pst = con.prepareStatement("INSERT INTO producttable VALUES(?,?,?,?,?)");
                pst.setInt(1, Integer.parseInt(txtProdID.getText()));
                pst.setString(2, txtProdName.getText());
                pst.setInt(3, Integer.parseInt(txtProdQuantity.getText()));
                pst.setInt(4, Integer.parseInt(txtProdPrice.getText()));
                pst.setString(5, (String) cmbCategory.getSelectedItem());    //getSelectedItem() returns ref of Object type 
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Added Successfully");
                con.close();
                
                selectProduct();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error = "+e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_productTableMouseClicked
    {//GEN-HEADEREND:event_productTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int myindex = productTable.getSelectedRow();
        txtProdID.setText(model.getValueAt(myindex, 0).toString());
        txtProdName.setText(model.getValueAt(myindex, 1).toString());
        txtProdQuantity.setText(model.getValueAt(myindex, 2).toString());
        txtProdPrice.setText(model.getValueAt(myindex, 3).toString());
        String category = model.getValueAt(myindex, 4).toString();
        cmbCategory.setSelectedItem(category);
    }//GEN-LAST:event_productTableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndeleteActionPerformed
    {//GEN-HEADEREND:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if(txtProdID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Product ID to be deleted");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
                String id = txtProdID.getText();
                String query = "DELETE FROM producttable WHERE ProdID = " + id;
                Statement st2 = con.createStatement();
                st2.executeUpdate(query);
                con.close();
                selectProduct();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            } 
            catch (Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error = "+e);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btneditActionPerformed
    {//GEN-HEADEREND:event_btneditActionPerformed
        // TODO add your handling code here:
        if(txtProdID.getText().isEmpty() || txtProdName.getText().isEmpty() || txtProdQuantity.getText().isEmpty() ||
           txtProdPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
                String query = "UPDATE producttable SET ProdName = '"+txtProdName.getText()+"', ProdQty = "+
                               txtProdQuantity.getText()+", ProdPrice = "+txtProdPrice.getText()+", ProdCat = '"+
                               cmbCategory.getSelectedItem().toString()+"' WHERE ProdID = "+txtProdID.getText();
                
                Statement st2 = con.createStatement();
                st2.executeUpdate(query); 
                con.close();
                selectProduct();
                JOptionPane.showMessageDialog(this, "Product Updated Successfully");
            } 
            catch (SQLException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error = "+e);
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsearchActionPerformed
    {//GEN-HEADEREND:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(txtProdID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Product ID");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketmanagementdb","codebind","prasadc1234");
                String query = "SELECT * FROM producttable WHERE ProdID = " + txtProdID.getText();
                Statement st2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet RS = st2.executeQuery(query);
                if(RS.first())
                {
                    txtProdName.setText(RS.getString("ProdName"));
                    txtProdQuantity.setText(RS.getString("ProdQty"));
                    txtProdPrice.setText(RS.getString("ProdPrice"));
                    String category = RS.getString("ProdCat");
                    cmbCategory.setSelectedItem(category);
                }
                else
                {
                    txtProdID.setText("");
                    txtProdName.setText("");
                    txtProdQuantity.setText("");
                    txtProdPrice.setText("");
                    JOptionPane.showMessageDialog(this, "No Product Found with given ID");
                }
                con.close();
            } 
            catch (Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error = "+e);
            }
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblsellerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsellerMouseClicked
    {//GEN-HEADEREND:event_lblsellerMouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblsellerMouseClicked

    private void lblcategoriesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcategoriesMouseClicked
    {//GEN-HEADEREND:event_lblcategoriesMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcategoriesMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLogoutMouseClicked
    {//GEN-HEADEREND:event_lblLogoutMouseClicked
        //new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(productsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(productsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(productsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(productsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new productsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblcategories;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblclose1;
    private javax.swing.JLabel lblclose2;
    private javax.swing.JLabel lblseller;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable productTable;
    private javax.swing.JPanel subPanel;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdQuantity;
    // End of variables declaration//GEN-END:variables
}
