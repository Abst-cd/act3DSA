public class SubsetSum {

    public static boolean subsetSuma(int numeroBuscar, int posicion){//boolean para probar si si se puede
        //o no llegar a una sumatoria
    int[] conjuntosuma = {1, 5,6,7,3}; //meter numoros random al conjunto

        if(numeroBuscar == 0){ 
            return true;
        }
        if(posicion >= conjuntosuma.length){
        return false;            
        } 
        // primer caso si es el numero que se va a usar, si si se va a usar, se le resta al 
        //numero que estamos buscando
        // si no se va a usar, solamente recorremos la posicion del conjunto
        return subsetSuma(numeroBuscar - conjuntosuma[posicion], posicion + 1) || subsetSuma(numeroBuscar, posicion + 1) ;
        }

        

  
    } 



