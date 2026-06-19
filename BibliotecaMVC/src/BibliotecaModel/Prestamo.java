/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaModel;

/**
 *
 * @author DAMA
 */
public class Prestamo {
    private String codigo;
    private String fecha;

    public Prestamo(String codigo, String fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
               ", Fecha: " + fecha;
    }
    
}
