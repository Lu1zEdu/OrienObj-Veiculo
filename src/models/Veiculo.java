package models;

import java.util.List;

/**
 * A classe Veículo registra os dados de tempo e hora de cada veículo que realizar entrada no
 * estacionamento
 * @author Eliane
 * @version 1.0
 * @since
 * @
 */
public class Veiculo {
    private double valorHora;
    private double horaAdicional;
    private double horas;
    private List<String> lista;

    /**
    * Retorna o valor do total pago ao estacionamento.
    * @return double
    * */
    public double doTotal(){
        double valor =  this.valorHora + this.horaAdicional * (this.horas-1);
        return valor;
    }
    /*
    * Retorna a String formatada.
     */
    public String doViewCupom(){
        return "Cupom de estacionamento" +
                "\n-------------------" +
                "\nHoras estacionado: " + this.horas +
                "\nValor total: " + this.doTotal();
    }
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHoraAdicional() {
        return horaAdicional;
    }

    public void setHoraAdicional(double horaAdicional) {
        this.horaAdicional = horaAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
