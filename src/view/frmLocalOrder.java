/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author GSG
 */
public class frmLocalOrder extends javax.swing.JFrame {

    /**
     * Creates new form frmLocalOrder
     */
    public frmLocalOrder() {
        initComponents();
                Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        this.setSize(dim.width, dim.height);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //pnlAmount.setLayout(new GridLayout(5, 3, 10, 10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productsGroup = new javax.swing.ButtonGroup();
        numbersGroup = new javax.swing.ButtonGroup();
        pnlAmount = new javax.swing.JPanel();
        btnCombo1 = new javax.swing.JToggleButton();
        btnCombo2 = new javax.swing.JToggleButton();
        btnCombo27 = new javax.swing.JToggleButton();
        btnCombo28 = new javax.swing.JToggleButton();
        btnCombo29 = new javax.swing.JToggleButton();
        btnCombo30 = new javax.swing.JToggleButton();
        btnCombo31 = new javax.swing.JToggleButton();
        btnCombo32 = new javax.swing.JToggleButton();
        btnCombo33 = new javax.swing.JToggleButton();
        btnCombo34 = new javax.swing.JToggleButton();
        btnCombo35 = new javax.swing.JToggleButton();
        btnCombo36 = new javax.swing.JToggleButton();
        pnlProducts = new javax.swing.JPanel();
        btnCombo8 = new javax.swing.JToggleButton();
        btnCombo9 = new javax.swing.JToggleButton();
        btnCombo10 = new javax.swing.JToggleButton();
        btnCombo25 = new javax.swing.JToggleButton();
        btnCombo26 = new javax.swing.JToggleButton();
        btnAdditions1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1382, 744));
        setSize(new java.awt.Dimension(1382, 744));
        getContentPane().setLayout(null);

        pnlAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.Color.red)); // NOI18N
        pnlAmount.setLayout(null);

        numbersGroup.add(btnCombo1);
        btnCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber6.png"))); // NOI18N
        btnCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo1ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo1);
        btnCombo1.setBounds(270, 120, 100, 80);

        numbersGroup.add(btnCombo2);
        btnCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber2.png"))); // NOI18N
        btnCombo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo2ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo2);
        btnCombo2.setBounds(140, 30, 100, 80);

        numbersGroup.add(btnCombo27);
        btnCombo27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber1.png"))); // NOI18N
        btnCombo27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo27ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo27);
        btnCombo27.setBounds(20, 30, 100, 80);

        numbersGroup.add(btnCombo28);
        btnCombo28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber3.png"))); // NOI18N
        btnCombo28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo28ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo28);
        btnCombo28.setBounds(270, 30, 100, 80);

        numbersGroup.add(btnCombo29);
        btnCombo29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber4.png"))); // NOI18N
        btnCombo29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo29ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo29);
        btnCombo29.setBounds(20, 120, 100, 80);

        numbersGroup.add(btnCombo30);
        btnCombo30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber5.png"))); // NOI18N
        btnCombo30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo30ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo30);
        btnCombo30.setBounds(140, 120, 100, 80);

        numbersGroup.add(btnCombo31);
        btnCombo31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber7.png"))); // NOI18N
        btnCombo31.setToolTipText("");
        btnCombo31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo31ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo31);
        btnCombo31.setBounds(20, 220, 100, 80);

        numbersGroup.add(btnCombo32);
        btnCombo32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber8.png"))); // NOI18N
        btnCombo32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo32ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo32);
        btnCombo32.setBounds(140, 220, 100, 80);

        numbersGroup.add(btnCombo33);
        btnCombo33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber9.png"))); // NOI18N
        btnCombo33.setToolTipText("");
        btnCombo33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCombo33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo33ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo33);
        btnCombo33.setBounds(270, 220, 100, 80);

        numbersGroup.add(btnCombo34);
        btnCombo34.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnCombo34.setText("Finalizar pedido");
        btnCombo34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo34ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo34);
        btnCombo34.setBounds(270, 310, 100, 80);

        numbersGroup.add(btnCombo35);
        btnCombo35.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnCombo35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconBtnAdd.png"))); // NOI18N
        btnCombo35.setText("Agregar");
        btnCombo35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCombo35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCombo35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCombo35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo35ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo35);
        btnCombo35.setBounds(140, 310, 100, 80);

        numbersGroup.add(btnCombo36);
        btnCombo36.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnCombo36.setText("Otra cantidad");
        btnCombo36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo36ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCombo36);
        btnCombo36.setBounds(20, 310, 100, 80);

        getContentPane().add(pnlAmount);
        pnlAmount.setBounds(440, 40, 382, 519);

        pnlProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.Color.red)); // NOI18N

        productsGroup.add(btnCombo8);
        btnCombo8.setText("Combo 1");
        btnCombo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo8ActionPerformed(evt);
            }
        });

        productsGroup.add(btnCombo9);
        btnCombo9.setText("Combo 2");
        btnCombo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo9ActionPerformed(evt);
            }
        });

        productsGroup.add(btnCombo10);
        btnCombo10.setText("Combo 3");
        btnCombo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo10ActionPerformed(evt);
            }
        });

        productsGroup.add(btnCombo25);
        btnCombo25.setText("Combo 4");
        btnCombo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo25ActionPerformed(evt);
            }
        });

        productsGroup.add(btnCombo26);
        btnCombo26.setText("Combo 5");
        btnCombo26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombo26ActionPerformed(evt);
            }
        });

        productsGroup.add(btnAdditions1);
        btnAdditions1.setText("Adicionales");
        btnAdditions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditions1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addComponent(btnCombo8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCombo9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addComponent(btnCombo10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCombo25, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addComponent(btnCombo26, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAdditions1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombo8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCombo9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombo10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCombo25, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombo26, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdditions1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(pnlProducts);
        pnlProducts.setBounds(26, 30, 382, 519);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo1ActionPerformed

    private void btnCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo2ActionPerformed

    private void btnCombo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo8ActionPerformed

    private void btnCombo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo9ActionPerformed

    private void btnCombo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo10ActionPerformed

    private void btnCombo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo25ActionPerformed

    private void btnCombo26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo26ActionPerformed

    private void btnAdditions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditions1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdditions1ActionPerformed

    private void btnCombo27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo27ActionPerformed

    private void btnCombo28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo28ActionPerformed

    private void btnCombo29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo29ActionPerformed

    private void btnCombo30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo30ActionPerformed

    private void btnCombo31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo31ActionPerformed

    private void btnCombo32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo32ActionPerformed

    private void btnCombo33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo33ActionPerformed

    private void btnCombo34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo34ActionPerformed

    private void btnCombo35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo35ActionPerformed

    private void btnCombo36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombo36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCombo36ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLocalOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLocalOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdditions1;
    private javax.swing.JToggleButton btnCombo1;
    private javax.swing.JToggleButton btnCombo10;
    private javax.swing.JToggleButton btnCombo2;
    private javax.swing.JToggleButton btnCombo25;
    private javax.swing.JToggleButton btnCombo26;
    private javax.swing.JToggleButton btnCombo27;
    private javax.swing.JToggleButton btnCombo28;
    private javax.swing.JToggleButton btnCombo29;
    private javax.swing.JToggleButton btnCombo30;
    private javax.swing.JToggleButton btnCombo31;
    private javax.swing.JToggleButton btnCombo32;
    private javax.swing.JToggleButton btnCombo33;
    private javax.swing.JToggleButton btnCombo34;
    private javax.swing.JToggleButton btnCombo35;
    private javax.swing.JToggleButton btnCombo36;
    private javax.swing.JToggleButton btnCombo8;
    private javax.swing.JToggleButton btnCombo9;
    private javax.swing.ButtonGroup numbersGroup;
    private javax.swing.JPanel pnlAmount;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.ButtonGroup productsGroup;
    // End of variables declaration//GEN-END:variables
}
