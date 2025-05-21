package com.matrix.operations.team1;

import com.matrix.core.Matrix;

public class TransposeOperation {
    /**
     * Transpose a matrix
     * @param matrix input matrix
     * @return transposed matrix
     */
    public Matrix transpose(Matrix matrix) {
        // Implementation here
        int newCols = Matrix.getRows();
        int newRows = Matrix.getColumns();

        MatrixImpl transposedMatrix = new MatrixImpl(newRows, newCols);

        for (int i=0; i<newRows; i++){
            for (int j = 0; j < newCols; j++){
                transposedMatrix.set(i,j, Matrix.get(j,i));
            }
        }

        return transposedMatrix;
    }
}
