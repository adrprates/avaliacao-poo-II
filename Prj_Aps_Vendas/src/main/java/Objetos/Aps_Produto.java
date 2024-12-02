package Objetos;

public class Aps_Produto {
    
    private Integer aps_Idproduto;
    private String aps_Nome;
    private String aps_Marca;
    private String aps_Modelo;
    private double aps_Valor;
    
    public Aps_Produto(){
        
    }

    public Aps_Produto(Integer aps_Idproduto, String aps_Nome, String aps_Marca, String aps_Modelo, double aps_Valor) {
        this.aps_Idproduto = aps_Idproduto;
        this.aps_Nome = aps_Nome;
        this.aps_Marca = aps_Marca;
        this.aps_Modelo = aps_Modelo;
        this.aps_Valor = aps_Valor;
    }

    public Integer getAps_Idproduto() {
        return aps_Idproduto;
    }

    public void setAps_Idproduto(Integer aps_Id_Produto) {
        this.aps_Idproduto = aps_Id_Produto;
    }

    public String getAps_Nome() {
        return aps_Nome;
    }

    public void setAps_Nome(String aps_Nome) {
        this.aps_Nome = aps_Nome;
    }

    public String getAps_Marca() {
        return aps_Marca;
    }

    public void setAps_Marca(String aps_Marca) {
        this.aps_Marca = aps_Marca;
    }

    public String getAps_Modelo() {
        return aps_Modelo;
    }

    public void setAps_Modelo(String aps_Modelo) {
        this.aps_Modelo = aps_Modelo;
    }

    public double getAps_Valor() {
        return aps_Valor;
    }

    public void setAps_Valor(double aps_Valor) {
        this.aps_Valor = aps_Valor;
    } 
}