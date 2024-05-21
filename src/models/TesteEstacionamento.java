package models;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);
        //Altere o valor do atributo valorHora para 5, valorAdicional para 2 e horas
        //para 0.
        veicSeg.setValorHora(5);
        veicSeg.setHoraAdicional(2);
        veicSeg.setHoras(6);
        System.out.println(veicSeg.doViewCupom());

        BalancoDiario bd = new BalancoDiario();
        bd.doAdd(veicSeg);
        System.out.println(bd.doGerarRelatorio());
    }
}
