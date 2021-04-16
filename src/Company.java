public class Company {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Krzysztof";
        employee1.surname = "Ibisz";
        employee1.birthDay = 1980;
        employee1.seniority = 23;
        String sout1 = employee1.name + ", " + employee1.surname + ", urodzony " + employee1.birthDay + ", ma staż pracy "
                + employee1.seniority + " lat.";

        Employee employee2 = new Employee();
        employee2.name = "Agnieszka";
        employee2.surname = "Kozioł";
        employee2.birthDay = 1990;
        employee2.seniority = 13;
        String sout2 = employee2.name + ", " + employee2.surname + ", urodzona " + employee2.birthDay + ", ma staż pracy "
                + employee2.seniority + " lat.";

        Employee employee3 = new Employee();
        employee3.name = "Karina";
        employee3.surname = "Maj";
        employee3.birthDay = 2000;
        employee3.seniority = 3;
        String sout3 = employee3.name + ", " + employee3.surname + ", urodzony " + employee3.birthDay + ", ma staż pracy "
                + employee3.seniority + " lat.";

        System.out.println(sout1);
        System.out.println(sout2);
        System.out.println(sout3);


    }
}
