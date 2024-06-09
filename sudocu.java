public class sudocu {
    public static boolean isSafe(int sudocu[][], int row, int col, int digit) {
        // Columan
        for (int i = 0; i <= 8; i++) {
            if (sudocu[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudocu[row][j] == digit) {
                return false;
            }
        }
        //grid:- col/row/3*3
        int sr=(row/3)*3;
        int sc=(col/3)*3;
         // 3*3 grid
         for(int i=sr; i<sr+3; i++ ){
            for(int j=sc; j<sc+3; j++){
                if(sudocu[i][j]==digit){
                    return false;
                }
            }
         }
         return true;

    }
    public static boolean sudocuSolver(int sudocu[][], int row, int col){
        //base case
        if(row==9 ){
            return true;
        }
        //recursion
        int nextRow=row; //row is stay row
        int nextCol=col+1;// col is +1 
        if(col+1==9){ // agr col me value 9 ho jaye to row +1 hota hai
            nextRow=row+1;
            nextCol=0; // initialize with 0 -> mean next grid
        }

        if(sudocu[row][col] != 0){
            return sudocuSolver(sudocu, nextRow, nextCol);
        }

     for(int digit=1; digit<=9; digit++){
        if(isSafe(sudocu, row, col, digit)){
            sudocu[row][col]=digit; //place digit
            if(sudocuSolver(sudocu,nextRow, nextCol)){// if return true => soluution exits
                return true;
            }
            sudocu[row][col]=0; //other wise place 0
        }
     }
     return false;
    }
    public static void printSudocu(int sudocu[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudocu[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudocu[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

                if(sudocuSolver(sudocu, 0 ,0)){
                    System.out.println("Solution exist");
                    printSudocu(sudocu);
                }
                else{
                    System.out.println("solution does not exist");
                }
    }
}
