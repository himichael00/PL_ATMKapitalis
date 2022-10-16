package control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import services.AtmSystem;


@Named
@RequestScoped
//  mvc
public class AtmController {
    private AtmSystem model;
    private int total;
    
    public AtmController(){
        model = new AtmSystem();
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public int cekSaldo() {
        return model.getSaldo();
    }

    public String getResponeTarikTunai() {
         if(model.cekBatasSaldo()){
            return "Saldo Anda Mencapai Limit";
        } else if((model.getSaldo()- total)< model.limitSaldo()){
            return "Jumlah Penarikan melebihi limit penarikan";
        } else if((model.getSaldo()> total) && (model.cekTransaksi(total) == 1)){
            model.tarikSaldo(total);
            return "Tarik Tunai Berhasil";
        } else{
            return  "Penarikan harus kelipatan 50000";
        }         
    }

    public String getResponeSetorTunai() {
        if(model.cekTransaksi(total)==1){
            model.tambahSaldo(total);
            return "Setor Tunai berhasil";
        } else{
            return ("Setor Tunai harus kelipatan 50000");
        }
    }
    
}