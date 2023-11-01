/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        /*
        println vs print
        println sirve para dar un salto de linea despues de imprimir el valor que queremos
        print sirve para presentar todos los valores juntos en una sola linea
        */
        String nombreEstudiante = "Luis Fernando";
        String apellidoEstudiante = "Cordova Carrion";
        int nacimiento = 2006;
        System.out.println(nombreEstudiante + " ");
        System.out.print(apellidoEstudiante + " ");
        System.out.print(nacimiento + " ");
        System.out.print(nombreEstudiante + " ");
    }
}
