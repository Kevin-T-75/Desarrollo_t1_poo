/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolo_poo;

/**
 *
 * @author UCC20418
 */
public class Paciente {
    
    private String Nombre;
    private String Apellidos;
    private int edad;
    private String T_doc;
    private String N_doc;
    private String T_sangre;
    private String Alergias;
    private String N_telefono;
    private String correo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getT_doc() {
        return T_doc;
    }

    public void setT_doc(String T_doc) {
        if (T_doc.equals("DNI") || T_doc.equals("CE")) {
        this.T_doc = T_doc;
    } else {
        this.T_doc = null;
        System.out.println("Tipo de documento inválido");
    }
    }

    public String getN_doc() {
        return N_doc;
    }

    public void setN_doc(String doc) {
      if (this.T_doc != null) {
        if (this.T_doc.equals("DNI") && doc.length() == 8) {
            this.N_doc = doc;
        } 
        else if (this.T_doc.equals("CE") && doc.length() == 9) {
            this.N_doc = doc;
        } 
        else {
            this.N_doc = null;
            System.out.println("Número inválido para el tipo de documento");
        }   
    }
    }

    public String getT_sangre() {
        return T_sangre;
    }

    public void setT_sangre(String T_sangre) {
        this.T_sangre = T_sangre;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getN_telefono() {
        return N_telefono;
    }

    public void setN_telefono(String N_telefono) {
        this.N_telefono = N_telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
