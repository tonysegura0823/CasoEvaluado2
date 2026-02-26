/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiocaso1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class EstudioCaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      private String nombre;
      private String cedula;
      private String telefono;
      private String categoria;
      private int numeroMes;
      private double totalAcumulado;
      private int puntos;
      private int cantidadVehicular;
      
      public clientes(String nombre, String cedula, String telefono, String categoria, int numeroMes) {
          this.nombre = nombre;
          this.cedula = cedula;
          this.telefono = telefono;
          this.categoria = categoria;
          this.numeroMes = numeroMes;
          this.totalAcumulado =0;
          this.puntos = 0;
          this.cantidadVehicular = 0;
      }
      public void acumularPuntos(double monto){
          totalAcumulado += monto;
          cantidadVehicular ++;
      }
      
      public void acumularPuntos(int puntos){
          puntos += puntos;
          
      public void aplicacarBeneficiosVIP(){
          if (categoria.equalsIgnoreCases("VIP")
                  
                
      }
      }
            
      
              
        
        
    }
    
}
