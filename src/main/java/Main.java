import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        var truck1 = new Truck(50);
        var truck2 = new Truck(188);
        var boat1 = new Boat(100);
        var boat2 = new Boat(80);
        var human1 = new Human();
        var human2 = new Human();

        var superTruck = new Truck(350) {
            @Override
            public void move() {
                System.out.println("I'm super truck I can drive with 350km/h");
            }
        };

        List<Mobile> myList = List.of(truck1, truck2, boat1, boat2, human1, human2, superTruck);
        var random2 = genericMethod(myList);
        random2.move();
        print(() -> System.out.println("I cannot run at all"));
        introduce(name -> System.out.println("Hello " + name));
    }

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    public static <T extends Mobile> T genericMethod(List<T> myList) {
        Random random = new Random();

        for (T mobile : myList) {
            if (mobile instanceof Vehicle vehicle) {
                System.out.println("To jest pojazd " + vehicle.getMaxSpeed());
            } else {
                System.out.println("To nie jest pojazd");
            }
        }
        return myList.get(random.nextInt(myList.size()));
    }
}
