import java.util.List;

class Animal {
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

public class Zoo<T extends Animal> {
    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
        source.clear();
    }
}
