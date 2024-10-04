import java.math.BigDecimal;

public class TesteDeEscopo {
    public static void main(String[] args) {
        BigDecimal salarioBase = new BigDecimal("3800");
        BigDecimal inss = new BigDecimal("0");

        // Não existe salário negativo
        if(salarioBase.doubleValue() > 0 && salarioBase.doubleValue() < 1412){
            inss = salarioBase.multiply(new BigDecimal("0.075"));
        }else if(salarioBase.doubleValue() > 1412 && salarioBase.doubleValue() < 2666.68){
            inss = salarioBase.multiply(new BigDecimal("0.09"));
        }else if(salarioBase.doubleValue() > 2666.68 && salarioBase.doubleValue() < 4000.03){
            inss = salarioBase.multiply(new BigDecimal("0.12"));
        }else{
            inss = salarioBase.multiply(new BigDecimal("0.14"));
        }

        BigDecimal baseIr = salarioBase.subtract(inss);
        BigDecimal valorIr;

        if(baseIr.doubleValue() > 2259.21 && baseIr.doubleValue() <= 2826.65){
            valorIr = (baseIr.multiply(new BigDecimal("0.075")).subtract(new BigDecimal("169.44")));

        }else if(baseIr.doubleValue() > 2826.66 && baseIr.doubleValue() <= 3751.05){
            valorIr = (baseIr.multiply(new BigDecimal("0.15")).subtract(new BigDecimal("381.44")));

        }else if(baseIr.doubleValue() > 2826.66 && baseIr.doubleValue() <= 4664.68){
            valorIr = (baseIr.multiply(new BigDecimal("0.225")).subtract(new BigDecimal("662.77")));

        }else if(baseIr.doubleValue() > 4664.68){
            valorIr = (baseIr.multiply(new BigDecimal("0.275")).subtract(new BigDecimal("896")));

        }else{
            valorIr = new BigDecimal("0");
        }

        BigDecimal salarioLiq = salarioBase.subtract(inss).subtract(valorIr).add(new BigDecimal("111.18"));
        System.out.println(salarioLiq);
        System.out.println(inss);
        System.out.println(valorIr);
    }
}
