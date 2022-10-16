package model;
//dao2
public interface AtmDao {
    int getSaldo();
    
    int cekTransaksi(int total);
    
    void tambahSaldo(int total);
    
    void tarikSaldo(int total);
    
    boolean cekBatasSaldo();
}