/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rossi.test.arraylist;

/**
 *
 * @author CFL 401
 */
public class MASCOTAS {
    private String nombres;
    private int patas;
    private int edad;

    public MASCOTAS(String nombres, int patas, int edad) {
        this.nombres = nombres;
        this.patas = patas;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
