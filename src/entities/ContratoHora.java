
package entities;

import java.util.Date;


public class ContratoHora {
    
    private Date date;
    private Double valorPorHora;
    private Integer Hora;
    
public ContratoHora(){
    
}

    public ContratoHora(Date date, Double valorPorHora, Integer Hora) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.Hora = Hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHora() {
        return Hora;
    }

    public void setHora(Integer Hora) {
        this.Hora = Hora;
    }

    
    public double valorTotal(){
        return valorPorHora * Hora;
    }

    
}
