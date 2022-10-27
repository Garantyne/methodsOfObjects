public class Main {

    public static void main(String[] args) {
        Author pitherHamilton = new Author("Pither", "Hamilton");
        Author richardMorgan = new Author("Richard", "Morgan");

        Book temporalVoid = new Book("Temporal void", pitherHamilton, 2016);
        Book blackHuman = new Book("Black Human", richardMorgan, 2015);
        System.out.println("Темпоральная бездна первый год издания " + temporalVoid.yearPublic);
        temporalVoid.setYearPublic(2022);
        System.out.println("Темпоральная бездна первый год издания " + temporalVoid.yearPublic);
        richardMorgan.printFulName();
        richardMorgan.setFirstName("Andreano");
        richardMorgan.setLastName("Chelentano");
        richardMorgan.printFulName();
        System.out.println(temporalVoid.toString());
        System.out.println(pitherHamilton.equals(richardMorgan));
        System.out.println(pitherHamilton.hashCode());


    }
}