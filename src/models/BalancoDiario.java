package models;

public class BalancoDiario {
    private static int qtdCarros;
    private static double total;

    /**
     * : Incrementa a quantidade de carros e incrementa o total com o valor
     * do método doTotal() do objeto obj
     * @param obj do tipo Veiculo
     */
    public void doAdd(Veiculo obj){
        qtdCarros += 1;
        total += obj.doTotal();
    }

    public String doGerarRelatorio(){
        return "Relatório diário" +
                "\n-------------" +
                "\nQuantidade de veículos: " + qtdCarros +
                "\nValor total: R$ " + total;
    }

}
