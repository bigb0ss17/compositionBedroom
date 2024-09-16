public class BuildMyBedroom {
    public static void main(String[] args) {

        //public Bedroom(String name, Wall w1, Wall w2, Wall w3, Wall w4, Ceiling ceiling, Bed bd, Lamp lm){

        String name = "Max: ";
        Wall w1 = new Wall("North");
        Wall w2 = new Wall ("South");
        Wall w3 = new Wall("East");
        Wall w4 = new Wall("West");

        Ceiling ceiling = new Ceiling(50, "Blue");

        Lamp lamp = new Lamp("Orange", 5000);

        //Bed bed = new Bed("Rooms to go", "Modern", "King");



        Bedroom max = new Bedroom(name, w1, w2, w3, w4, ceiling, new Bed("Rooms to Go", "Modern", "King"), lamp);

        System.out.println(max);

    }
}
