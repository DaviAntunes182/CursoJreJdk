public class Inteiro {
    public static void main(String[] args) {
        int idade;
        long maior;
        idade = 37;
        System.out.println(idade);

        idade = 30 + 10;
        System.out.println(idade);

        idade = (7*5) + 2;
        System.out.println(idade);

        System.out.printf("""
                A idade é %d
                """, idade);

        maior = 123456789L;

        System.out.println(maior);
    }
}
