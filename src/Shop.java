public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Mleko";
        product1.producent = "Mlekovita";
        product1.price = 3.2;
        product1.avaiability = true;

        Product product2 = new Product();
        product2.name = "Czekolada";
        product2.producent = "Wedel";
        product2.price = 3.5;
        product2.avaiability = false;

        Product product3 = new Product();
        product3.name = "Jogurt";
        product3.producent = "Jogobella";
        product3.price = 1.5;
        product3.avaiability = true;

        System.out.println("nazwa: " + product1.name
                + ", cena " + product1.price
                + "zł, producent " + product1.producent
                + ", dostępność: " + product1.avaiability);

        System.out.println("nazwa: " + product2.name
                + ", cena " + product2.price
                + "zł, producent " + product2.producent
                + ", dostępność: " + product2.avaiability);

        System.out.println("nazwa: " + product3.name
                + ", cena " + product3.price
                + "zł, producent " + product3.producent
                + ", dostępność: " + product3.avaiability);
    }
}
