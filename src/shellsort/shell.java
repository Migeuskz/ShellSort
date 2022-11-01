/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shellsort;

/**
 *
 * @author Mikey
 */
public class shell {
    public void ordenar(int[] a){
        int n = a.length -1;
        boolean band = false;
        int INT = n+1;
        int i = 0;
        while(INT>1){
            INT = n/2;
            band = true;
            while(band == true){
                band = false;
                i =0;
                while((i+INT)<=n){
                    if(a[i]>a[i+INT]){
                    int aux = a[i];
                    a[i] = a[i+INT];
                    a[i+INT] = aux;
                    band = true;
                    }
                    i++;
                }
            }
        }
    }
}
