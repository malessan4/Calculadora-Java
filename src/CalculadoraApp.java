import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("****Aplicación Calculadora****");
        //Mostramoes el menu
        //System.out.println("1. Suma \n2. Resta \n3.Multiplicacion");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);

        System.out.print("Proporciona valor operando1: ");
        Scanner consola = new Scanner(System.in);
        var operando1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Integer.parseInt(consola.nextLine());
        var resultado = operando1 + operando2;
        System.out.println("Resultado: " + resultado);

    }
}
