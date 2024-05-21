package models;

public class Segurado extends Veiculo implements ISeguroService{
    private double seguro;

    public Segurado(double seguro){
        this.seguro = seguro;
    }

    /**
     * Retorna o resultado do valor a pagar para o estacionamento através do cálculo
     * super.doTotal() - doDesconto().
     * @return
     */
    @Override
    public double doTotal(){
        double total = super.doTotal() - doDesconto();

        return  total;
    }
    @Override
    public String doViewCupom(){
        String mensagem = super.doViewCupom() +
                "\nDesconto do seguro: " + doDesconto() +
                "\nValor total a pagar: " + doTotal();
        return mensagem;
    }

    /**
     * Retorna o valor do desconto para veículos segurados através do cálculo
     * super.doTotal() * seguro / 100
     * @return double
     */
    @Override
    public double doDesconto() {
        return super.doTotal() * this.seguro /100;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
}
