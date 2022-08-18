
package com.company;

public class Main {


    public static void main(String[] args) {

        int[][] a = {
                {1, 0, 3},
                {5, 4, 8},
                {9, 6, 7},

        };
        //  System.out.print(a[0].length);
        moveleft(a,true);
        moveLeftRight(a, true);
        moverigth(a,false);
        moveup(a,true);
        moveright2(a,false);
        moveright2(a,false);







        printa(a);


//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (a[i][j] == 0) {
//                    int[] aa = {i, j};
////                    int row = aa[0];
////                    int column= aa[1];
//                    //  System.out.print(Arrays.toString(aa));
//
//                }
//            }
//        }

    }
    //     WE use this function to print the array
    private static void printa(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
    }
    static void moveup(int[][] arr,boolean isup){
        int []index6=searchsix(arr);
        int row = index6[0];
        int column=index6[1];
        if (isup) {
            if (column == 0) return;
            swap(arr, row, column, row-1, column );


        }else {
            if (column == arr[0].length - 1) return;
            swap(arr,row,column,row,column+1);

        }


    }
    static void moverigth(int[][] arr,boolean isright){
        int []index6=searchsix(arr);
        int row = index6[0];
        int column=index6[1];
        if (isright) {
            if (column == 0) return;
            swap(arr, row, column, row, column - 1);


        }else {
            if (column == arr[0].length - 1) return;
            swap(arr,row,column,row,column+1);

        }


    }
    static void moveleft(int[][] arr,boolean isleft){
        int []index0=searchzero(arr);
        int row = index0[0];
        int column=index0[1];
        if (isleft) {
            if (column == 0) return;
            swap(arr, row, column, row, column - 1);


        }else {
            if (column == arr[0].length - 1) return;
            swap(arr,row,column,row,column+1);

        }






    }
    static void moveright2(int[][] arr,boolean isleft){
        int []index9=search9(arr);
        int row = index9[0];
        int column=index9[1];
        if (isleft) {
            if (column == 0) return;
            swap(arr, row, column, row, column - 1);


        }else {
            if (column == arr[0].length - 1) return;
            swap(arr,row,column,row,column+1);

        }

    }

    private static int[] search9(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 9) {
                    return new int[]{i, j};
                }
            }
        }
        return null;

    }

    private static int[] searchsix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 6) {
                    return new int[]{i, j};
                }
            }
        }
        return null;

    }

    private static int[] searchzero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null;

    }


    static void moveLeftRight(int[][] arr, boolean isLeft) {
        int []index = searchfour(arr);
//        for(int i =0;i<arr.length;i++){
//            for(int j =0;j<arr[0].length;j++){
//                if(arr[i][j]==0){
//                    aa = new int[]{i, j};
//                }
//            }
//        }
        int row = index[0];
        int column = index[1];
        if (isLeft) {
            if (column == 0) return;
            swap(arr,row,column,row,column-1);
//            int temp = arr[row][column];
//            arr[row][column] = arr[row][column - 1];
//            arr[row][column - 1] = temp;
        } else {
            if (column == arr[0].length - 1) return;
            swap(arr,row,column,row,column+1);
//            int temp = arr[row][column];
//            arr[row][column] = arr[row][column + 1];
//            arr[row][column + 1] = temp;
        }

    }

    private static void swap(int[][] arr, int row, int column, int row1, int i) {

        int temp = arr[row][column];
        arr[row][column] = arr[row1][i];
        arr[row1][i] = temp;
    }

    private static int[] searchfour(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 4) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }




}