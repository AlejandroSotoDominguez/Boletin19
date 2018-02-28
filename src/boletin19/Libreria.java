
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Libreria {
    
    ArrayList<Libro> arrayLibros = new ArrayList();
    
    public void engadirLibros(){
        String titulo = JOptionPane.showInputDialog("Título: ");
        String autor = JOptionPane.showInputDialog("Autor: ");
        String isbn = JOptionPane.showInputDialog("ISBN: ");
        float prezo = Float.parseFloat(JOptionPane.showInputDialog("Prezo: "));
        int numeroUnidades = Integer.parseInt(JOptionPane.showInputDialog("Número de unidades: "));
        Libro libro1 = new Libro(titulo,autor,isbn,prezo,numeroUnidades);
        arrayLibros.add(libro1);
    }
    
    public void venderLibros(){
        
        try {
            int borrarLibro = Integer.parseInt(JOptionPane.showInputDialog("Introduce o libro que queras borrar"));
                for(int i=0;i<arrayLibros.size();i++){
                arrayLibros.remove(borrarLibro);
            }
        } catch (NullPointerException e) {
            System.err.println("El array es nulo");
        }
    }
    
    public void amosarLibros(){
        
        try {
            Collections.sort(arrayLibros);

            for(int i=0;i<arrayLibros.size();i++){         
                System.out.println(arrayLibros.get(i));
            }
        }catch (NullPointerException e) {
            System.err.println("El array es nulo");
        }
    }
    
    public void darDeBaixa(){
        for(int i=0;i<arrayLibros.size();i++){
            if(arrayLibros.get(i).getNumeroUnidades()==0){
                arrayLibros.remove(i);
            }
        }
    }
    
    public void consultarLibro(){
        String buscar = JOptionPane.showInputDialog("Buscar por título");
        for(int i=0;i<arrayLibros.size();i++){
            if(buscar.equalsIgnoreCase(arrayLibros.get(i).getTitulo())){
                System.out.println(arrayLibros.get(i));
            }
        }
    }
    
}
