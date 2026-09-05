public class SubsetSum {

    public static boolean subsetSuma(int numeroBuscar, int posicion){
    int[] conjuntosuma = {1, 5,6,7,3}; //meter numoros random al conjunto

        if(numeroBuscar == 0){ 
            return true;
        }

        if(posicion >= conjuntosuma.length){
        return false;            
        } 

        return subsetSuma(numeroBuscar - conjuntosuma[posicion], posicion + 1) || subsetSuma(numeroBuscar, posicion + 1) ;
        }

        

  
    } 



