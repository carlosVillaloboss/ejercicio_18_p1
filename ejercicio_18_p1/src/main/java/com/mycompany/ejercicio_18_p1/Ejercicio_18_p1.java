package com.mycompany.ejercicio_18_p1;
import java.util.Scanner;

public class Ejercicio_18_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Entradas
        System.out.print("Ingrese codigo del empleado: ");
        String codigo= scanner.nextLine();
        
        System.out.print("Ingrese nombre del empleado: ");
        String nombre= scanner.nextLine();
        
        System.out.print("Ingrese horas trabajadas al mes: ");
        double horas= scanner.nextDouble();
        
        System.out.print("Ingrese valor hora: ");
        double valor_h= scanner.nextDouble();
        
        System.out.print("Ingrese porcentaje retencion en fuente: ");
        double p_impuesto= scanner.nextDouble();
        
        //proceso
        double impuesto= p_impuesto/100;
        double s_bruto= (horas*valor_h);
        double s_neto= s_bruto-(s_bruto*impuesto);
        
        //salida
        System.out.println("El codigo del empleado es: "+ codigo);
        System.out.println("El nombre del empleado es: "+ nombre);
        System.out.println("El salario bruto del empleado es: "+ s_bruto);
        System.out.println("El s_neto del empleado es: "+ s_neto);
        
        scanner.close();
        }
}
