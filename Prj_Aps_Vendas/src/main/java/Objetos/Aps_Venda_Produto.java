package Objetos;

public class Aps_Venda_Produto {

    private Aps_Venda aps_Venda;
    private Aps_Produto aps_Produto;
    private double aps_Quantidade;
    private double aps_Total_Item;
    private double aps_Desconto_Item;
    
    public Aps_Venda_Produto(){
        
    }

    public Aps_Venda_Produto(Aps_Venda aps_Venda, Aps_Produto aps_Produto, double aps_Quantidade, double aps_Total_Item, double aps_Desconto_Item) {
        this.aps_Venda = aps_Venda;
        this.aps_Produto = aps_Produto;
        this.aps_Quantidade = aps_Quantidade;
        this.aps_Total_Item = aps_Total_Item;
        this.aps_Desconto_Item = aps_Desconto_Item;
    }

    public Aps_Venda getAps_Venda() {
        return aps_Venda;
    }

    public void setAps_Venda(Aps_Venda aps_Venda) {
        this.aps_Venda = aps_Venda;
    }

    public Aps_Produto getAps_Produto() {
        return aps_Produto;
    }

    public void setAps_Produto(Aps_Produto aps_Produto) {
        this.aps_Produto = aps_Produto;
    }

    public double getAps_Quantidade() {
        return aps_Quantidade;
    }

    public void setAps_Quantidade(double aps_Quantidade) {
        this.aps_Quantidade = aps_Quantidade;
    }

    public double getAps_Total_Item() {
        return aps_Total_Item;
    }

    public void setAps_Total_Item(double aps_Total_Item) {
        this.aps_Total_Item = aps_Total_Item;
    }

    public double getAps_Desconto_Item() {
        return aps_Desconto_Item;
    }

    public void setAps_Desconto_Item(double aps_Desconto_Item) {
        this.aps_Desconto_Item = aps_Desconto_Item;
    }
}