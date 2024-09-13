public class Bed {

    private String name;
    private String style;
    private String size;

    public Bed(){
        this("My Bedroom", "Modern", "Full");

    }

    public Bed(String name, String style, String size){
        this.name = name;
        this.style = style;
        this.size = size;
    }
    //getters

    public String getName(){return name;}
    public String getStyle(){return style;}
    public String getSize(){return size;}

    public void make(){
        System.out.println("From Bed class: make() method");
    }
}
