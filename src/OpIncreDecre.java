public class OpIncreDecre {
    public static void main(String[] args) {

        // ----------------------------- <> Pre incremento - Primero se incrementa y luego se asigna
//        int x = 1;
//        System.out.println("  -----  x = " + x);
//
////        ++x; // x = x + 1
////        int y = x;
//
//        int y = ++x; // x = x + 1
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        // ----------------------------- <> Post incremento - Primero se asigna y luego se incrementa
//        int i = 1;
//        System.out.println("  -----  i = " + i);
//
////        i++; // i = i + 1
////        int j = i;
//
//        int j = i++; // i = i + 1
//
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
        // ----------------------------- <> Pre decremento - Primero se decrementa y luego se asigna
        int x = 1;
        System.out.println("  -----  x = " + x);

//        --x; // x = x - 1
//        int y = x;

        int y = --x; // x = x - 1

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // ----------------------------- <> Post incremento - Primero se asigna y luego se decrementa
        int i = 1;
        System.out.println("  -----  i = " + i);

//        i--; // i = i - 1
//        int j = i;

        int j = i--; // i = i - 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }   
}
