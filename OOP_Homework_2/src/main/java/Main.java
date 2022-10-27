/*
There is an interface Measurable:
    public interface Measurable {
        double getMeasure();
    }
Write and test a method:

public static Measurable maximum(Measurable[] objects)
that returns the object with the largest measure.
Use that method to determine the country with the largest area from an array of countries.
*/

public class Main {
    public static void main(String[] args) {
        Country[] country = {
                new Country("Latvia", 64.589),
                new Country("Estonia", 45.339),
                new Country("Lithuania", 65.300)
        };

        Measurable maximum = Country.maximum(country);
        Country largestCountry = (Country) maximum;
        System.out.println("Largest Country: " + largestCountry.getName() + " " + largestCountry.getTerritory() + "km²\n");
    }
}
