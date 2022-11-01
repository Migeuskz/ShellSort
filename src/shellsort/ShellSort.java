/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;

/**
 *
 * @author Mikey
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arreglo = new int[10];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        shell s = new shell();
        //Antes de ordenar
        for(int x : arreglo){
            System.out.println(x+",");
        }
        s.ordenar(arreglo);
        //Despues de ordenar
        System.out.println("");
        for( int x : arreglo){
            System.out.println(x+",");
        }
    }
}