import java.util.ArrayList;
import java.util.List;

class Lion extends Animal {}
class Crane extends Animal {}

public class ZooApp {
    public static void main(String[] args) {
        List<Animal> zoo1 = new ArrayList<>();
        zoo1.add(new Lion());
        zoo1.add(new Crane());

        List<Animal> zoo2 = new ArrayList<>();

        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(zoo1, zoo2);

        for (Animal a : zoo2) {
            System.out.println(a.getName());
        }
    }
}


