/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameMenus;

import FrameOptions.RegistrationPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author kcfke
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates a new form loginPage and apply dimensions to set the window in
     * the middle of the screen.
     *
     */
    
    public LoginPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordWarning = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        accessLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        newUsers = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        userWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(new java.awt.Color(255, 102, 102));

        passwordWarning.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        passwordWarning.setForeground(new java.awt.Color(255, 51, 51));

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        accessLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        accessLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accessLabel.setText("USER ACCESS");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordLabel.setText("Password:");

        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFieldKeyReleased(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setText("LOG IN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signupButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signupButton.setText("SIGN UP");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        newUsers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUsers.setText("FOR NEW USERS");

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        userWarning.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        userWarning.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(signupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(userWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(usernameField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(passwordField))))
                .addContainerGap(144, Short.MAX_VALUE))
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(accessLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(passwordLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(passwordWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newUsers)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyReleased
        // Clears the empty username warning
        userWarning.setText("");
    }//GEN-LAST:event_usernameFieldKeyReleased

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        /**
        * These conditions will check if the username or password are empty.
        */
        if (usernameField.getText().trim().isEmpty() && passwordField.getText().trim().isEmpty()) {
            userWarning.setText("Username is invalid");
            passwordWarning.setText("Password is invalid");
        }
        if (usernameField.getText().trim().isEmpty()) {
            userWarning.setText("Username is invalid");
        } else if (passwordField.getText().trim().isEmpty()) {
            passwordWarning.setText("Password is invalid");
        } else {

            try {
                /**
                * Connection to the database.
                */
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
                String sql = "Select * from users where username=? and password=?";

                /**
                * Statement that will receive the query. First we will check if
                * the username exists in the database
                */
                PreparedStatement pst = con.prepareStatement(sql);
                /**
                * Passing username and password parameters.
                */
                pst.setString(1, usernameField.getText());
                pst.setString(2, passwordField.getText());

                /**
                * The Result set will contain the result of the query.
                */
                ResultSet rs = pst.executeQuery();

                /**
                * Condition to check if the user is an admin. Getting the data
                * from the ResultSet, if userAdmin = YES, we will direct the admin
                * to its Menu, if userAdmin = NO, that means it is a regular
                * user, we will direct it to the regular menu
                */
                if (rs.next()) {
                    if (rs.getString("userAdmin").equals("YES")) {

                        String user = rs.getString("username");
                        AdminMenu menu = new AdminMenu(user.substring(0, 1).toUpperCase() + user.substring(1));
                        menu.setVisible(true);
                        dispose();

                    } else {

                        String user = rs.getString("username");
                        MainMenu menu = new MainMenu(user.substring(0, 1).toUpperCase() + user.substring(1));
                        menu.setVisible(true);
                        setVisible(false);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Login Denied");
                    usernameField.setText("");
                    passwordField.setText("");
                }
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
                /**
        * In case of new users. This button will take them to the registration
        * page and dispose of the login page.
        */
        RegistrationPage newUser = new RegistrationPage();
        newUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        /**
        * This event will do the same thing as the login button. It is just a
        * shortcut: instead of clicking, the user can just press ENTER.
        */
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginButtonActionPerformed(null);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        // Clears the empty username warning
        passwordWarning.setText("");
    }//GEN-LAST:event_passwordFieldKeyReleased

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel newUsers;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordWarning;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userWarning;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
