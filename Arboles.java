/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.*;


public class Arboles {
    
    public static void main(String[] args) {
         int opcion=0;
      
        Scanner entrada = new Scanner(System.in);
      ArrayList<String> datos = new ArrayList(); 
       do{
                   
        System.out.println("1.Agregar Arbol");
        System.out.println("2.Mostrar Familia");
        System.out.println("3.Salir");
         System.out.println("Ingrese una opcion: ");
        opcion=entrada.nextInt();
        switch(opcion)
        {
            case 1: 
                int n =0;
                System.out.println("Cuantos elementos desea ingresar?: ");
                n =  entrada.nextInt();   
                //ingresar datos a lista
             for(int x=0; x<n; x++)
             {
                  System.out.println("Ingrese nombre: ");
             datos.add(entrada.next());
             System.out.println("Ingrese familia: ");
            datos.add(entrada.next());
             System.out.println("Ingrese tipo de suelo: ");
           datos.add(entrada.next());
             System.out.println("Ingrese zona: ");
             datos.add(entrada.next());
              
             }
   
                 
                break;
                case 2: //mostrando datos de la lista
Iterator<String> nombreIterator = datos.iterator();

while(nombreIterator.hasNext()){
	String elemento = nombreIterator.next();
	System.out.print(elemento+" / ");
} 
       }}while(opcion<=2 && opcion >=1);
        
        
    }
}