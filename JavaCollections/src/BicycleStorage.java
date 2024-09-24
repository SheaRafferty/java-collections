import java.util.List;
import java.util.ArrayList;

public class BicycleStorage {
List <Bicycle> bicycles;

public BicycleStorage() {
	bicycles = new ArrayList<Bicycle>();
}

public void addBicycle(Bicycle b) {
	bicycles.add(b);
	
}

public void removeBicycle(int pos) {
	bicycles.remove(pos);
}

public Bicycle getBicycle(int pos) {
	return bicycles.get(pos);
	
}

}
