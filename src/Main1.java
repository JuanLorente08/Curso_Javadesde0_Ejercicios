import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        /*
        // Ejercicio 1
        var sc = new Scanner(System.in);
        System.out.print("Introduce el costo de fabricación del portatil: ");
        double costofabricacion = sc.nextDouble();

        double margenganacia = 0.3;
        double impuestos = 0.21;

        double costeconganacia = costofabricacion + costofabricacion * margenganacia;
        double impuestosaplicados = costeconganacia * impuestos;
        double preciofinal = costeconganacia + impuestosaplicados;

        System.out.print("El precio final del portatil es: ");
        System.out.println(preciofinal);

        if (preciofinal <= 600){
            System.out.println("Normal");
        } else {
            System.out.println("De lujo");
        }
        sc.close();


        //Ejercicio 2 (Se podria hacer tanto con double como con int)
        var sc = new Scanner(System.in);
        System.out.print("Introduce la nota del 1º trimestre: ");
        int nota1 = sc.nextInt();
        System.out.print("Introduce la nota del 2º trimestre: ");
        int nota2 = sc.nextInt();
        System.out.print("Introduce la nota del 3º trimestre: ");
        int nota3 = sc.nextInt();

        int notamedia = (nota1 + nota2 + nota3)/3;
        int notaredodndeada = Math.round(notamedia);

        System.out.print("La nota del alumno sin redondear es: ");
        System.out.println(notamedia);

        System.out.print("La nota del alumno redondeada es: ");
        System.out.println(notaredodndeada);

        if (notamedia >= 5){
            System.out.println("El alumno esta aprobado");
        } else {
            System.out.println("El alumno esta suspenso");
        }


        //Ejercicio 3 (calcular el areal y el perimetro)
        var sc = new Scanner(System.in);
        System.out.print("Introduce la altura del triangulo: ");
        double h = sc.nextDouble();
        System.out.print("Introcude la base del triangulo: ");
        double b = sc.nextDouble();

        double area = (h * b)/2;
        System.out.print("El area del triangulo es: ");
        System.out.println(area);

        double b2 = b / 2;
        double a = Math.sqrt(Math.pow(b2,2) + Math.pow(h,2));
        double perimetro = (a*2) + b;
        System.out.print("El perimetro del triangulo es: ");
        System.out.println(perimetro);



        //Ejercicio 4 (calcular el area y el perimetro de un circulo)
        var sc = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo: ");
        double r = sc.nextDouble();
        Double Pi = Math.PI;

        double a = Pi * (r * r);
        System.out.print("El area del circulo es: ");
        System.out.println(a);

        double p = 2 * Pi * r;
        System.out.print("El perimetro del circulo es: ");
        System.out.println(p);


        //Ejercicio 5
        var sc = new Scanner(System.in);
        System.out.print("Introduce el dinero en €: ");
        double euros = sc.nextDouble();
        System.out.print("Introduce el valor de cambio: ");
        double cambio = sc.nextDouble();
        double dolares = euros/cambio;
        System.out.println(euros +"€" + " son " + dolares + "$");


        // Ejercicio 6
        var sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }

        // Ejercicio 7
        var sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es " + suma);
        int resta = num1 - num2;
        System.out.println("La resta es " + resta);
        int mult = num1 * num2;
        System.out.println("La multiplicación es " + mult);
        int div = num1 / num2;
        System.out.println("La división es " + div);
        int resto = num1 % num2;
        System.out.println("El resto es " + resto);

        */

        //Ejercicio 10
        var sc = new Scanner(System.in);
        System.out.print("Escribe la distancia inicial: ");
        int e0 = sc.nextInt();
        System.out.print("Escribe la velocidad media: ");
        int v = sc.nextInt();
        System.out.print("Escribe el tiempo en mins: ");
        int t = sc.nextInt();
        int tiempo = t * 60;
        int espacio = e0 + (v * tiempo);
        System.out.println("La distancia ercorrida es; " + espacio + " metros");





    }
}