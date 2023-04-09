package Paql01;

public class Main {
    private static Container container;
    public static void main(String[] args) {
        container = new Container(123, 123, "prueba", true, 1, "prueba", "prueba","prueba");
        Hub hub=new Hub();
        hub.display(container.getIdentifierNumber(), container);
    }
    public static Container getContainer(){
        return container;
    }

}