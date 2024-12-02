package Objetos;

import java.util.Date;

public class Aps_Venda {
    
    private Integer aps_Idvenda;
    private Date aps_Data_Venda;
    private double aps_Total_venda;
    private Aps_Venda aps_Venda;
    
    public Aps_Venda(){
        
    }

    public Aps_Venda(Integer aps_Idvenda, Date aps_Data_Venda, double aps_Total_venda, Aps_Venda aps_Venda) {
        this.aps_Idvenda = aps_Idvenda;
        this.aps_Data_Venda = aps_Data_Venda;
        this.aps_Total_venda = aps_Total_venda;
        this.aps_Venda = aps_Venda;
    }

    public Integer getAps_Idvenda() {
        return aps_Idvenda;
    }

    public void setAps_Idvenda(Integer aps_Idvenda) {
        this.aps_Idvenda = aps_Idvenda;
    }

    public Date getAps_Data_Venda() {
        return aps_Data_Venda;
    }

    public void setAps_Data_Venda(Date aps_Data_Venda) {
        this.aps_Data_Venda = aps_Data_Venda;
    }

    public double getAps_Total_venda() {
        return aps_Total_venda;
    }

    public void setAps_Total_venda(double aps_Total_venda) {
        this.aps_Total_venda = aps_Total_venda;
    }

    public Aps_Venda getAps_Venda() {
        return aps_Venda;
    }

    public void setAps_Venda(Aps_Venda aps_Venda) {
        this.aps_Venda = aps_Venda;
    }
}