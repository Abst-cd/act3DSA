import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class mainSudoku {
    public static void main(String[] args) throws IOException{

        String filePath = "sudoku.txt";


        int[][] tablero = new int[9][9];
          try (BufferedReader entrada = new BufferedReader(new FileReader(filePath))) {
            String line;
            int fila = 0;
            
            // readLine() returns null when the end of the file is reached
            while ((line = entrada.readLine()) != null & fila < 9) {
                line = line.trim();
                if(line.isEmpty()) continue;
                for (int columna = 0; columna < 9; columna++) {
                    char caracter = line.charAt(columna);
                    
                    tablero[fila][columna] = Character.getNumericValue(caracter);
                }
                fila++; 
            }

            
        if (sudoku.sudokuR(tablero)) {
            System.out.println("Sudoku resuelto:");

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");//probarlo
                }
                System.out.println();
            }
        }    
            
        
       }
}
}