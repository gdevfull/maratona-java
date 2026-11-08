package academy.devdojo.maratonajava.introducao;
/*
Exercício 1: Validador de Empréstimo Simples

Conceitos: Operadores Aritméticos e Relacionais

Crie um programa que avalie a elegibilidade de uma pessoa para obter um empréstimo bancário.

    Requisitos:

        Declare variáveis para armazenar a idade do cliente, a renda mensal e o valor da parcela desejada.

        Defina que o limite máximo permitido para a parcela é de 30% da renda mensal do cliente (calcule esse valor usando operadores aritméticos).

        Crie uma variável booleana idadePermitida que verifique se a idade é maior ou igual a 18 anos.

        Crie uma variável booleana parcelaPermitida que verifique se o valor da parcela é menor ou igual ao limite de 30% da renda.

        Imprima no console o resultado dessas verificações (true ou false).
 */
public class Aula04OperadoresExercicio1 {
    public static void main(String[] args) {
        int idadeCliente = 17;
        double rendaMensalCliente = 3500;
        double valorParcela = 1500;
        double limiteMaximoParcela = (rendaMensalCliente * 30)/100;
        boolean isIdadePermitida = idadeCliente >= 18;
        boolean isParcelaPermitida = valorParcela <= limiteMaximoParcela;
        System.out.println("isIdadePermitida " +isIdadePermitida);
        System.out.println("isParcelaPermitida " +isParcelaPermitida);
    }
}
