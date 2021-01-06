import javax.swing.*;

public class OpArith {
    public static void main(String[] args) {
        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j) );

        int mult = i * j;
        System.out.println("mult = " + mult);
        System.out.println("i * j = " + (i * j));
        
        int div = i / j;
        float div2 = (float) i / (float)j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int rest = i % j;
        System.out.println("rest = " + rest);

        rest = 8 % 5;
        System.out.println("rest = " + rest);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(num % 2 == 0) {
            System.out.println("num par = " + num);
        } else {
            System.out.println("num impar = " + num);
        }
    }
}
