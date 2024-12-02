package Objetos;

import java.util.Date;

public class Aps_Cliente {
    
    private Integer aps_Idcliente;
    private String aps_Nome;
    private Date aps_Data_Nascimento;
    private String aps_Cpf;
    
    public Aps_Cliente(){
        
    }

    public Aps_Cliente(Integer aps_Idcliente, String aps_Nome, Date aps_Data_Nascimento, String aps_Cpf) {
        this.aps_Idcliente = aps_Idcliente;
        this.aps_Nome = aps_Nome;
        this.aps_Data_Nascimento = aps_Data_Nascimento;
        this.aps_Cpf = aps_Cpf;
    }

    public Integer getAps_Idcliente() {
        return aps_Idcliente;
    }

    public void setAps_Idcliente(Integer aps_Idcliente) {
        this.aps_Idcliente = aps_Idcliente;
    }

    public String getAps_Nome() {
        return aps_Nome;
    }

    public void setAps_Nome(String aps_Nome) {
        this.aps_Nome = aps_Nome;
    }

    public Date getAps_Data_Nascimento() {
        return aps_Data_Nascimento;
    }

    public void setAps_Data_Nascimento(Date aps_Data_Nascimento) {
        this.aps_Data_Nascimento = aps_Data_Nascimento;
    }

    public String getAps_Cpf() {
        return aps_Cpf;
    }

    public void setAps_Cpf(String aps_Cpf) {
        this.aps_Cpf = aps_Cpf;
    }
}