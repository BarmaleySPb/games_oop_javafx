package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        return checkHorizontal(board) || checkVertical(board);
    }

    public static int findOfIndexWithOne(int [][] board) {
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                index = i;
            }
        }
        return index;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean result = true;
        int index = findOfIndexWithOne(board);
        for (int i = 0; i < board.length; i++) {
            if (board[index][i] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board) {
        boolean result = true;
        int index = findOfIndexWithOne(board);
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
