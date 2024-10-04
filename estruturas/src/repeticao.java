public class repeticao {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 10){
            //System.out.println(contador);
            contador++;
        }

        int num = 5;
        int fat;
        String msg = String.valueOf(num);

        for (int i = num - 1; i > 0; i--) {
            msg += " x " + i;
            num *= i;
            if(i == 1){
                fat = num;
                msg += " = " + fat;
            }
        }
        System.out.println(msg);
    }
}
