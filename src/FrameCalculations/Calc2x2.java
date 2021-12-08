/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameCalculations;

import Calculations.TwoByTwo;
import FrameMenus.CalculationMenu;
import FrameOptions.History;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dacsa
 */
public class Calc2x2 extends javax.swing.JFrame {

    /**
     * Creates new form Calc2x2.
     * Set new dimensions and a center position for the window.
     * @username - Variable we used to track and interact with the User.
     */
    public Calc2x2(String username) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        welcomeLabel.setText("Hi, " + username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        clearFieldsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveCalcButton = new javax.swing.JButton();
        varE = new javax.swing.JTextField();
        varB = new javax.swing.JTextField();
        varA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        varF = new javax.swing.JTextField();
        varD = new javax.swing.JTextField();
        history = new javax.swing.JButton();
        varC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelResult = new javax.swing.JLabel();
        varXresult = new javax.swing.JLabel();
        varYresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Hi");

        calculateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        clearFieldsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearFieldsButton.setText("CLEAR");
        clearFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveCalcButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saveCalcButton.setText("SAVE");
        saveCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCalcButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("X +");

        history.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        history.setText("HISTORY");
        history.setAlignmentY(0.0F);
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert the numeric values for the two equations");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Equation 2");

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Equation 1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Y =");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("X +");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("e.g. 5x +(-2)y=2 will be 5x - 2y = 2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("If value of Y is negative, add a minus symbol in front of the value");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Y =");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResult.setText("Result:");

        varXresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varXresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        varXresult.setText("X = ");

        varYresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varYresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        varYresult.setText("Y = ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(varXresult, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(varYresult)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {varXresult, varYresult});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varXresult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varYresult))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {varXresult, varYresult});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(saveCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(history)
                            .addGap(18, 18, 18)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(91, 91, 91))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(varA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(varC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116)))))
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(title)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(varA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(varC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(59, 59, 59)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(33, 33, 33)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(298, 298, 298)
                    .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button will calculate the equations according to input given by the user.
     * @param evt - click.
     */
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        double A, B, C, D, E, F;

        try {

            A = Double.parseDouble(varA.getText());
            B = Double.parseDouble(varB.getText());
            C = Double.parseDouble(varC.getText());
            D = Double.parseDouble(varD.getText());
            E = Double.parseDouble(varE.getText());
            F = Double.parseDouble(varF.getText());
            
            //Verify if the variables are not equal to zero.
            if (A == 0 || B == 0 || C == 0 || D == 0) {
                JOptionPane.showMessageDialog(null, "Values of X and Y CANNOT be 0");
            } else {
                /**
                 * Calling method twoBytwo to solve the equations.
                 * It will pass the variables collected as parameters.
                 */
                double[][] result = TwoByTwo.twoBytwo(A, B, C, D, E, F);
                
                /**
                 * If the Matrix result come back as zero, that means that
                 * the determinant couldn't be calculated.
                 * We will display it to the user.
                 */
                if (result[0][0] == 0 && result[1][0] == 0) {
                    labelResult.setText("Result: indeterminate!");
                    varXresult.setText("X = 0");
                    varYresult.setText("Y = 0");
                } else {
                    /**
                     * If there was a valid result, we will display it.
                     * The results were formatted in a way that if the number
                     * is a decimal, we will display the decimals up to two
                     * numbers after the comma, rounded up. If the number is
                     * integer, we will eliminate the comma and anything after
                     * it.
                     */
                    DecimalFormat df = new DecimalFormat("####0.00");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 1; j++) {
                            Double d = result[i][j];
                            String str = String.valueOf(d).split("\\.")[1];
                            if (i == 0) {
                                if (str.equals("0")) {
                                    varXresult.setText("X = " + d.longValue());
                                } else {
                                    varXresult.setText("X = " + df.format(result[0][0]));
                                }
                            } else if (i == 1) {
                                if (str.equals("0")) {
                                    varYresult.setText("Y = " + d.longValue());
                                } else {
                                    varYresult.setText("Y = " + df.format(result[1][0]));

                                }
                            }

                        }

                    }

                }
            }

        } catch (NumberFormatException e) {
            //In case the user types something that is not a valid number.
            JOptionPane.showMessageDialog(null, "\nOne or more values are not numbers or are missing!\nTry again!");
        }

    }//GEN-LAST:event_calculateButtonActionPerformed

    private void clearFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsButtonActionPerformed
        /**
         * This button clears the fields so the user can start over.
         * There will be two options: To save the result (if there is anything to save),
         * or clear without saving.
         */
        //------------------- Option 1-(Left)----- Option 2-(Right)-------------
        Object[] options = {"Save your result", "Clear without saving"};
        int opt = JOptionPane.showOptionDialog(Calc2x2.this, "What would you like to do?", " You are clearing the fields ",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (opt == JOptionPane.YES_OPTION) {
            //Option Save Results
            saveCalcButtonActionPerformed(null);
        } else {
            //Option clear without saving
            clearVars();
        }
    }//GEN-LAST:event_clearFieldsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        /**
         * Back button will take the user back to the Calculation menu and
         * dispose of the current menu. It will also give the name of the User
         * as a parameter to be used in the greeting label.
         */
        CalculationMenu calcMenu = new CalculationMenu(welcomeLabel.getText().substring(4).trim());
        calcMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCalcButtonActionPerformed
        /**
         * Saving the results of a calculation.
         * We check if there is a result by measuring the size of output 
         * of the result textfield (varYresult).
         */
        if (varXresult.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "\nThere is nothing to save");
        } else {
            double A, B, C, D, E, F;
            int iduser = 0;
            String equation1, equation2;
            String result = varXresult.getText() + "   " + varYresult.getText();
            try {
                    //Converts the input Text to Double
                    A = converter(varA.getText());
                    B = converter(varB.getText());
                    C = converter(varC.getText());
                    D = converter(varD.getText());
                    E = converter(varE.getText());
                    F = converter(varF.getText());

                    //An array Double to receive the numeric values of the input
                    Double[] variables = {A, B,
                                          C, D,
                                          E, F};
                    //An array String to receive the text version of the values
                    String[] formated = new String[6];
                    
                    /**
                     * For loop to check if the variables are decimal or integer.
                     * It will then allocate their text format 
                     * (with or without a comma) in the array.
                     */
                    for (int i = 0; i < 6; i++) {
                        Double d = variables[i];
                        String str = String.valueOf(d).split("\\.")[1];

                        if (str.equals("0")) {
                            formated[i] = " " + d.longValue();
                        } else {
                            formated[i] = " " + variables[i];
                        }
                    }
                    
                    /**
                     * This condition will verify if the numbers are negative or positive.
                     * This will help us to save the correct format of the equation, by
                     * adding a 'minus' symbol instead of the default 'plus'.
                     * 
                     */
                    if (formated[1].contains("-") && formated[3].contains("-")) {
                        equation1 = formated[0] + "x " + formated[1] + "y " + "= " + formated[4];
                        equation2 = formated[2] + "x " + formated[3] + "y " + "= " + formated[5];

                    } else if (formated[1].contains("-") && !formated[3].contains("-")) {
                        equation1 = formated[0] + "x " + formated[1] + "y " + "= " + formated[4];
                        equation2 = formated[2] + "x " + "+" + formated[3] + "y " + "= " + formated[5];

                    } else if (!formated[1].contains("-") && formated[3].contains("-")) {
                        equation1 = formated[0] + "x " + "+" + formated[1] + "y " + "= " + formated[4];
                        equation2 = formated[2] + "x " + formated[3] + "y " + "=" + formated[5];

                    } else {
                        equation1 = formated[0] + "x " + "+" + formated[1] + "y " + "= " + formated[4];
                        equation2 = formated[2] + "x " + "+" + formated[3] + "y " + "= " + formated[5];
                    }

                    try {
                        //Connecting to the database
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
                        //Checking if the calculation has been done before
                        String check = "SELECT * FROM calculator WHERE equation1=? and equation2=? and results=?";
                        PreparedStatement pstCheck = con.prepareStatement(check);

                        pstCheck.setString(1, equation1);
                        pstCheck.setString(2, equation2);
                        pstCheck.setString(3, result);

                        ResultSet rs = pstCheck.executeQuery();
                        
                        //Check if the equation has been saved already.
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "\nEquation already saved!\nCheck your history.");
                            clearVars();
                        } else {
                            //Select the User and store the equations and results
                            String checkUser = "SELECT iduser FROM users WHERE username=?";
                            String addEquation = "INSERT INTO calculator (iduser, equation1, equation2, results) VALUES (?, ?, ?, ?)";

                            PreparedStatement pst = con.prepareStatement(checkUser);

                            pst.setString(1, welcomeLabel.getText().substring(4).trim());

                            rs = pst.executeQuery();

                            if (rs.next()) {
                                //Identifying the user to link the equations to be saved.
                                iduser = rs.getInt("iduser");
                            }

                            pst = con.prepareStatement(addEquation);

                            pst.setInt(1, iduser);
                            pst.setString(2, equation1);
                            pst.setString(3, equation2);
                            pst.setString(4, result);

                            if (pst.executeUpdate() != 0) {
                                JOptionPane.showMessageDialog(null, "\nEquations Saved");
                                clearVars();
                                pst.close();

                            } else {

                                JOptionPane.showMessageDialog(null, "Something went wrong");

                                pst.close();
                                con.close();
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + "\nSaving Not Successful");
                    }
            } catch (NumberFormatException e) {
                //In case the user types something that is not a valid number.
                JOptionPane.showMessageDialog(null, "\nOne or more values are not numbers or are missing!\nTry again!");
            }
        }
    }//GEN-LAST:event_saveCalcButtonActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        /**
         * This button will take the user to its History of calculations.
         * It will also pass the name of the User as a parameter to be used 
         * in the greeting label.
         */
        History newList = new History(welcomeLabel.getText().substring(4).trim());
        newList.setVisible(true);
        dispose();
    }//GEN-LAST:event_historyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    public javax.swing.JButton calculateButton;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelResult;
    private javax.swing.JButton saveCalcButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField varA;
    private javax.swing.JTextField varB;
    private javax.swing.JTextField varC;
    private javax.swing.JTextField varD;
    private javax.swing.JTextField varE;
    private javax.swing.JTextField varF;
    private javax.swing.JLabel varXresult;
    private javax.swing.JLabel varYresult;
    private javax.swing.JLabel warning;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Method cleaVars will clear the fields in the window.
     * Also reseting X, Y and the Result label.
     */
private void clearVars() {
        varA.setText("");
        varB.setText("");
        varC.setText("");
        varD.setText("");
        varE.setText("");
        varF.setText("");
        varXresult.setText("X = ");
        varYresult.setText("Y = ");
        labelResult.setText("Result:");

    }
    /**
     * This method will convert the Text input into Double.
     * @param x - the value input by the user.
     * @return - the number converted.
     */
    private Double converter(String x) {
        return (x == null || x.isEmpty()) ? 0 : Double.parseDouble(x);
    }
 }
