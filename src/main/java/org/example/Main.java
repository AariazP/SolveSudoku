package org.example;

public class Main {
    public static void main(String[] args) {

        int[][] sudoku = {
            {2, 0, 0,    0, 7, 4,   8, 0, 0},
            {0, 9, 0,    2, 0, 0,   0, 5, 0},
            {0, 0, 6,    0, 9, 0,   0, 0, 1},

            {0, 1, 0,   4, 0, 8,    0, 0, 2},
            {3, 0, 0,   0, 6, 0,    1, 8, 0},
            {0, 0, 2,   0, 0, 9,    0, 0, 4},

            {0, 0, 4,   0, 0, 0,    0, 9, 6},
            {0, 7, 0,   0, 0, 0,    0, 0, 0},
            {0, 0, 8,   5, 1, 6,    7, 0, 0}
        };


        SudokuSolver s = new SudokuSolver(sudoku);
        boolean solu = s.solve();
        System.out.println("solu = " + solu);
        s.print();
    }




}