
package mypackage;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Seller extends javax.swing.JFrame
{
    Connection con = null; 
    Statement st = null;
    ResultSet rs = null;
    
    public Seller()
    {
        initComponents();
        selectSeller();
        
        CommonFunctions.addDateTime(lblDate);
    }

    public void selectSeller()
    {
        try
        {
            con = CommonFunctions.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM sellertable");
            sellerTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        txtSellID = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtSellName = new javax.swing.JTextField();
        txtSellPass = new javax.swing.JTextField();
        cmbSellGender = new javax.swing.JComboBox<>();
        btnedit = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lblclose2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();
        lblproducts = new javax.swing.JLabel();
        lblcategory = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 102, 0));

        subPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblclose1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblclose1.setForeground(new java.awt.Color(255, 102, 0));
        lblclose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose1.setText("MANAGE SELLERS");
        lblclose1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 102, 0));
        lbl1.setText("SELLERID");

        txtSellID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtSellID.setForeground(new java.awt.Color(255, 102, 0));
        txtSellID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSellID.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtSellIDKeyTyped(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 102, 0));
        lbl2.setText("NAME");

        lbl3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 102, 0));
        lbl3.setText("PASSWORD");
        lbl3.setToolTipText("");

        lbl5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 102, 0));
        lbl5.setText("GENDER");

        txtSellName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtSellName.setForeground(new java.awt.Color(255, 102, 0));
        txtSellName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtSellName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtSellNameKeyTyped(evt);
            }
        });

        txtSellPass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtSellPass.setForeground(new java.awt.Color(255, 102, 0));
        txtSellPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        cmbSellGender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cmbSellGender.setForeground(new java.awt.Color(255, 102, 0));
        cmbSellGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        cmbSellGender.setPreferredSize(new java.awt.Dimension(81, 30));

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
        lblclose2.setText("SELLERS LIST");
        lblclose2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sellerTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "PASSWORD", "GENDER"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        sellerTable.setRowHeight(25);
        sellerTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                sellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellerTable);

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
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addContainerGap(265, Short.MAX_VALUE)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                                .addComponent(lblclose2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(255, 255, 255))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                                .addComponent(lblclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257))))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSellName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtSellID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSellPass, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(cmbSellGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 41, Short.MAX_VALUE)))))
                .addGap(37, 37, 37))
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclose1)
                .addGap(35, 35, 35)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSellID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(subPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSellName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSellPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSellGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)))
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

        lblcategory.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblcategory.setForeground(new java.awt.Color(255, 255, 255));
        lblcategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcategory.setText("CATEGORIES");
        lblcategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcategory.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcategoryMouseClicked(evt);
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

        lblDate.setBackground(new java.awt.Color(255, 102, 0));
        lblDate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcategory)
                            .addComponent(lblproducts)
                            .addComponent(lblLogout))
                        .addGap(18, 18, 18)
                        .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblclose)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblproducts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcategory)
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
        if(txtSellID.getText().isEmpty() || txtSellName.getText().isEmpty() || txtSellPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                PreparedStatement pst = con.prepareStatement("INSERT INTO sellertable VALUES(?,?,?,?)");
                pst.setInt(1, Integer.parseInt(txtSellID.getText()));
                pst.setString(2, txtSellName.getText());
                pst.setString(3, txtSellPass.getText());
                pst.setString(4, (String) cmbSellGender.getSelectedItem());     //getSelectedItem() returns ref of Object type 
                int row = pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Seller Added Successfully");
                con.close();
                
                selectSeller();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error = "+e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_sellerTableMouseClicked
    {//GEN-HEADEREND:event_sellerTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) sellerTable.getModel();
        int myindex = sellerTable.getSelectedRow();
        txtSellID.setText(model.getValueAt(myindex, 0).toString());
        txtSellName.setText(model.getValueAt(myindex, 1).toString());
        txtSellPass.setText(model.getValueAt(myindex, 2).toString());
        String gender = model.getValueAt(myindex, 3).toString();
        cmbSellGender.setSelectedItem(gender);
    }//GEN-LAST:event_sellerTableMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclearActionPerformed
    {//GEN-HEADEREND:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtSellID.setText("");
        txtSellName.setText("");
        txtSellPass.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndeleteActionPerformed
    {//GEN-HEADEREND:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if(txtSellID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the Seller ID to be deleted");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String id = txtSellID.getText();
                String query = "DELETE FROM sellertable WHERE SellID = " + id;
                Statement st2 = con.createStatement();
                st2.executeUpdate(query);
                con.close();
                selectSeller();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully");
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
        if(txtSellID.getText().isEmpty() || txtSellName.getText().isEmpty() || txtSellPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Missing Information");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String query = "UPDATE sellertable SET SellName = '"+txtSellName.getText()+"', SellPass = '"+
                               txtSellPass.getText()+"', SellGender = '"+cmbSellGender.getSelectedItem().toString()+
                               "' WHERE SellID = "+txtSellID.getText();
                Statement st2 = con.createStatement();
                st2.executeUpdate(query); 
                con.close();
                selectSeller();
                JOptionPane.showMessageDialog(this, "Seller Updated Successfully");
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
        if(txtSellID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Seller ID");
        }
        else
        {
            try
            {
                con = CommonFunctions.getConnection();
                String query = "SELECT * FROM sellertable WHERE SellID = " + txtSellID.getText();
                Statement st2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet RS = st2.executeQuery(query);
                if(RS.first())
                {
                    txtSellName.setText(RS.getString("SellName"));
                    txtSellPass.setText(RS.getString("SellPass"));
                    String gender = RS.getString("SellGender");
                    cmbSellGender.setSelectedItem(gender);
                }
                else
                {
                    txtSellID.setText("");
                    txtSellName.setText("");
                    txtSellPass.setText("");
                    JOptionPane.showMessageDialog(this, "No seller Found with given ID");
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
        CommonFunctions.stopThread();
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblproductsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblproductsMouseClicked
    {//GEN-HEADEREND:event_lblproductsMouseClicked
        CommonFunctions.stopThread();
        new productsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblproductsMouseClicked

    private void lblcategoryMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcategoryMouseClicked
    {//GEN-HEADEREND:event_lblcategoryMouseClicked
        CommonFunctions.stopThread();
        new Category().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblcategoryMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblLogoutMouseClicked
    {//GEN-HEADEREND:event_lblLogoutMouseClicked
        CommonFunctions.stopThread();
        this.dispose();
        new login().setVisible(true);

    }//GEN-LAST:event_lblLogoutMouseClicked

    private void txtSellIDKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSellIDKeyTyped
    {//GEN-HEADEREND:event_txtSellIDKeyTyped
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtSellIDKeyTyped

    private void txtSellNameKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtSellNameKeyTyped
    {//GEN-HEADEREND:event_txtSellNameKeyTyped
        CommonFunctions.alphabetValidation(evt);
    }//GEN-LAST:event_txtSellNameKeyTyped


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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Seller().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cmbSellGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblclose1;
    private javax.swing.JLabel lblclose2;
    private javax.swing.JLabel lblproducts;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable sellerTable;
    private javax.swing.JPanel subPanel;
    private javax.swing.JTextField txtSellID;
    private javax.swing.JTextField txtSellName;
    private javax.swing.JTextField txtSellPass;
    // End of variables declaration//GEN-END:variables
}
