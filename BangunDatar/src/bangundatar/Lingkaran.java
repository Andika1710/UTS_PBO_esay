/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Axioo
 */
public class Lingkaran extends BangunDatar {
    private final int jari;
    
    public Lingkaran(int jari){
        this.jari = jari;
        
    }
    public double luas () {
        return (3.4 * jari * jari) / 2 ;
    }
}
