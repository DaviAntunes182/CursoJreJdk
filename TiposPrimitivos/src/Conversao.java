public class Conversao {
    public static void main(String[] args) {
        double real = 1270.50;
        int inteiro = (int) real;

        System.out.printf("""
                Fazendo a conversão de %.2f para
                inteiro ficará %d
                """, real, inteiro);

    }
}
