import java.util.Objects;

public class Country implements Measurable{
    public String name;
    public double territory;

    public Country(String name, double territory) {
        this.name = name;
        this.territory = territory;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTerritory() {
        return territory;
    }
    public void setTerritory(double territory) {
        this.territory = territory;
    }

    public double getMeasure(){
        return territory;
    }

    public static Measurable maximum(Measurable[] objects){
        if (objects.length == 0){
            return null;
        }
        Measurable largest = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if(Objects.isNull(objects[i])) continue;
            Measurable current = objects[i];
            if (current.getMeasure() > largest.getMeasure()){
                largest = current;
            }
        }
        return largest;
    }
}
