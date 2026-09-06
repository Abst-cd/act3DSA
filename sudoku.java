public class sudoku{

   int[][] tablero = new int[4][4];

   public static boolean sudokuR(int[][] tablero){

    for(int i=0; i< tablero.length; i++){ //recorremos filas y columnas del tablero
        for(int  j=0; j< tablero[i].length; j++){

            if(tablero[i][j] == 0 ){ //si si hay cajas vacias, se hace algo para resolverlo
                for(int actual = 1; actual <=4; actual++){ //numero actual que decidimos meter
                    for (int k = 0; k < tablero[i].length; k++) {
                        if (tablero[i][k] == actual) {
                            return false;
    }
                }

            } 

        }
    } 
    return true;
   } 

      public boolean Sirve(tablero, i, j, actual){

      }


}
