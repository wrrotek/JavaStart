public class simpleKalk {
    public static void main(String[] args) {
        double a = 10;
        double b = 4.5;

        double suma = a + b;
        double roznica = a - b;
        double mnozenie = a * b;
        double dzielenie = a / b;

        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(a + " - " + b + " = " + roznica);
        System.out.println(a + " * " + b + " = " + mnozenie);
        System.out.println(a + " / " + b + " = " + dzielenie);

        System.out.print("Czy liczba a jest większa od 0? ");
        boolean aBiggerThan0 = a < 0;
        System.out.println(aBiggerThan0);

        System.out.print("Czy suma jest parzysta? ");
        double modulo = suma % 2;
        System.out.println(modulo == 0.0);

        System.out.print("Czy a lub b jest większe od 100? ");
        boolean aOrBBiggerThan100 = a > 100 || b > 100;
        System.out.println(aOrBBiggerThan100);

        System.out.print("Czy a i b jest większe od 100? ");
        boolean aAndBBigerThan100 = a + b > 100;
        System.out.println(aAndBBigerThan100);
    }
}
