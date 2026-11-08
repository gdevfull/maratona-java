package academy.devdojo.maratonajava.introducao;

/*
Exercício 2: Sistema de Classificação de Frete e Desconto

Conceitos: Operadores Lógicos (&&, ||, !) e Atribuição com Operadores

Desenvolva a lógica de cálculo final de uma compra online considerando regras de desconto e frete grátis.

    Requisitos:

        Declare variáveis para o valor total da compra, se o cliente é membro VIP (boolean) e se possui um cupom de desconto válido (boolean).

        Verifique a regra para Frete Grátis: o frete será grátis se o valor da compra for maior ou igual a R$ 250,00 OU se o cliente for membro VIP. Armazene o resultado em uma variável booleana.

        Verifique a regra para Desconto Especial: o desconto é aplicado se o cliente for membro VIP E possuir um cupom válido. Armazene o resultado em uma variável booleana.

        Use operadores de atribuição reduzida (+=, -=, *=, /=) para aplicar um desconto de R$ 30,00 no valor total da compra caso o desconto especial seja verdadeiro.

        Imprima se o frete grátis foi concedido, se o desconto se aplica e o valor final atualizado da compra.
 */

public class Aula04OperadoresExercicio2 {
    public static void main(String[] args) {
        double valorTotalCompra = 300;
        boolean isMembroVip = true;
        boolean cupomDescontoValido = true; // alterado para testar o desconto

        boolean freteGratis = valorTotalCompra >= 250 || isMembroVip;
        boolean descontoEspecial = isMembroVip && cupomDescontoValido;

        // Se descontoEspecial for true subtrai 30, senão subtrai 0
        valorTotalCompra -= descontoEspecial ? 30 : 0;

        System.out.println("Frete grátis aplicado: " + freteGratis);
        System.out.println("Desconto especial aplicado: " + descontoEspecial);
        System.out.println("Valor final da compra: R$ " + valorTotalCompra);
    }
}