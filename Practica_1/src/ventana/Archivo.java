/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RYZEN
 */
public class Archivo {
    private File archivo;
    
    public void crearArchivo(){
        archivo = new File("agendaContactos.txt");
        
        try {
            if(archivo.createNewFile()){
                
            }
        } catch (IOException ex) {
            System.err.println("Error, "+ex);

        }
        
    }
    
    public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write(persona.getNombre()+"%"+ persona.getCorreo()+"%"+persona.getTelefono()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
}
