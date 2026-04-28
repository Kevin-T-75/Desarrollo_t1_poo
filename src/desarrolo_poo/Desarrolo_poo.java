/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrolo_poo;

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
        Paciente p = new Paciente();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombres: ");
        p.setNombre(sc.nextLine());

        System.out.print("Apellidos: ");
        p.setApellidos(sc.nextLine());

        System.out.print("Edad: ");
        p.setEdad(sc.nextInt());
        sc.nextLine(); 

       do {
           System.out.print("Tipo de documento (DNI / CE): ");
           p.setT_doc(sc.nextLine());

           if (p.getT_doc() != null) {

              System.out.print("Número de documento: ");
              p.setN_doc(sc.nextLine());

              if (p.getN_doc() == null) {
                  System.out.println("Número inválido para el tipo");
                }
            }
        } while (p.getT_doc() == null || p.getN_doc() == null);

        System.out.print("Tipo de sangre: ");
        p.setT_sangre(sc.nextLine());

        System.out.print("Alergias: ");
        p.setAlergias(sc.nextLine());

        System.out.print("Teléfono: ");
        p.setN_telefono(sc.nextLine());

        System.out.print("Correo: ");
        p.setCorreo(sc.nextLine());
        
        
        
        
    }
    
}
