/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author kcfke
 */
public class Utilities {

     /**
     * This method will populate the tables in the ListOfUsers, History and
     * HistoryOfAllUsers frames.
     * @param table
     * @param Query
     * This code was adapted from a post from Airy, on 08 April 2013
     * to a forum discussion on StackOverflow web site, available here:
     * https://stackoverflow.com/questions/10620448/most-simple-code-to-populate-jtable-from-resultset
     */
    public static void FillTable(JTable table, String Query) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EquationsCalculator", "root", "root");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(Query);
            
            //To remove previously added rows
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
            }

            rs.close();
            stat.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Something went wrong!", JOptionPane.ERROR_MESSAGE);
        }

    }
     /**
     * Method to resize the width of the columns
     * @param table - The table to be resized.
     * @param tablePreferredWidth - The total preferred width.
     * @param percentages - Percentages for each column to resize.
     * This code was retrieved from an article from Nam Ha Minh, on 06 July 2019
     * to CodeJava web site, available here:
     * https://www.codejava.net/java-se/swing/setting-column-width-and-row-height-for-jtable
     */
    public static void setColumnsWidth(JTable table, int tablePreferredWidth,
        double... percentages) {
    double total = 0;
    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
        total += percentages[i];
    }
 
    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
        TableColumn column = table.getColumnModel().getColumn(i);
        column.setPreferredWidth((int)
                (tablePreferredWidth * (percentages[i] / total)));
    }
}

        /**
        * Method to format the input into the equations display.
        *
        * @param variables - the array of input variables.
        * @return - an array of formated strings.
        * 
        * /**************************************************************************************************
        * This code was based on a post from Vishnu Suresh, on 10 July 2017
        * to a forum discussion on StackOverflow web site, available here:
        * https://stackoverflow.com/questions/10620448/most-simple-code-to-populate-jtable-from-resultset
        * and from Santiago, on 13 March 2012, available here:
        * https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
        */
    public static String[] formated(Double[] variables) {

        //An array String to receive the text version of the values
        String[] formated = new String[variables.length];

        /**
         * For loop to check if the variables are decimal or integer. It will
         * then allocate their text format (with or without a comma) in the
         * array.
         */
        for (int i = 0; i < variables.length; i++) {
            Double d = variables[i];
            String str = String.valueOf(d).split("\\.")[1];

            if (str.equals("0")) {
                formated[i] = " " + d.longValue();
            } else {
                formated[i] = " " + variables[i];
            }
        }
        return formated;
    }
    
   
}
