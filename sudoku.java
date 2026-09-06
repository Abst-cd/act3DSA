public class sudoku{

   int[][] tablero = new int[9][9]; //tablero de sudoku 9x9

   public static boolean sudokuR(int[][] tablero){

    for(int i=0; i< tablero.length; i++){ //recorremos filas y columnas del tablero
        for(int  j=0; j< tablero[i].length; j++){

            if(tablero[i][j] == 0 ){ //si si hay cajas vacias, se hace algo para resolverlo
                for(int actual = 1; actual <=9; actual++){ //numero actual que decidimos meter
                  if(Sirve(tablero, i, j, actual)){
                    tablero[i][j] = actual;

                    if(sudokuR(tablero)){
                        return true;
                    }

                    tablero[i][j] = 0;

                  }
            } 
            return false; //backtracking por si no funciono las decisiones anteriores

        }
    } 
   } 

    return true;
    
}

public static boolean Sirve(int tablero[][], int i, int j, int actual){
 

        for (int k = 0; k < tablero[i].length; k++) { //recorrer filas con variable "temporal" k
                        if (tablero[i][k] == actual) {
                            return false;
                    }
                }

        for(int k=0; k < tablero.length; k++){
            if(tablero[k][j] == actual){
                return false;
            }
        }

        //inicio fila y columna para saber en donde empieza los cuadros 3x3
        int inicioFila = (i / 3) * 3;
        int inicioColumna = (j / 3) * 3;

        for(int fila = inicioFila; fila < inicioFila + 3; fila++ ){ //+3 por posiciones del cuadro 3x3
            for (int col = inicioColumna; col < inicioColumna + 3; col++){
                if(tablero[fila][col] == actual){//si el numero que tenemos ya esta en esa posicion
                    return false;//regresamos false
                }
            }
        }


        return true;
        
      }
}
