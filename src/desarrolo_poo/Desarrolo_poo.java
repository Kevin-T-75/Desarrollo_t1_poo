/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrolo_poo;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author UCC20418
 */
public class Desarrolo_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    ArrayList<Paciente> list = new ArrayList<>();

    String opcion;

    do {
        Paciente p = new Paciente();

        System.out.print("Nombres: ");
        p.setNombre(sc.nextLine());

        System.out.print("Apellidos: ");
        p.setApellidos(sc.nextLine());
        
        System.out.print("Edad: ");
        p.setEdad(sc.nextInt());
        sc.nextLine();

        // Documento (tipo + número en un solo do while)
        do {
            System.out.print("Tipo de documento (DNI / CE): ");
            p.setT_doc(sc.nextLine());

            if (p.getT_doc() != null) {

                System.out.print("Número de documento: ");
                p.setN_doc(sc.nextLine());

                if (p.getN_doc() == null) {
                    System.out.println("Número invalido para el tipo");
                }

            } else {
                System.out.println("Tipo invalido");
            }

        } while (p.getT_doc() == null || p.getN_doc() == null);

        System.out.print("Tipo de sangre: ");
        p.setT_sangre(sc.nextLine());

        System.out.print("Alergias: ");
        p.setAlergias(sc.nextLine());

        // Teléfono
        do {
            System.out.print("Número de teléfono: ");
            p.setN_telefono(sc.nextLine());

        } while (p.getN_telefono() == null);

        System.out.print("Correo: ");
        p.setCorreo(sc.nextLine());

        // 👉 Guardar paciente
        list.add(p);

        System.out.print("¿Agregar otro paciente? (s/n): ");
        opcion = sc.nextLine();

    } while (opcion.equals("s"));
        
        
        
    }
    
}
