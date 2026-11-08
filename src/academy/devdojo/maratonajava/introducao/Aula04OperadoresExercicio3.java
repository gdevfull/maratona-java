package academy.devdojo.maratonajava.introducao;
/*
Exercício 3: Simulação de Controle de Acesso e Turno

Conceitos: Combinação de Expressões Lógicas Complexas e Precedência de Operadores

Crie a checagem de permissão de acesso a um sistema de segurança industrial.

    Requisitos:

        Declare variáveis para nível de acesso do funcionário (int de 1 a 5), possui credencial física (boolean), é horário comercial (boolean) e é administrador (boolean).

        O acesso ao setor de máquinas será autorizado (true) apenas se cumprir uma das seguintes condições:

            O funcionário é administrador (tem acesso irrestrito independente do resto); OU

            Ele possui nível de acesso maior ou igual a 3 AND possui credencial física AND está no horário comercial.

        O acesso deve ser bloqueado (false) se a credencial física NÃO for apresentada (a menos que seja um administrador).

        Monte uma única expressão lógica encadeada (usando parênteses para garantir a ordem de avaliação correta) e exiba no console se o acesso foi liberado ou negado.
 */
public class Aula04OperadoresExercicio3 {
    public static void main(String[] args) {
        int nivelAcesso = 5;


        boolean credencialFisica = false;
        boolean horarioComercial = true;
        boolean administrador = false;

        boolean setorMaquinas = administrador || nivelAcesso >= 3 && credencialFisica && horarioComercial;
        System.out.println("Acesso liberado: " + setorMaquinas);

    }
}
