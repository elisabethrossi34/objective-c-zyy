/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rossi.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author CFL 401
 */
public class RossiTestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   Scanner teclado=new Scanner(System.in);
        ArrayList elem=new ArrayList();
        ArrayList <Integer> elem2=new ArrayList();
        int numero=0;
        boolean bandera=true;
        elem.add("perro");
        elem.add(4);
        elem.add(7);
    /*   while(bandera){
      System.out.println("ingrese un numero");
    
     try {
          numero=teclado.nextInt();
      } catch(Exception e){ 
         System.out.println("ingrese un numero entero"); 
      }
        if(numero>=0){ 
         elem2.add(numero);  
        } else if(numero<0){   System.out.println(elem2);
           bandera=false;  
      }
        }
                
     */  
     ArrayList<MASCOTAS> mascotas= new ArrayList();
     //perro1=nuevo objeto
     // MASCOTAS perro1=new MASCOTAS("toby",4,22);
     // MASCOTAS gato1=new MASCOTAS("mish",3,10);
     // MASCOTAS loro1=new MASCOTAS("poli",2,25);
     mascotas.add(new MASCOTAS("TORY",4,22));
     mascotas.add(new MASCOTAS("MISH",3,10));
     mascotas.add(new MASCOTAS("POLY",2,25));
     boolean bandera=true;
    Scanner tc=new Scanner(System.in);
    String nombre;
     int patas;
     int edad;
     while(bandera){
      System.out.println("si desea salir ingrese salir sino ingrese un nombre");
      nombre=tc.nextLine();
       if(nombre.equals("salir")){
         bandera= false; 
       System.out.println(mascotas); 
     } else{
      System.out.println("ingresar nombre");
      nombre=tc.nextLine();    
     System.out.println("ingresar cantidad de patas");
      patas=tc.nextInt();
      System.out.println("ingresar edad");
      edad=tc.nextInt();
     mascotas.add(new MASCOTAS(nombre,patas,edad)); 
      if(nombre.equals("salir")){
         bandera= false; 
       System.out.println(mascotas); }
      }
       }
      Iterator it= mascotas.iterator();
     // it.hasNext();
     //  next();
       while(it.hasNext()){
       // System.out.println(((MASCOTAS)) it.next()).getnombre());
        MASCOTAS mascota=(MASCOTAS)it.next();
        System.out.println(mascota.getEdad());
        System.out.println(mascota.getPatas());
        System.out.println(mascota.getPatas());
       }
      }
       
     } 
     
     
     
    
        

