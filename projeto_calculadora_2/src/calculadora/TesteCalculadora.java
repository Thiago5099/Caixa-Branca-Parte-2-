package calculadora;

/**
 * Classe de teste para a classe {@link Calculadora}.
 * <p>
 * Executa diversas operações utilizando o método {@code calcular} e
 * exibe os resultados no console. Também testa o comportamento da
 * calculadora ao lidar com operações inválidas e divisão por zero.
 * </p>
 */
public class TesteCalculadora {

    /**
     * Método principal que executa a aplicação.
     * <p>
     * Cria uma instância de {@link Calculadora} e realiza operações de
     * soma, subtração, multiplicação e divisão, exibindo os resultados.
     * Também testa e captura exceções geradas por operações inválidas,
     * como divisão por zero e operador desconhecido.
     * </p>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

