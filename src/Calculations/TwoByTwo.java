/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import static java.lang.Double.POSITIVE_INFINITY;
import javax.swing.JOptionPane;

/**
 *
 * @author Douglas
 */
public class TwoByTwo {

    /**
     * Method to calculate the result of simultaneous equations using properties
     * of matrices. This is the 2x2 version and will receive 6 values: 4 values
     * for variables x and y, and 2 values for the results. 
     * .: Ax + By = E / Cx +Dy = F
     *
     * @param A - variable x of the first equation
     * @param B - variable y of the first equation
     * @param C - variable x of the second equation
     * @param D - variable y of the second equation
     * @param E - result of the first equation
     * @param F - result of the second equation
     * @return - a 2D array that represents a matrix result size 2x1
     */
    public static double[][] twoBytwo(double A, double B,
                                      double C, double D,
                                      double E, double F) {

        /**
         * The formula we are going to work with is: X = (A^-1)*B. In our
         * program they will be represented by: 
         * matrixX = (1/det*matrxiASwapped)*(matrixB)
         */

// Variables of the Equation ---------------------------------------------------
        
        //X = the matrix result that will be returned
        double[][] matrixX = new double[2][1];

        //det = Determinant
        double det = (A * D) - (B * C);

        //matrixASwapped = Matrix A with the elements already swapped
        double[][] matrixASwapped = new double[2][2];
        matrixASwapped[0][0] = D;
        matrixASwapped[1][1] = A;
        matrixASwapped[0][1] = B * (-1);
        matrixASwapped[1][0] = C * (-1);

        //matrixB = the result of the equations that the user provided
        double[][] matrixB = new double[2][1];
        matrixB[0][0] = E;
        matrixB[1][0] = F;

//------------------------------------------------------------------------------
       
        /**
         * MatrixASwapped multiplied by MatrixB = (A*B).
         *
         * @sum: is the result of the multiplication of the elements of the
         * matrices added to each other.
         */
        double[][] matrixAB = new double[2][1];
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 2; k++) {
                    sum = sum + matrixASwapped[i][k] * matrixB[k][j];
                }
                matrixAB[i][j] = sum;
                sum = 0;
            }
        }
        /**
         * Condition to check if the determinant is equal to zero. If so the
         * program will stop and show a message, otherwise it will compute the
         * rest of the equation.
         */
        if (det == 0) {
            matrixX[0][0] = POSITIVE_INFINITY;
            matrixX[1][0] = POSITIVE_INFINITY;
            JOptionPane.showMessageDialog(null, "Determinant is equal to zero!", 
                   "Equation cannot be computed!", JOptionPane.WARNING_MESSAGE);
        } else {
            //Matrix X will receive the values of 1/det*(matrixASwapped*matrixB)
            matrixX[0][0] = (1 / det) * matrixAB[0][0];
            matrixX[1][0] = (1 / det) * matrixAB[1][0];
        }
        //The result will be returned to Calc2x2 to be displayed to the user.
        return matrixX;
    }

}
