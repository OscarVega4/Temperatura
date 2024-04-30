package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    convertirLongitud(scanner);
                    break;
                case 2:
                    convertirTemperatura(scanner);
                    break;
                case 3:
                    convertirPeso(scanner);
                    break;
                case 4:
                    convertirDatos(scanner);
                    break;
                case 5:
                    convertirMoneda(scanner);
                    break;
                case 6:
                    convertirTiempo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n**Calculadora de conversiones**");
        System.out.println("1. Longitud");
        System.out.println("2. Temperatura");
        System.out.println("3. Peso");
        System.out.println("4. Datos");
        System.out.println("5. Moneda");
        System.out.println("6. Tiempo");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Longitud
    // -----------------------------------------------------------------------------
    private static void convertirLongitud(Scanner scanner) {
        System.out.println("\n**Conversión de longitud**");
        System.out.println("1. Metros a Pies");
        System.out.println("2. Pies a Metros");
        System.out.println("3. Centímetros a Pulgadas");
        System.out.println("4. Pulgadas a Centímetros");
        System.out.println("0. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");

        int opcionLongitud = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcionLongitud) {
            case 1:
                convertirMetrosAPies(scanner);
                break;
            case 2:
                convertirPiesAMetros(scanner);
                break;
            case 3:
                convertirCentimetrosAPulgadas(scanner);
                break;
            case 4:
                convertirPulgadasACentimetros(scanner);
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void convertirMetrosAPies(Scanner scanner) {
        System.out.print("Ingrese la cantidad de metros: ");
        double metros = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double pies = metros * 3.28084;
        System.out.println(metros + " metros equivalen a " + pies + " pies.");
    }

    private static void convertirPiesAMetros(Scanner scanner) {
        System.out.print("Ingrese la cantidad de pies: ");
        double pies = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double metros = pies / 3.28084;
        System.out.println(pies + " pies equivalen a " + metros + " metros.");
    }

    private static void convertirCentimetrosAPulgadas(Scanner scanner) {
        System.out.print("Ingrese la cantidad de centímetros: ");
        double centimetros = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double pulgadas = centimetros / 2.54;
        System.out.println(centimetros + " centímetros equivalen a " + pulgadas + " pulgadas.");
    }

    private static void convertirPulgadasACentimetros(Scanner scanner) {
        System.out.print("Ingrese la cantidad de pulgadas: ");
        double pulgadas = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double centimetros = pulgadas * 2.54;
        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");
    }

    // Temperatura // ... (Implementar la conversión de temperatura)
    // -----------------------------------------------------------------------------
    private static void convertirTemperatura(Scanner scanner) {
        System.out.println("\n**Conversión de temperatura**");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Celsius a Kelvin");
        System.out.println("4. Kelvin a Celsius");
        System.out.println("5. Fahrenheit a Kelvin");
        System.out.println("6. Kelvin a Fahrenheit");
        System.out.println("0. Regresar al menú principal");
        System.out.print("Seleccione una opción: ");

        int opcionTemperatura = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcionTemperatura) {
            case 1:
                convertirCelciusAFahrenheit(scanner);
                break;
            case 2:
                convertirFahrenheitACelsius(scanner);   
                break;
            case 3:
                convertirCelsiusAKelvin(scanner);
                break;
            case 4:
                convertirKelvinACelsius(scanner);
                break;
            case 5:
                convertirFahrenheitAKelvin(scanner);
                break;
            case 6:
                convertirKelvinAFahrenheit(scanner);
                break;
            case 0:
                System.out.println("Regresar al menu principal");
                break;
                default:
                System.out.println("Opcion invalida. Intente de nuevo.");        
        }

    }
    private static void convertirCelciusAFahrenheit(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(celsius + " Celsius equivalen a: " + fahrenheit + " Fahrenheit.");
    }
    private static void convertirFahrenheitACelsius(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " Fahrenheit equivalen a: " + celsius + " Celsius.");
    }
    private static void convertirCelsiusAKelvin(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double kelvin = celsius + 273.15;
        System.out.println(celsius + " Celsius equivalen a: " + kelvin + " Kelvin.");
    }
    private static void convertirKelvinACelsius(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Kelvin: ");
        double kelvin = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double celsius = kelvin - 273.15;
        System.out.println(kelvin + " Kelvin equivalen a: " + celsius + " Celsius.");
    }
    private static void convertirFahrenheitAKelvin(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double kelvin = 5.0 / 9.0 *(fahrenheit-32) + 273.15;
        System.out.println(fahrenheit + " Fahrenheit equivalen a: " + kelvin + " Kelvin.");
    }
    private static void convertirKelvinAFahrenheit(Scanner scanner) {
        System.out.print("Ingrese la temperatura en Kelvin: ");
        double kelvin = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        double fahrenheit = 1.8 * (kelvin - 273) + 32;
        System.out.println(kelvin + " Kelvin equivalen a: " + fahrenheit + " Fahrenheit.");
    }



    // Peso
    // -----------------------------------------------------------------------------
    private static void convertirPeso(Scanner scanner) {
        // ... (Implementar la conversión de peso)
    }

    // Datos
    // -----------------------------------------------------------------------------
    private static void convertirDatos(Scanner scanner) {
        // ... (Implementar la conversión de datos)
    }

    // Moneda
    // -----------------------------------------------------------------------------
    private static void convertirMoneda(Scanner scanner) {
        // ... (Implementar la conversión de moneda)
    }

    // Tiempo
    // -----------------------------------------------------------------------------
    private static void convertirTiempo(Scanner scanner) {
        // ... (Implementar la conversión de tiempo)
    }
}