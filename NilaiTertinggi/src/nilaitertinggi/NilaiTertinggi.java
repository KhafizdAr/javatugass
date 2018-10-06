/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaitertinggi;

/**
 *
 * @author dharyl
 */
public class NilaiTertinggi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10, n2 = 23, n3 = 5, nmax;
        System.out.println("Number 1\t="+n1);
        System.out.println("Number 2\t="+n2);
        System.out.println("Number 3\t="+n3);
        nmax = (n2>n3)?(n2>n1)? n2:n1:n3;
        System.out.println("Nilai tertingginya adalah\t= "+nmax);

        // TODO code application logic here
    }
    
}
