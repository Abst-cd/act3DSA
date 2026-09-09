import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mainFib{

    public static void main(String[] args) throws IOException {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ingresa la posicion:");
    int n = Integer.parseInt(entrada.readLine());
    System.out.println("Fibonacci(" + n + ") = " + fib.fibonacci(n));        

}
    }
