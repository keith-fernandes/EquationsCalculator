/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameOptions;

import FrameMenus.AdminMenu;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dacsa
 */
public class EditAdminInfo extends javax.swing.JFrame {

    /**
     * Creates new form EditAdminInfo - and apply dimensions to set the window
     * in the middle of the screen
     *
     * @param admin - name of the current connected Admin for greeting and
     * tracking purposes
     */
    public EditAdminInfo(String admin) {
        initComponents();
        this.setLocationRelativeTo(null);
        welcomeLabel.setText("Hi, " + admin);
        Image icon = Toolkit.getDefaultToolkit().getImage("DK2.png");
        this.setIconImage(icon);
        /**
         * This piece of code will populate the fields with place holders.
         * Getting the users information and allowing them to change only what
         * they want.
         */
        try {
            //Connecting to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EquationsCalculator", "root", "root");
            String check = "Select * from users where username=?";

            PreparedStatement pstCheck = con.prepareStatement(check);

            pstCheck.setString(1, welcomeLabel.getText().substring(4).trim());

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                String lastname = rs.getString("lastname").substring(0, 1).toUpperCase() + rs.getString("lastname").substring(1);
                String firstname = rs.getString("firstname").substring(0, 1).toUpperCase() + rs.getString("firstname").substring(1);
                String usernameS = rs.getString("username");

                firstNameField.setText(firstname);
                firstNameField.setForeground(Color.gray);
                lastNameField.setText(lastname);
                lastNameField.setForeground(Color.gray);
                usernameField.setText(usernameS);
                usernameField.setForeground(Color.gray);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Something went wrong!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        mainMenuLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backRegister = new javax.swing.JButton();
        warningRegistration = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        saveRegister = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Details Update");

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Username:");

        mainMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuLabel.setText("EDIT YOUR INFORMATION");

        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        backRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backRegister.setText("BACK");
        backRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRegisterActionPerformed(evt);
            }
        });

        warningRegistration.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        warningRegistration.setForeground(new java.awt.Color(255, 51, 51));
        warningRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        saveRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saveRegister.setText("SAVE");
        saveRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRegisterActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Hi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)
                        .addComponent(backRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameField))
                    .addComponent(warningRegistration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenuLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(warningRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRegisterActionPerformed
        /**
         * Back button will take the admin back to its menu and dispose of the
         * Edition menu. It will also give the name of the Admin as a parameter
         * to be used in the greeting label.
         */
        AdminMenu menu = new AdminMenu(welcomeLabel.getText().substring(4).trim());
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backRegisterActionPerformed

    private void saveRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRegisterActionPerformed

        /**
         * This button will save the new data typed. When the user clicks SAVE,
         * a pop up to confirm or cancel will appear.
         */
        Object[] options = {"SAVE", "CANCEL"};
        int opt = JOptionPane.showOptionDialog(EditAdminInfo.this, "Do you want to save your new details?",
                " Admin Updating Profile ",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        //Option 'CANCEL' takes the user back to editing.
        if (opt == JOptionPane.NO_OPTION) {
            this.setVisible(true);
            //Option 'SAVE' will run the saving code.
        } else {

            //Getting the data typed and inputting into variables.       
            String name = firstNameField.getText().trim();
            String lastname = lastNameField.getText().trim();
            String username = usernameField.getText().trim();
            String password = passwordField.getText().trim();
            String currentUser = welcomeLabel.getText().substring(4).trim().substring(0, 1).toLowerCase() + welcomeLabel.getText().substring(5).trim();

            //This condition will verify if any of the fields are empty.
            if (name.isEmpty() || lastname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                warningRegistration.setText("All fields are required, please complete your details.");
            } else {

                try {
                    //Connecting to the database
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EquationsCalculator", "root", "root");
                    String check = "Select * from users where username=?";
                    /**
                     * Statement that will receive the query. First we will
                     * check if the admin's username already exists in the
                     * database
                     */
                    PreparedStatement pstCheck = con.prepareStatement(check);

                    pstCheck.setString(1, username);

                    ResultSet rs = pstCheck.executeQuery();

                    if (rs.next()) {
                        /**
                         * If it already exists. We'll check if the admin is
                         * trying to save the same username they have.If not,
                         * the username is already taken and cannot be used.
                         */
                        if (!username.equals(currentUser)) {
                            JOptionPane.showMessageDialog(null, "Username already taken", "Failed", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (password.length() < 6) {
                                JOptionPane.showMessageDialog(null, "Password MUST be at least 6 characters long",
                                        "Password too short", JOptionPane.WARNING_MESSAGE);
                                this.setVisible(true);
                                passwordField.setText("");
                                passwordField.requestFocus();
                            } else {
                                /**
                                 * If so. We will prepare another query, this
                                 * time to update the new info (except for the
                                 * username).
                                 */
                                String add = "update users set password=?, firstname=?, lastname=? where username=?";

                                PreparedStatement pstAdd = con.prepareStatement(add);

                                /**
                                 * Passing the variables with the new info. --
                                 * Name and Lastname were also set to have a
                                 * first letter uppercase. -- Used the username
                                 * in the greeting label as a parameter to find
                                 * the current username in the database.
                                 */
                                pstAdd.setString(1, password);
                                pstAdd.setString(2, name.substring(0, 1).toUpperCase() + name.substring(1));
                                pstAdd.setString(3, lastname.substring(0, 1).toUpperCase() + lastname.substring(1));
                                pstAdd.setString(4, currentUser);

                                pstAdd.execute();

                                JOptionPane.showMessageDialog(null, "You kept your current Username.",
                                        "Details Successfully Updated", JOptionPane.INFORMATION_MESSAGE);
                                /**
                                 * This will take the User back to its Menu
                                 * after editing its info. -- It will also pass
                                 * the username, with first letter uppercase, as
                                 * parameter to be used in the greeting label
                                 * and for tracking the current user
                                 */
                                AdminMenu menu = new AdminMenu(username.substring(0, 1).toUpperCase() + username.substring(1));
                                menu.setVisible(true);
                                setVisible(false);

                                pstAdd.close();
                                con.close();
                            }
                        }
                    } else {
                        //Check the size of the password
                        if (password.length() < 6) {
                            JOptionPane.showMessageDialog(null, "Password MUST be at least 6 characters long",
                                    "Password too short", JOptionPane.WARNING_MESSAGE);
                            this.setVisible(true);
                            passwordField.setText("");
                            passwordField.requestFocus();
                        } else {
                            /**
                             * If the username is different than the current
                             * one. We will proceed with the updating normally.
                             */
                            String add = "update users set username=?, password=?, firstname=?, lastname=? where username=?";

                            PreparedStatement pstAdd = con.prepareStatement(add);

                            /**
                             * Passing the variables with the new info. -- Name
                             * and Lastname were also set to have a first letter
                             * uppercase. -- Used the username in the greeting
                             * label as a parameter to find the current username
                             * in the database.
                             */
                            pstAdd.setString(1, username);
                            pstAdd.setString(2, password);
                            pstAdd.setString(3, name.substring(0, 1).toUpperCase() + name.substring(1));
                            pstAdd.setString(4, lastname.substring(0, 1).toUpperCase() + lastname.substring(1));
                            pstAdd.setString(5, currentUser);

                            pstAdd.execute();

                            JOptionPane.showMessageDialog(null, "'" + currentUser + "'" + "   is now   " + "'" + username + "'",
                                    "Details Successfully Updated!", JOptionPane.INFORMATION_MESSAGE);
                            /**
                             * This will take the User back to its Menu after
                             * editing its info. -- It will also pass the
                             * username, with first letter uppercase, as
                             * parameter to be used in the greeting label and
                             * for tracking the current user
                             */
                            AdminMenu menu = new AdminMenu(username.substring(0, 1).toUpperCase() + username.substring(1));
                            menu.setVisible(true);
                            setVisible(false);

                            pstAdd.close();
                            con.close();

                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Update Not Successful\n", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_saveRegisterActionPerformed

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        firstNameField.setForeground(Color.gray);
        lastNameField.setForeground(Color.gray);
        usernameField.setForeground(Color.gray);
    }//GEN-LAST:event_usernameFieldFocusLost

    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        firstNameField.setForeground(Color.black);

    }//GEN-LAST:event_firstNameFieldFocusGained

    private void lastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFieldFocusGained
        lastNameField.setForeground(Color.black);

    }//GEN-LAST:event_lastNameFieldFocusGained

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameField.setForeground(Color.black);
    }//GEN-LAST:event_usernameFieldFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backRegister;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton saveRegister;
    private javax.swing.JLabel title;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningRegistration;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
