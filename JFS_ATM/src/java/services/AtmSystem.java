/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import model.AtmDao;
//dao3
public class AtmSystem implements AtmDao {
    isisaldo saldo;

    public AtmSystem() {
        this.saldo = isisaldo.getInstance();
    }     
    public int limitSaldo(){
        return this.saldo.limitSaldo;
    }

    @Override
    public int getSaldo() {
        return this.saldo.getSaldoAwal();
    }

    @Override
    public int cekTransaksi(int total) {
        if(total % 50000 == 0){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void tambahSaldo(int total) {
        this.saldo.setSaldoAwal(this.saldo.getSaldoAwal()+total);
    }

    @Override
    public void tarikSaldo(int total) {
        this.saldo.setSaldoAwal(this.saldo.getSaldoAwal()-total);
    }

    @Override
    public boolean cekBatasSaldo() {
        if(this.saldo.getSaldoAwal() <= this.saldo.limitSaldo){
            return true;
        } else {
            return false;
        }
    }
}
