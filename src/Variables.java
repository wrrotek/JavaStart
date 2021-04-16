public class Variables {

    public static void main(String[] args) {

        var firstName = "Jan";;
        String lastName;
        lastName = "Kowalski";
        final String pesel = "1234567890";
        int age = 25;
        double height = 180.5;

        System.out.println(firstName + " " + lastName + " " + " ma " + age + " lat.");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName + " jest wysoki na " + height);
        System.out.println("Jeżeli " + firstName + " urośnie o 5 cm, to będzie miał " + (height + 5) + "cm.");

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie " + firstName);
    }
}
