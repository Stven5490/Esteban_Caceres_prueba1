package interfaz;

import entidad.Gordito;

import java.util.Arrays;
import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Gordito gordito = null;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            opcion = menu();

            switch (opcion){
                case 1:
                    //Crear paciente
                    System.out.println("Ingresar el RUT del Paciente");
                    String RUT = scanner.nextLine();
                    System.out.println("Ingrese el nombre del Paciente");
                    String NOMBRE = scanner.nextLine();
                    System.out.printf("Ingrese la edad del Paciente");
                    int EDAD = scanner.nextInt();
                    System.out.println("Ingrese el numero de contacto");
                    String TELEFONO = scanner.nextLine();
                    for(int P = 0; P < gordito.getPESO_Mensual_Paciente().length; P++){
                        System.out.println("Peso por mes " + (P+1) + ": " + gordito.getPESO_Mensual_Paciente()[P]);
                    }

                    break;
                case 2:
                    //Mostar datos del paciente
                    System.out.println("Datos del paciente:");
                    System.out.println("RUT:" + gordito.getRUT_Paciente());
                    System.out.println("Nombre:" + gordito.getNOMBRE_Paciente());
                    System.out.println("Edad: " + gordito.getEDAD_Paciente());
                    System.out.println("Fono:" + gordito.getFONO_Paciente());
                    System.out.println("Pesos mensuales" + Arrays.toString(gordito.getPESO_Mensual_Paciente()));
                    break;
                case 3:
                    //Mostrar peso promedio (Anual)
                    System.out.println("Peso Promedio anual" + gordito.pesoPromedio());
                case 4:
                    //Ingresar de peso a comparar
                    System.out.println("Ingrese un peso a comparar");
                    int pesoCompara = scanner.nextInt();
                    int[] mesesMasKilos = gordito.masDeXKilos(pesoCompara);
                    if(mesesMasKilos != null){
                        System.out.println("Meses en los que el paciente peso mas de " + pesoCompara + " kgrms.");
                    }
                    break;
                case 5:
                    //Indicar la condicion del paciente (Diciembre)
                    System.out.println("Ingrese estatura ");
                    double estatura = scanner.nextDouble();
                    String condicionDiciembre = gordito.ultimoMes(estatura);
                    System.out.println("Condicion del paciente en Dicimebre " + condicionDiciembre);
                case 6:
                    break;

            }
        }while(opcion!=6);
    }

    //Menu de accion
    public static int menu(){
        System.out.println("-----Sistema de ingreso de pacientes-----");
        System.out.println("1.\tCrear paciente");
        System.out.println("2.\tMostrar datos del paciente");
        System.out.println("3.\tMostrar peso promedio (Anual)");
        System.out.println("4.\tIngreso de peso a comparar");
        System.out.println("5.\tIndicar la condicion del paciente (Diciembre)");
        System.out.println("6.\tSalir");
        System.out.println("-------------------------------------------------");
        System.out.println("Favor ingrese una opcion para continuar.........:");
        return Leer.datoInt();
    }
}
