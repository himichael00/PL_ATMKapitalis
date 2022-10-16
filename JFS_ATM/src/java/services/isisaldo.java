/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

public class isisaldo {
    public int saldoAwal = 500000; public int limitSaldo = 100000;
    
    private static isisaldo instance = new isisaldo();

    public static isisaldo getInstance() {
        return instance;
    }
   
    public int getSaldoAwal(){
        return saldoAwal;
    }
    
    public void setSaldoAwal(int saldoAwal){
        this.saldoAwal = saldoAwal;
    }
}