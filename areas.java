import java.util.Scanner;

public class formas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        double pi = 3.14159;
        double area = pi * radio * radio;
        double perimetro = 2 * pi * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        System.out.println("--- CÁLCULO DEL CUADRADO ---");
System.out.print("Ingrese el lado del cuadrado: ");
double lado = scanner.nextDouble();

double areaCuadrado = lado * lado; 
double perimetroCuadrado = 4 * lado; 

System.out.println("El área del cuadrado es: " + areaCuadrado);
System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
System.out.println();

System.out.println("--- PERÍMETRO DEL TRAPECIO ---");

System.out.print("Ingrese la base mayor: ");
double baseMayor = scanner.nextDouble();

System.out.print("Ingrese la base menor: ");
double baseMenor = scanner.nextDouble();

System.out.print("Ingrese el lado izquierdo: ");
double ladoIzquierdo = scanner.nextDouble();

System.out.print("Ingrese el lado derecho: ");
double ladoDerecho = scanner.nextDouble();

double perimetroTrapecio =
        baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;

System.out.println("El perímetro del trapecio es: " + perimetroTrapecio);
System.out.println();

System.out.println("--- PERÍMETRO DEL TRIÁNGULO ---");

System.out.print("Ingrese el primer lado: ");
double lado1 = scanner.nextDouble();

System.out.print("Ingrese el segundo lado: ");
double lado2 = scanner.nextDouble();

System.out.print("Ingrese el tercer lado: ");
double lado3 = scanner.nextDouble();

double perimetroTriangulo = lado1 + lado2 + lado3;

System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);
System.out.println();
  
     scanner.close();
    }

}