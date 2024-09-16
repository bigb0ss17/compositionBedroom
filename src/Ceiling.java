public class Ceiling {

    private double height;
    private String colorOfPaint;

    //constructor


    public Ceiling(double ht, String cp){
        this.height = ht;
        this.colorOfPaint = cp;
    }

    //setters

    //getters
    public double getHeight(){
        return height;
    }
    public String getColorOfPaint(){
        return colorOfPaint;
    }


    //toString()

    public String toString(){
        return height + ", and Color of Paint: " + colorOfPaint;
    }
}
