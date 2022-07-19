public class Hangar {
    public static void main(String[] args) {
        Vehicle[] collection = {
            new Car("Mercedes", 120000),
            new Boat("Beneteau", 300000)
        };

        for (Vehicle piece : collection)
            System.out.println(piece.doStuff());
    }
}
