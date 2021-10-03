
package mypackage;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Category extends javax.swing.JFrame
{

    Connection con = null;
    Statement st = null; 
    ResultSet rs = null;
    
    public Category()
    {
        initComponents();
        selectCategory();
    }

    public void selectCategory()
    {
        try
        {
            con = CommonFunctions.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM categorytable");
            categoryTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        txtCatID = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        txtCatDesc = new javax.swing.JTextField();
        txtCatName = new javax.swing.JTextField();
        btnedit = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblclose2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();
        lblseller = new javax.swing.JLabel();
        lblproducts = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 102, 0));

        subPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblclose1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblclose1.setForeground(new java.awt.Color(255, 102, 0));
        lblclose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose1.setText("MANAGE CATEGORIES");
        lblclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 102, 0));
        lbl1.setText("CATID");

        txtCatID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCatID.setForeground(new java.awt.Color(255, 102, 0));

        lbl2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 102, 0));
        lbl2.setText("DESCRIPTION");

        lbl3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 102, 0));
        lbl3.setText("NAME");

        txtCatDesc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCatDesc.setForeground(new java.awt.Color(255, 102, 0));

        txtCatName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCatName.setForeground(new java.awt.Color(255, 102, 0));

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
        lblclose2.setText("CATEGORIES LIST");
        lblclose2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        categoryTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "ID", "NAME", "DESCRIPTION"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        categoryTable.setRowHeight(25);
        categoryTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryTable);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addComponent(lblclose1)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addComponent(lblclose2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(lbl2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCatDesc))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subPanelLayout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addGap(33, 33, 33)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subPanelLayout.createSequentialGroup()
                                        .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl3))
                                    .addGroup(subPanelLayout.createSequentialGroup()
                                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose1)
                .addGap(35, 35, 35)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblclose2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
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

        lblproducts.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblproducts.setForeground(new java.awt.Color(255, 255, 255));
        lblproducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproducts.setText("PRODUCTS");
        lblproducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblproducts.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblproductsMouseClicked(evt);
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
                            .addComponent(lblseller)
                            .addComponent(lblproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogout))
                        .addGap(25, 25, 25)
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
                        .addComponent(lblproducts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblseller)
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
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnaddActionPerformed
    {//GEN-HEADEREND:event_btnaddActionPerformed
        // TODO add your handling code here:
        if(txtCatID.getText().isEmpty() || txtCatName.getText().isEmpty() || txtCatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                PreparedStatement pst = con.prepareStatement("INSERT INTO categorytable VALUES(?,?,?)");
                pst.setInt(1, Integer.parseInt(txtCatID.getText()));
                pst.setString(2, txtCatName.getText());
                pst.setString(3, txtCatDesc.getText());
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Category Added Successfully");
                con.close();
                
                selectCategory();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error = "+e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclearActionPerformed
    {//GEN-HEADEREND:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtCatID.setText("");
        txtCatName.setText("");
        txtCatDesc.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_categoryTableMouseClicked
    {//GEN-HEADEREND:event_categoryTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
        int myindex = categoryTable.getSelectedRow();
        txtCatID.setText(model.getValueAt(myindex, 0).toString());
        txtCatName.setText(model.getValueAt(myindex, 1).toString());
        txtCatDesc.setText(model.getValueAt(myindex, 2).toString());
    }//GEN-LAST:event_categoryTableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndeleteActionPerformed
    {//GEN-HEADEREND:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if(txtCatID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Category ID To be Deleted");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String id = txtCatID.getText();
                String query = "DELETE FROM categorytable WHERE CatID = " + id;
                Statement st2 = con.createStatement();
                st2.executeUpdate(query);
                con.close();
                selectCategory();
                JOptionPane.showMessageDialog(this, "Category Removed");
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
        if(txtCatID.getText().isEmpty() || txtCatName.getText().isEmpty() || txtCatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String query = "UPDATE categorytable SET CatName = '"+txtCatName.getText()+"', CatDesc = '"+
                               txtCatDesc.getText()+"' WHERE CatID = "+txtCatID.getText();
                Statement st2 = con.createStatement();
                st2.executeUpdate(query); 
                con.close();
                selectCategory();
                JOptionPane.showMessageDialog(this, "Category Updated Successfully");
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
        if(txtCatID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Seller ID");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String query = "SELECT * FROM categorytable WHERE CatID = " + txtCatID.getText();
                Statement st2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet RS = st2.executeQuery(query);
                if(RS.first())
                {
                    txtCatName.setText(RS.getString("CatName"));
                    txtCatDesc.setText(RS.getString("CatDesc"));
                }
                else
                {
                    txtCatID.setText("");
                    txtCatName.setText("");
                    txtCatDesc.setText("");
                    JOptionPane.showMessageDialog(this, "No Category Found with given ID");
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

    private void lblproductsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblproductsMouseClicked
    {//GEN-HEADEREND:event_lblproductsMouseClicked
        new productsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblproductsMouseClicked

    private void lblsellerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsellerMouseClicked
    {//GEN-HEADEREND:event_lblsellerMouseClicked
        new Seller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblsellerMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JTable categoryTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblclose1;
    private javax.swing.JLabel lblclose2;
    private javax.swing.JLabel lblproducts;
    private javax.swing.JLabel lblseller;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel subPanel;
    private javax.swing.JTextField txtCatDesc;
    private javax.swing.JTextField txtCatID;
    private javax.swing.JTextField txtCatName;
    // End of variables declaration//GEN-END:variables
}
