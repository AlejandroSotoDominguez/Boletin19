
package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {
        Libreria menu = new Libreria();
        int opcion;
        do{
 
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1- Engadir libro"
                + "\n2- Vender libro"
                + "\n3- Amosar libros"
                + "\n4- Dar de baixa libros"
                + "\n5- Consultar libro"));
            
            switch(opcion){
                
                case 1:
                    menu.engadirLibros();
                    break;
                case 2:
                    menu.venderLibros();
                    break;
                case 3:
                    menu.amosarLibros();
                    break;
                case 4:
                    menu.darDeBaixa();
                    break;
                case 5:
                    menu.consultarLibro();
                    break;
                case 0:
                    System.exit(opcion);
            }  
            
        }while(opcion<=6);            
                    
            
    }
    
}
