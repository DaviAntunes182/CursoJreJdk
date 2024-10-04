import java.math.BigDecimal;

public class PontoFlutuante {
    public static void main(String[] args) {
        double real = 1250.70;
        System.out.printf("""
                O salário é %.2f
                """,real);

        double divisao = real / 3.14;
        System.out.printf("""
                O resultado da divisão é: %.2f
                """, divisao);

        BigDecimal salario = new BigDecimal("1250.70");
        BigDecimal aumento = new BigDecimal("1250.20");
        BigDecimal salarioFinal = salario.add(aumento);

        System.out.println(salarioFinal.toString());

    }
}
