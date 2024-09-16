public class Lamp {

    //properties

    private String colorOfBulb;
    private double lifeSpan;


    //constructors with only take all attributes (no no-argument constructors)

    public Lamp (String colorOfBulb, double lifeSpan){
        this.colorOfBulb = colorOfBulb;
        this.lifeSpan = lifeSpan;
    }
    //getters
    public String getColorOfBulb(){
        return colorOfBulb;
    }
    public double getLifeSpan(){
        return lifeSpan;
    }

    public void turnOff(){
        System.out.println("Turn off the lamp.");
    }

    public void turnOn(){
        System.out.println("Turn on the lamp.");
    }

    //toString()

    public String toString(){
        return "Color:" + colorOfBulb + ", Life Span: " + lifeSpan;
    }
}
