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
 * @author dacsa
 */
public class ThreeByThree {

    /**
     * Method to calculate the result of simultaneous equations using properties
     * of matrices. This is the 3x3 version and will receive 12 values: 9 values
     * for variables x, y and z, and 3 values for the results. 
     * .: Ax + By + Cz = J / Dx + Ey + Fz = K / Gx + Hy + Iz = L
     *
     * @param A - variable x of the first equation
     * @param B - variable Y of the first equation
     * @param C - variable Z of the first equation
     * @param D - variable x of the second equation
     * @param E - variable Y of the second equation
     * @param F - variable Z of the second equation
     * @param G - variable x of the third equation
     * @param H - variable Y of the third equation
     * @param I - variable Z of the third equation
     * @param J - result of the first equation
     * @param K - result of the second equation
     * @param L - result of the third equation
     * @return - a 2D array that represents a matrix result size 3x1
     */
    public static double[][] threeBythree(double A, double B, double C,
                                          double D, double E, double F,
                                          double G, double H, double I,
                                          double J, double K, double L) {
        /**
         * The formula we are going to work with is: X = (A^-1)*B. In our
         * program they will be represented by: matrixX =
         * (1/det*CofactorMatrix)*(matrixB) obs: the variable 'CofactorMatrix'
         * is not going to be transposed before multiplying (1/det), instead the
         * variable 'cofactorTransposeDet' will receive the result of this
         * multiplication and the transposition at the same time, to optimize
         * the code.
         *
         */
// Variables of the Equation ---------------------------------------------------

        //X = the matrix result that will be returned
        double[][] matrixX = new double[3][1];

        //det = determinant; 
        double det = 0;

        //Matrix A = made by the variables of each equation.
        double[][] matrixA = new double[3][3];
        matrixA[0][0] = A;
        matrixA[0][1] = B;
        matrixA[0][2] = C;

        matrixA[1][0] = D;
        matrixA[1][1] = E;
        matrixA[1][2] = F;

        matrixA[2][0] = G;
        matrixA[2][1] = H;
        matrixA[2][2] = I;

        //Matrix B = the result of the equations that the user provided
        double[][] matrixB = new double[3][1];
        matrixB[0][0] = J;
        matrixB[1][0] = K;
        matrixB[2][0] = L;
            
//------------------------------------------------------------------------------
        /**
         * CofactorMatrix. It's the matrix of the determinants of each element
         * of Matrix A. Here we executed the calculations and applied the signs
         * to the elements.
         */
        double[][] CofactorMatrix = new double[3][3];

        CofactorMatrix[0][0] = matrixA[1][1] * matrixA[2][2] - matrixA[1][2] * matrixA[2][1];
        CofactorMatrix[0][1] = (matrixA[1][0] * matrixA[2][2] - matrixA[1][2] * matrixA[2][0]) * -1;
        CofactorMatrix[0][2] = matrixA[1][0] * matrixA[2][1] - matrixA[1][1] * matrixA[2][0];

        CofactorMatrix[1][0] = (matrixA[0][1] * matrixA[2][2] - matrixA[0][2] * matrixA[2][1]) * -1;
        CofactorMatrix[1][1] = matrixA[0][0] * matrixA[2][2] - matrixA[0][2] * matrixA[2][0];
        CofactorMatrix[1][2] = (matrixA[0][0] * matrixA[2][1] - matrixA[0][1] * matrixA[2][0]) * -1;

        CofactorMatrix[2][0] = matrixA[0][1] * matrixA[1][2] - matrixA[0][2] * matrixA[1][1];
        CofactorMatrix[2][1] = (matrixA[0][0] * matrixA[1][2] - matrixA[0][2] * matrixA[1][0]) * -1;
        CofactorMatrix[2][2] = matrixA[0][0] * matrixA[1][1] - matrixA[0][1] * matrixA[1][0];

        /**
         * Determinant Calculation. Multiplying any row from Matrix A by any of
         * the CofactorMatrix. In this case, the first row.
         */
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                det = det + matrixA[i][j] * CofactorMatrix[i][j];
            }
        }

        /**
         * cofactorTransposeDet is a personal choice to minimize code and
         * computing time. In this variable we will do two steps in one:
         * Transposing the Cofactor Matrix and multiplying by the Determinant at
         * the same time.
         */
        double[][] cofactorTransposeDet = new double[3][3];

        //Check if the determinant is equal to zero.
        /**
         * If so.
         * The result Java gives is INFINITY. We decided to pass this value
         * as return to identify and display the output accordingly.
         */
        if (det == 0) {
            matrixX[0][0] = POSITIVE_INFINITY;
            matrixX[1][0] = POSITIVE_INFINITY;
            matrixX[2][0] = POSITIVE_INFINITY;
            JOptionPane.showMessageDialog(null, "Determinant is equal to zero!", 
                   "Equation cannot be computed!", JOptionPane.WARNING_MESSAGE);
        /**
         * If not.
         * We proceed with the calculations normally.
         */
        } else {

            cofactorTransposeDet[0][0] = CofactorMatrix[0][0] * (1 / det);
            cofactorTransposeDet[1][0] = CofactorMatrix[0][1] * (1 / det);
            cofactorTransposeDet[2][0] = CofactorMatrix[0][2] * (1 / det);

            cofactorTransposeDet[0][1] = CofactorMatrix[1][0] * (1 / det);
            cofactorTransposeDet[1][1] = CofactorMatrix[1][1] * (1 / det);
            cofactorTransposeDet[2][1] = CofactorMatrix[1][2] * (1 / det);

            cofactorTransposeDet[0][2] = CofactorMatrix[2][0] * (1 / det);
            cofactorTransposeDet[1][2] = CofactorMatrix[2][1] * (1 / det);
            cofactorTransposeDet[2][2] = CofactorMatrix[2][2] * (1 / det);
            
            /**
             * MatrixX is the result Matrix. It will receive the last part of
             * the calculation: (1/det*Cofactor Transpose Matrix) * Matrix B;
             * The result will be a Matrix 3x1: x, y, and z.
             */
            double sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1; j++) {
                    for (int k = 0; k < 3; k++) {
                        sum = sum + cofactorTransposeDet[i][k] * matrixB[k][j];
                    }
                    matrixX[i][j] = sum;
                    sum = 0;
                }
            }             
        }

        //The result will be returned to Calc3x3 to be displayed to the user.
        return matrixX;
    }

}
