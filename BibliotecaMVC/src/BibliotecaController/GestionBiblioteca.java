/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaController;

import BibliotecaModel.Libro;
import BibliotecaModel.Usuario;
import BibliotecaModel.Prestamo;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author DAMA
 */
public class GestionBiblioteca {
  private HashMap<String, Libro> mapaLibros;  
  
  private ArrayList<Usuario> listaUsuarios;
  private ArrayList<Prestamo> listaPrestamos;
  
  public GestionBiblioteca(){
      this.mapaLibros = new HashMap<>();
      this.listaUsuarios = new ArrayList<>();
      this.listaPrestamos = new ArrayList<>();
  }
  public void registrarLibro(String isbn, Libro libro){
      mapaLibros.put(isbn, libro);
      System.out.println("Libro guardado con exito");
  }
  public void registarUsuario(Usuario usuario){
      listaUsuarios.add(usuario);
      System.out.println("Usuario guardado con exito");
  }
  public void registrarPrestamo(Prestamo prestamo){
      listaPrestamos.add(prestamo);
      System.out.println("Prestamo registrado con exito");
  }
  public HashMap<String, Libro> getMapaLibros(){
      return mapaLibros;
  }   
  public ArrayList<Usuario> getListaUsuarios(){
      return listaUsuarios;
  }
  public ArrayList<Prestamo> getListaPrestamos(){
      return listaPrestamos;
  }
}
