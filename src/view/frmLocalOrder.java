/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.Console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.clsDAOAdditionalProducts;
import model.clsDAOLocalOrderDetails;
import model.clsDAOProducts;

/**
 *
 * @author GSG
 */
public class frmLocalOrder extends javax.swing.JFrame {

    int stateTypeProduct = 0;
    int deleteSelectionState = 0;
    model.clsDAOLocalOrderDetails localOrder;
    model.clsDAOProducts products;
    model.clsDAOAdditionalProducts additionalProducts;

    /**
     * Creates new form frmLocalOrder
     */
    public frmLocalOrder() {
        this.setUndecorated(true); //pantalla completa
        initComponents();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        this.setSize(dim.width, dim.height);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgAdditionsLocalOrder.setLocationRelativeTo(this);
        //pnlAmount.setLayout(new GridLayout(5, 3, 10, 10));
    }

    public void loadAdditionalProductsValues() {
        localOrder = new model.clsDAOLocalOrderDetails();
        LinkedList<String[]> values = new LinkedList<String[]>();
        values = localOrder.listAdditionalProducts();
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i)[0] != null) {
                switch (values.get(i)[0]) {
                    case "Alitas":
                        btnAdditionalProduct1.setText(values.get(i)[0]);
                        btnAdditionalProduct1.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Papas":
                        btnAdditionalProduct2.setText(values.get(i)[0]);
                        btnAdditionalProduct2.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Salsas":
                        btnAdditionalProduct3.setText(values.get(i)[0]);
                        btnAdditionalProduct3.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Gaseosa Pequeña":
                        btnAdditionalProduct4.setText(values.get(i)[0]);
                        btnAdditionalProduct4.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);

                        break;
                    case "Gaseosa Grande":
                        btnAdditionalProduct5.setText(values.get(i)[0]);
                        btnAdditionalProduct5.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    default:
                        break;
                }

            }
        }
    }

    public void loadNameProductValues() {
        localOrder = new model.clsDAOLocalOrderDetails();
        LinkedList<String[]> values = new LinkedList<String[]>();
        values = localOrder.listProducts();
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i)[0] != null) {
                switch (values.get(i)[0]) {
                    case "Combo 1":
                        btnProduct1.setText(values.get(i)[0]);
                        btnProduct1.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Combo 2":
                        btnProduct2.setText(values.get(i)[0]);
                        btnProduct2.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Combo 3":
                        btnProduct3.setText(values.get(i)[0]);
                        btnProduct3.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    case "Combo 4":
                        btnProduct4.setText(values.get(i)[0]);
                        btnProduct4.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);

                        break;
                    case "Combo 5":
                        btnProduct5.setText(values.get(i)[0]);
                        btnProduct5.setToolTipText(values.get(i)[1] + " $ " + values.get(i)[2]);
                        break;
                    default:
                        break;
                }
            }
        }

        btnProduct6.setText("Adicionales");
        btnProduct6.setToolTipText("Productos adicionales, como gaseosa, papas, etc.");
        btnProduct7.setEnabled(false);
        btnProduct8.setEnabled(false);
        btnProduct9.setEnabled(false);
//        btnProduct6.setText(values.get(5)[0]);
//        btnProduct7.setText(values.get(6)[0]);
//        btnProduct8.setText(values.get(7)[0]);
//        btnProduct9.setText(values.get(8)[0]);
//        btnProduct6.setToolTipText(values.get(5)[1] + " $ " + values.get(5)[2]);
//        btnProduct7.setToolTipText(values.get(6)[1] + " $ " + values.get(6)[2]);
//        btnProduct8.setToolTipText(values.get(7)[1] + " $ " + values.get(7)[2]);
//        btnProduct9.setToolTipText(values.get(8)[1] + " $ " + values.get(8)[2]);

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
        actionsGroup = new javax.swing.ButtonGroup();
        additionsGroup = new javax.swing.ButtonGroup();
        dlgAdditionsLocalOrder = new javax.swing.JDialog();
        pblAdditionsLocalOrder = new javax.swing.JPanel();
        btnAdditionalProduct2 = new javax.swing.JToggleButton();
        btnAdditionalProduct3 = new javax.swing.JToggleButton();
        btnAdditionalProduct1 = new javax.swing.JToggleButton();
        btnAdditionalProduct6 = new javax.swing.JToggleButton();
        btnAdditionalProduct4 = new javax.swing.JToggleButton();
        btnAdditionalProduct5 = new javax.swing.JToggleButton();
        btnDlgAdditionsCancel = new javax.swing.JButton();
        pnlAmount = new javax.swing.JPanel();
        btnNumber6 = new javax.swing.JToggleButton();
        btnNumber2 = new javax.swing.JToggleButton();
        btnNumber1 = new javax.swing.JToggleButton();
        btnNumber3 = new javax.swing.JToggleButton();
        btnNumber4 = new javax.swing.JToggleButton();
        btnNumber5 = new javax.swing.JToggleButton();
        btnNumber7 = new javax.swing.JToggleButton();
        btnNumber8 = new javax.swing.JToggleButton();
        btnNumber9 = new javax.swing.JToggleButton();
        btnDoneOrder = new javax.swing.JButton();
        btnCorrection = new javax.swing.JButton();
        btnOtherAmount = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        pnlProducts = new javax.swing.JPanel();
        btnProduct1 = new javax.swing.JToggleButton();
        btnProduct2 = new javax.swing.JToggleButton();
        btnProduct3 = new javax.swing.JToggleButton();
        btnProduct4 = new javax.swing.JToggleButton();
        btnProduct5 = new javax.swing.JToggleButton();
        btnProduct6 = new javax.swing.JToggleButton();
        btnProduct8 = new javax.swing.JToggleButton();
        btnProduct9 = new javax.swing.JToggleButton();
        btnProduct7 = new javax.swing.JToggleButton();
        scrollPanelProductsTable = new javax.swing.JScrollPane();
        tblLocalOrder = new javax.swing.JTable();
        txtOrderNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSelectedAmount = new javax.swing.JToggleButton();
        btnSelectedProducts = new javax.swing.JToggleButton();
        lblTotalOrder = new javax.swing.JLabel();
        txtTotalOrder = new javax.swing.JTextField();
        btnAdminBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtChangeOrder = new javax.swing.JTextField();
        btnSelectedAdditionalProduct = new javax.swing.JToggleButton();

        dlgAdditionsLocalOrder.setMinimumSize(new java.awt.Dimension(711, 423));
        dlgAdditionsLocalOrder.setModal(true);
        dlgAdditionsLocalOrder.setSize(new java.awt.Dimension(711, 523));
        dlgAdditionsLocalOrder.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dlgAdditionsLocalOrderWindowOpened(evt);
            }
        });

        pblAdditionsLocalOrder.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.red)); // NOI18N

        additionsGroup.add(btnAdditionalProduct2);
        btnAdditionalProduct2.setText("Producto adicional 2");
        btnAdditionalProduct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct2MouseClicked(evt);
            }
        });

        additionsGroup.add(btnAdditionalProduct3);
        btnAdditionalProduct3.setText("Producto adicional 3");
        btnAdditionalProduct3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct3MouseClicked(evt);
            }
        });

        additionsGroup.add(btnAdditionalProduct1);
        btnAdditionalProduct1.setText("Producto adicional 1");
        btnAdditionalProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct1MouseClicked(evt);
            }
        });
        btnAdditionalProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionalProduct1ActionPerformed(evt);
            }
        });

        additionsGroup.add(btnAdditionalProduct6);
        btnAdditionalProduct6.setText("Producto adicional 6");
        btnAdditionalProduct6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct6MouseClicked(evt);
            }
        });

        additionsGroup.add(btnAdditionalProduct4);
        btnAdditionalProduct4.setText("Producto adicional 4");
        btnAdditionalProduct4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct4MouseClicked(evt);
            }
        });

        additionsGroup.add(btnAdditionalProduct5);
        btnAdditionalProduct5.setText("Producto adicional 5");
        btnAdditionalProduct5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdditionalProduct5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pblAdditionsLocalOrderLayout = new javax.swing.GroupLayout(pblAdditionsLocalOrder);
        pblAdditionsLocalOrder.setLayout(pblAdditionsLocalOrderLayout);
        pblAdditionsLocalOrderLayout.setHorizontalGroup(
            pblAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblAdditionsLocalOrderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pblAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pblAdditionsLocalOrderLayout.createSequentialGroup()
                        .addComponent(btnAdditionalProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdditionalProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdditionalProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pblAdditionsLocalOrderLayout.createSequentialGroup()
                        .addComponent(btnAdditionalProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdditionalProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdditionalProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pblAdditionsLocalOrderLayout.setVerticalGroup(
            pblAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblAdditionsLocalOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pblAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdditionalProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdditionalProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdditionalProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pblAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdditionalProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdditionalProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdditionalProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnDlgAdditionsCancel.setText("Cancelar");
        btnDlgAdditionsCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDlgAdditionsCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgAdditionsLocalOrderLayout = new javax.swing.GroupLayout(dlgAdditionsLocalOrder.getContentPane());
        dlgAdditionsLocalOrder.getContentPane().setLayout(dlgAdditionsLocalOrderLayout);
        dlgAdditionsLocalOrderLayout.setHorizontalGroup(
            dlgAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAdditionsLocalOrderLayout.createSequentialGroup()
                .addGroup(dlgAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAdditionsLocalOrderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pblAdditionsLocalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgAdditionsLocalOrderLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnDlgAdditionsCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgAdditionsLocalOrderLayout.setVerticalGroup(
            dlgAdditionsLocalOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAdditionsLocalOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pblAdditionsLocalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDlgAdditionsCancel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo pedido local");
        setMinimumSize(new java.awt.Dimension(1382, 744));
        setSize(new java.awt.Dimension(1382, 744));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.red)); // NOI18N
        pnlAmount.setLayout(null);

        numbersGroup.add(btnNumber6);
        btnNumber6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber6.png"))); // NOI18N
        btnNumber6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber6ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber6);
        btnNumber6.setBounds(270, 110, 100, 80);

        numbersGroup.add(btnNumber2);
        btnNumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber2.png"))); // NOI18N
        btnNumber2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber2ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber2);
        btnNumber2.setBounds(150, 20, 100, 80);

        numbersGroup.add(btnNumber1);
        btnNumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber1.png"))); // NOI18N
        btnNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber1);
        btnNumber1.setBounds(20, 20, 100, 80);

        numbersGroup.add(btnNumber3);
        btnNumber3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber3.png"))); // NOI18N
        btnNumber3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber3ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber3);
        btnNumber3.setBounds(270, 20, 100, 80);

        numbersGroup.add(btnNumber4);
        btnNumber4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber4.png"))); // NOI18N
        btnNumber4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber4ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber4);
        btnNumber4.setBounds(20, 110, 100, 80);

        numbersGroup.add(btnNumber5);
        btnNumber5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber5.png"))); // NOI18N
        btnNumber5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber5ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber5);
        btnNumber5.setBounds(150, 110, 100, 80);

        numbersGroup.add(btnNumber7);
        btnNumber7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber7.png"))); // NOI18N
        btnNumber7.setToolTipText("");
        btnNumber7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber7ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber7);
        btnNumber7.setBounds(20, 200, 100, 80);

        numbersGroup.add(btnNumber8);
        btnNumber8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber8.png"))); // NOI18N
        btnNumber8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber8ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber8);
        btnNumber8.setBounds(150, 200, 100, 80);

        numbersGroup.add(btnNumber9);
        btnNumber9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/numbers/iconNumber9.png"))); // NOI18N
        btnNumber9.setToolTipText("");
        btnNumber9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber9ActionPerformed(evt);
            }
        });
        pnlAmount.add(btnNumber9);
        btnNumber9.setBounds(270, 200, 100, 80);

        btnDoneOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoneOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconBtnDoneOrder.png"))); // NOI18N
        btnDoneOrder.setText("Finalizar");
        btnDoneOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoneOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoneOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneOrderActionPerformed(evt);
            }
        });
        pnlAmount.add(btnDoneOrder);
        btnDoneOrder.setBounds(260, 410, 100, 80);

        btnCorrection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCorrection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconBtnCorrection.png"))); // NOI18N
        btnCorrection.setText("Corregir");
        btnCorrection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCorrection.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCorrection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrectionActionPerformed(evt);
            }
        });
        pnlAmount.add(btnCorrection);
        btnCorrection.setBounds(20, 410, 100, 80);

        btnOtherAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOtherAmount.setText("Otra");
        numbersGroup.add(btnOtherAmount);
        btnOtherAmount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOtherAmount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOtherAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherAmountActionPerformed(evt);
            }
        });
        pnlAmount.add(btnOtherAmount);
        btnOtherAmount.setBounds(20, 300, 100, 80);

        btnAddProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/iconBtnAdd.png"))); // NOI18N
        btnAddProduct.setText("Agregar");
        btnAddProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddProduct.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        pnlAmount.add(btnAddProduct);
        btnAddProduct.setBounds(140, 410, 100, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txtNotes.setColumns(20);
        txtNotes.setLineWrap(true);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pnlAmount.add(jPanel1);
        jPanel1.setBounds(140, 290, 220, 110);

        getContentPane().add(pnlAmount);
        pnlAmount.setBounds(740, 30, 380, 510);

        pnlProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.red)); // NOI18N

        productsGroup.add(btnProduct1);
        btnProduct1.setText("Combo 1");
        btnProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct1ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct2);
        btnProduct2.setText("Combo 2");
        btnProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct2ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct3);
        btnProduct3.setText("Combo 3");
        btnProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct3ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct4);
        btnProduct4.setText("Combo 4");
        btnProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct4ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct5);
        btnProduct5.setText("Combo 5");
        btnProduct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct5ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct6);
        btnProduct6.setText("Adicionales");
        btnProduct6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProduct6MouseClicked(evt);
            }
        });
        btnProduct6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct6ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct8);
        btnProduct8.setText("Producto2");
        btnProduct8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct8ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct9);
        btnProduct9.setText("Producto3");
        btnProduct9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct9ActionPerformed(evt);
            }
        });

        productsGroup.add(btnProduct7);
        btnProduct7.setText("Producto1");
        btnProduct7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduct7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(btnProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductsLayout.createSequentialGroup()
                                .addComponent(btnProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlProducts);
        pnlProducts.setBounds(26, 30, 589, 520);

        tblLocalOrder.setShowVerticalLines(false);
        tblLocalOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLocalOrderMouseClicked(evt);
            }
        });
        scrollPanelProductsTable.setViewportView(tblLocalOrder);

        getContentPane().add(scrollPanelProductsTable);
        scrollPanelProductsTable.setBounds(10, 550, 1240, 210);

        txtOrderNumber.setEditable(false);
        txtOrderNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtOrderNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOrderNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtOrderNumber);
        txtOrderNumber.setBounds(1210, 30, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Número de orden");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1180, 0, 160, 30);

        numbersGroup.add(btnSelectedAmount);
        btnSelectedAmount.setText("Cantidad");
        getContentPane().add(btnSelectedAmount);
        btnSelectedAmount.setBounds(630, 140, 20, 10);

        productsGroup.add(btnSelectedProducts);
        btnSelectedProducts.setText("Productos");
        getContentPane().add(btnSelectedProducts);
        btnSelectedProducts.setBounds(630, 90, 20, 10);

        lblTotalOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalOrder.setText("Total Pedido");
        getContentPane().add(lblTotalOrder);
        lblTotalOrder.setBounds(1150, 400, 170, 50);

        txtTotalOrder.setEditable(false);
        txtTotalOrder.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalOrder.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtTotalOrder);
        txtTotalOrder.setBounds(1150, 450, 170, 50);

        btnAdminBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdminBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        btnAdminBack.setText("Volver");
        btnAdminBack.setBorderPainted(false);
        btnAdminBack.setContentAreaFilled(false);
        btnAdminBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminBack.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdminBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminBack);
        btnAdminBack.setBounds(1240, 640, 120, 120);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Cuánto devolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1150, 260, 170, 40);

        txtChangeOrder.setEditable(false);
        txtChangeOrder.setBackground(new java.awt.Color(255, 255, 255));
        txtChangeOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtChangeOrder.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtChangeOrder);
        txtChangeOrder.setBounds(1150, 310, 170, 50);

        numbersGroup.add(btnSelectedAdditionalProduct);
        btnSelectedAdditionalProduct.setText("Cantidad");
        getContentPane().add(btnSelectedAdditionalProduct);
        btnSelectedAdditionalProduct.setBounds(630, 120, 20, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber6ActionPerformed

    private void btnNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber2ActionPerformed

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed

    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void btnNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber3ActionPerformed

    private void btnNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber4ActionPerformed

    private void btnNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber5ActionPerformed

    private void btnNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber7ActionPerformed

    private void btnNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber8ActionPerformed

    private void btnNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumber9ActionPerformed

    private void btnProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct1ActionPerformed

    }//GEN-LAST:event_btnProduct1ActionPerformed

    private void btnProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct2ActionPerformed

    private void btnProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct3ActionPerformed

    private void btnProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct4ActionPerformed

    private void btnProduct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct5ActionPerformed

    private void btnProduct6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct6ActionPerformed

    }//GEN-LAST:event_btnProduct6ActionPerformed

    private void btnProduct8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct8ActionPerformed

    private void btnProduct9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct9ActionPerformed

    private void btnProduct7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduct7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProduct7ActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        selectProductAndAmount();
        if (!btnProduct6.isSelected()) {
            if (!btnSelectedProducts.isSelected()) {
                if (!btnSelectedAmount.isSelected()) {

                    if (localOrder.insertProduct()) {
                        txtTotalOrder.setText(localOrder.selectTotalOrder(txtOrderNumber.getText()));
                        tblLocalOrder.setModel(localOrder.list(txtOrderNumber.getText()));
                        txtNotes.setText("");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No sé insertó el producto");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione una cantidad");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Por favor seleccione un producto");

            }
        } else if (btnProduct6.isSelected()) {
            if (!btnSelectedAdditionalProduct.isSelected()) {
                if (!btnSelectedAmount.isSelected()) {
                    if (localOrder.insertAdditionalProduct()) {
                        txtTotalOrder.setText(localOrder.selectTotalOrder(txtOrderNumber.getText()));
                        tblLocalOrder.setModel(localOrder.list(txtOrderNumber.getText()));
                        txtNotes.setText("");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No sé insertó el producto");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione una cantidad");
                }
            }

        }

        btnSelectedAmount.setSelected(true);
        btnSelectedProducts.setSelected(true);
        btnSelectedAdditionalProduct.setSelected(true);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadNameProductValues();
        loadAdditionalProductsValues();
        localOrder = new clsDAOLocalOrderDetails();
        txtOrderNumber.setText(localOrder.selectOrderNumber());
        txtTotalOrder.setText("0");
        btnSelectedAmount.setSelected(true);
        btnSelectedProducts.setSelected(true);
        btnSelectedAdditionalProduct.setSelected(true);
        btnSelectedAmount.setVisible(false);
        btnSelectedProducts.setVisible(false);
        btnSelectedAdditionalProduct.setVisible(false);


    }//GEN-LAST:event_formWindowOpened

    private void btnCorrectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrectionActionPerformed
        if (tblLocalOrder.getRowCount() > 0) {
            deleteSelectionState = 1;
            JOptionPane.showMessageDialog(this, "Por favor seleccione la fila del producto que desea eliminar.");
        }

    }//GEN-LAST:event_btnCorrectionActionPerformed

    private void tblLocalOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLocalOrderMouseClicked
        try {
            if (deleteSelectionState == 1) {
                localOrder = new clsDAOLocalOrderDetails();
                String selection = String.valueOf(tblLocalOrder.getValueAt(tblLocalOrder.getSelectedRow(), 0));
                if (JOptionPane.showConfirmDialog(this,
                        "Está seguro que desea eliminar el producto:\n " + (tblLocalOrder.getValueAt(tblLocalOrder.getSelectedRow(), 1)) + "\nCon valor de: " + (tblLocalOrder.getValueAt(tblLocalOrder.getSelectedRow(), 5)), "Eliminar producto",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    localOrder.setLocalOrder_id(selection);
                    localOrder.delete(localOrder.getLocalOrder_id());
                    tblLocalOrder.setModel(localOrder.list(txtOrderNumber.getText()));
                    txtTotalOrder.setText(localOrder.selectTotalOrder(txtOrderNumber.getText()));
                    deleteSelectionState = 0;
                } else {
                    deleteSelectionState = 0;
                }

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_tblLocalOrderMouseClicked
    private void btnOtherAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherAmountActionPerformed

        if (!btnSelectedProducts.isSelected()) {

            btnSelectedAmount.setSelected(true);
            String inputValue = JOptionPane.showInputDialog("Por favor ingrese la cantidad que necesita");
            if (inputValue == null || inputValue.isEmpty() || inputValue == "") {
                JOptionPane.showMessageDialog(this, "Por favor ingrese una cantidad");
            } else {
                double amount = Double.parseDouble(inputValue);
                if (amount > 9) {
                    if (!btnProduct6.isSelected()) {
                        if (btnProduct1.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct1.getText(), amount);
                        } else if (btnProduct2.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct2.getText(), amount);
                        } else if (btnProduct3.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct3.getText(), amount);
                        } else if (btnProduct4.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct4.getText(), amount);
                        } else if (btnProduct5.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct5.getText(), amount);
                        } else if (btnProduct7.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct7.getText(), amount);
                        } else if (btnProduct8.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct8.getText(), amount);
                        } else if (btnProduct9.isSelected()) {
                            loadSetValuesOrderDetails(btnProduct9.getText(), amount);
                        }
                        if (localOrder.insertProduct()) {
                            txtTotalOrder.setText(localOrder.selectTotalOrder(txtOrderNumber.getText()));
                            tblLocalOrder.setModel(localOrder.list(txtOrderNumber.getText()));
                            txtNotes.setText("");

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "No sé insertó el producto");
                        }
                    } else if (btnProduct6.isSelected()) {
                        stateTypeProduct = 1;
                        loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), amount);
                        if (localOrder.insertAdditionalProduct()) {
                            txtTotalOrder.setText(localOrder.selectTotalOrder(txtOrderNumber.getText()));
                            tblLocalOrder.setModel(localOrder.list(txtOrderNumber.getText()));
                            txtNotes.setText("");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "No sé insertó el producto");
                        }

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser igual o mayor a 10");
                }
            }

        }
        btnSelectedAmount.setSelected(true);
        btnSelectedProducts.setSelected(true);
        btnSelectedAdditionalProduct.setSelected(true);
    }//GEN-LAST:event_btnOtherAmountActionPerformed

    private void btnDoneOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneOrderActionPerformed
        if (tblLocalOrder.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this,
                    "Desea confirmar el pedido con número de orden " + txtOrderNumber.getText(), "Confirmar pedido",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                if (localOrder.insertOrderFull(txtOrderNumber.getText(), txtTotalOrder.getText())) {
                    txtOrderNumber.setText(localOrder.incrementOrderNumber());
                    txtTotalOrder.setText("0");

                    clearTable(tblLocalOrder);
                    JOptionPane.showMessageDialog(this, "La orden ha sido procesada con éxito");
                }
            } else {

            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay todavía ningún producto para realizar la compra.");

        }
    }//GEN-LAST:event_btnDoneOrderActionPerformed

    private void btnAdminBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminBackActionPerformed
        if (tblLocalOrder.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this,
                    "Está en la mitad de un pedido, si sale, el pedido será eliminado ¿Está seguro de que quiere salir? ", "Salir y cancelar pedido?",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                localOrder.cancelOrderButtonBack(txtOrderNumber.getText());
                this.setVisible(false);
                clearTable(tblLocalOrder);

            } else {
                this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_btnAdminBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double change = Double.parseDouble(JOptionPane.showInputDialog("Devuelta de cuánto?"));
        double total = Double.parseDouble(txtTotalOrder.getText());
        if (change < total) {
            JOptionPane.showMessageDialog(this, "El valor que ingresó es menor al total del pedido, por favor ingréselo nuevamente");
        } else {
            txtChangeOrder.setText((change - total) + "");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProduct6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProduct6MouseClicked
        dlgAdditionsLocalOrder.setVisible(true);

    }//GEN-LAST:event_btnProduct6MouseClicked

    private void dlgAdditionsLocalOrderWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dlgAdditionsLocalOrderWindowOpened

    }//GEN-LAST:event_dlgAdditionsLocalOrderWindowOpened

    private void btnAdditionalProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct1MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();

    }//GEN-LAST:event_btnAdditionalProduct1MouseClicked

    private void btnAdditionalProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionalProduct1ActionPerformed

    }//GEN-LAST:event_btnAdditionalProduct1ActionPerformed

    private void btnAdditionalProduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct2MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();
    }//GEN-LAST:event_btnAdditionalProduct2MouseClicked

    private void btnAdditionalProduct3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct3MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();
    }//GEN-LAST:event_btnAdditionalProduct3MouseClicked

    private void btnAdditionalProduct4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct4MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();
    }//GEN-LAST:event_btnAdditionalProduct4MouseClicked

    private void btnAdditionalProduct5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct5MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();
    }//GEN-LAST:event_btnAdditionalProduct5MouseClicked

    private void btnAdditionalProduct6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdditionalProduct6MouseClicked
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);
        btnProduct6.isSelected();
    }//GEN-LAST:event_btnAdditionalProduct6MouseClicked

    private void btnDlgAdditionsCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDlgAdditionsCancelActionPerformed
        btnSelectedAdditionalProduct.setSelected(true);
        btnSelectedAmount.setSelected(true);
        btnSelectedProducts.setSelected(true);
        dlgAdditionsLocalOrder.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_btnDlgAdditionsCancelActionPerformed

    public void clearTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }

        table.setModel(dm);
    }

    public void PrintselectProductAndAmount() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("else if(btnProduct" + i + ".isSelected() && btnProduct6.isSelected() && btnNumber" + j + ".isSelected()){\n"
                        + "loadSetValuesOrderDetails(btnAdditionalProduct" + i + ".getText()," + j + ",\"additional\");\n"
                        + "}");

            }
        }
    }

    /**
     * Carga los valores de la clase products con los valores que tienen las
     * cajas de texto del JDialog products
     */
    public void loadSetValuesOrderDetails(String nameP, double amount) {
        try {
            localOrder = new clsDAOLocalOrderDetails();
            localOrder.setProduct_name(nameP);
            localOrder.setProduct_amount(amount);
            localOrder.setNotes(txtNotes.getText());
            ResultSet result;
            if (stateTypeProduct == 0) {
                result = localOrder.searchProductByName();
                if (result != null) {
                    localOrder.setProduct_id(result.getString(1));
                    localOrder.setProduct_description(result.getString(3));
                    localOrder.setProduct_price(Double.parseDouble(result.getString(4)));
                    localOrder.setProduct_price_total(localOrder.getProduct_amount() * localOrder.getProduct_price());
                }

            } else if (stateTypeProduct == 1) {
                result = localOrder.searchAdditionalProductByName();
                if (result != null) {
                    localOrder.setAdditional_products_id(result.getString(1));
                    localOrder.setProduct_description(result.getString(3));
                    localOrder.setProduct_price(Double.parseDouble(result.getString(4)));
                    localOrder.setProduct_price_total(localOrder.getProduct_amount() * localOrder.getProduct_price());
                }
                stateTypeProduct = 0;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public String selectAdditionalProductAndAmount() {

        if (btnAdditionalProduct1.isSelected()) {
            return btnAdditionalProduct1.getText();
        } else if (btnAdditionalProduct2.isSelected()) {
            return btnAdditionalProduct2.getText();
        } else if (btnAdditionalProduct3.isSelected()) {
            return btnAdditionalProduct3.getText();
        } else if (btnAdditionalProduct4.isSelected()) {
            return btnAdditionalProduct4.getText();
        } else if (btnAdditionalProduct5.isSelected()) {
            return btnAdditionalProduct5.getText();
        } else if (btnAdditionalProduct6.isSelected()) {
            return btnAdditionalProduct6.getText();
        } else {
            return "";
        }
    }

    public void selectProductAndAmount() {
        if (btnProduct1.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 1);
        } else if (btnProduct1.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 2);
        } else if (btnProduct1.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 3);
        } else if (btnProduct1.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 4);
        } else if (btnProduct1.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 5);
        } else if (btnProduct1.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 6);
        } else if (btnProduct1.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 7);
        } else if (btnProduct1.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 8);
        } else if (btnProduct1.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct1.getText(), 9);
        } else if (btnProduct2.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 1);
        } else if (btnProduct2.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 2);
        } else if (btnProduct2.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 3);
        } else if (btnProduct2.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 4);
        } else if (btnProduct2.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 5);
        } else if (btnProduct2.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 6);
        } else if (btnProduct2.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 7);
        } else if (btnProduct2.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 8);
        } else if (btnProduct2.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct2.getText(), 9);
        } else if (btnProduct3.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 1);
        } else if (btnProduct3.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 2);
        } else if (btnProduct3.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 3);
        } else if (btnProduct3.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 4);
        } else if (btnProduct3.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 5);
        } else if (btnProduct3.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 6);
        } else if (btnProduct3.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 7);
        } else if (btnProduct3.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 8);
        } else if (btnProduct3.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct3.getText(), 9);
        } else if (btnProduct4.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 1);
        } else if (btnProduct4.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 2);
        } else if (btnProduct4.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 3);
        } else if (btnProduct4.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 4);
        } else if (btnProduct4.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 5);
        } else if (btnProduct4.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 6);
        } else if (btnProduct4.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 7);
        } else if (btnProduct4.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 8);
        } else if (btnProduct4.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct4.getText(), 9);
        } else if (btnProduct5.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 1);
        } else if (btnProduct5.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 2);
        } else if (btnProduct5.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 3);
        } else if (btnProduct5.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 4);
        } else if (btnProduct5.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 5);
        } else if (btnProduct5.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 6);
        } else if (btnProduct5.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 7);
        } else if (btnProduct5.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 8);
        } else if (btnProduct5.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct5.getText(), 9);
        } else if (btnProduct6.isSelected() && btnNumber1.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 1);
        } else if (btnProduct6.isSelected() && btnNumber2.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 2);
        } else if (btnProduct6.isSelected() && btnNumber3.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 3);
        } else if (btnProduct6.isSelected() && btnNumber4.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 4);
        } else if (btnProduct6.isSelected() && btnNumber5.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 5);
        } else if (btnProduct6.isSelected() && btnNumber6.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 6);
        } else if (btnProduct6.isSelected() && btnNumber7.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 7);
        } else if (btnProduct6.isSelected() && btnNumber8.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 8);
        } else if (btnProduct6.isSelected() && btnNumber9.isSelected()) {
            stateTypeProduct = 1;
            loadSetValuesOrderDetails(selectAdditionalProductAndAmount(), 9);
        } else if (btnProduct7.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 1);
        } else if (btnProduct7.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 2);
        } else if (btnProduct7.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 3);
        } else if (btnProduct7.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 4);
        } else if (btnProduct7.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 5);
        } else if (btnProduct7.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 6);
        } else if (btnProduct7.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 7);
        } else if (btnProduct7.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 8);
        } else if (btnProduct7.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct7.getText(), 9);
        } else if (btnProduct8.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 1);
        } else if (btnProduct8.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 2);
        } else if (btnProduct8.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 3);
        } else if (btnProduct8.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 4);
        } else if (btnProduct8.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 5);
        } else if (btnProduct8.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 6);
        } else if (btnProduct8.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 7);
        } else if (btnProduct8.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 8);
        } else if (btnProduct8.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct8.getText(), 9);
        } else if (btnProduct9.isSelected() && btnNumber1.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 1);
        } else if (btnProduct9.isSelected() && btnNumber2.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 2);
        } else if (btnProduct9.isSelected() && btnNumber3.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 3);
        } else if (btnProduct9.isSelected() && btnNumber4.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 4);
        } else if (btnProduct9.isSelected() && btnNumber5.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 5);
        } else if (btnProduct9.isSelected() && btnNumber6.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 6);
        } else if (btnProduct9.isSelected() && btnNumber7.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 7);
        } else if (btnProduct9.isSelected() && btnNumber8.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 8);
        } else if (btnProduct9.isSelected() && btnNumber9.isSelected()) {
            loadSetValuesOrderDetails(btnProduct9.getText(), 9);
        }

    }

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
            java.util.logging.Logger.getLogger(frmLocalOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLocalOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.ButtonGroup actionsGroup;
    private javax.swing.ButtonGroup additionsGroup;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JToggleButton btnAdditionalProduct1;
    private javax.swing.JToggleButton btnAdditionalProduct2;
    private javax.swing.JToggleButton btnAdditionalProduct3;
    private javax.swing.JToggleButton btnAdditionalProduct4;
    private javax.swing.JToggleButton btnAdditionalProduct5;
    private javax.swing.JToggleButton btnAdditionalProduct6;
    private javax.swing.JButton btnAdminBack;
    private javax.swing.JButton btnCorrection;
    private javax.swing.JButton btnDlgAdditionsCancel;
    private javax.swing.JButton btnDoneOrder;
    private javax.swing.JToggleButton btnNumber1;
    private javax.swing.JToggleButton btnNumber2;
    private javax.swing.JToggleButton btnNumber3;
    private javax.swing.JToggleButton btnNumber4;
    private javax.swing.JToggleButton btnNumber5;
    private javax.swing.JToggleButton btnNumber6;
    private javax.swing.JToggleButton btnNumber7;
    private javax.swing.JToggleButton btnNumber8;
    private javax.swing.JToggleButton btnNumber9;
    private javax.swing.JButton btnOtherAmount;
    private javax.swing.JToggleButton btnProduct1;
    private javax.swing.JToggleButton btnProduct2;
    private javax.swing.JToggleButton btnProduct3;
    private javax.swing.JToggleButton btnProduct4;
    private javax.swing.JToggleButton btnProduct5;
    private javax.swing.JToggleButton btnProduct6;
    private javax.swing.JToggleButton btnProduct7;
    private javax.swing.JToggleButton btnProduct8;
    private javax.swing.JToggleButton btnProduct9;
    private javax.swing.JToggleButton btnSelectedAdditionalProduct;
    private javax.swing.JToggleButton btnSelectedAmount;
    private javax.swing.JToggleButton btnSelectedProducts;
    private javax.swing.JDialog dlgAdditionsLocalOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalOrder;
    private javax.swing.ButtonGroup numbersGroup;
    private javax.swing.JPanel pblAdditionsLocalOrder;
    private javax.swing.JPanel pnlAmount;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.ButtonGroup productsGroup;
    private javax.swing.JScrollPane scrollPanelProductsTable;
    private javax.swing.JTable tblLocalOrder;
    private javax.swing.JTextField txtChangeOrder;
    private javax.swing.JTextArea txtNotes;
    public javax.swing.JTextField txtOrderNumber;
    private javax.swing.JTextField txtTotalOrder;
    // End of variables declaration//GEN-END:variables
}
