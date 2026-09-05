public class fib {
    

    public static int fibonacci(int n){
        // si n es menor o igual a 1 (no se puede por que si no no da la secuencia) regresa n
        if(n<=1){
            return n;
        }
        return fibonacci(n -1 ) + fibonacci(n-2);//recursiva, suma el numero anterior y el otro numero anterior
    }


}
