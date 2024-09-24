import java.util.ArrayList;

public class DroneController {

	ArrayList<Drone> activeDrones;
	ArrayList<Drone> dronesInRange;
	
	int maxDrones;
	int posX, posY;
	int signalRange;
	
	 DroneController(int max, int x, int y, int range) {
		
		maxDrones = max;
		posX = x;
		posY = y;
		signalRange = range;
		
		
		activeDrones = new ArrayList<>();
		dronesInRange = new ArrayList<>();
	
	 }
	
	
	void signalDrone(String message, int ID) {
		if (dronesInRange.isEmpty()) {
			System.out.println("No drones in range");
			return;
		}
		
		for (int i = 0; i < dronesInRange.size(); i++) {
			if (dronesInRange.get(i).ID == ID) {
				dronesInRange.get(i).message = message;
			}
		}
		
	}
	
	void signalDeploy(DroneDepot depot) {
		if(activeDrones.size() < maxDrones) {
			activeDrones.add(depot.deployDrone(0, 0, 0, null));
		}
		else {
			System.out.println("Maximum amount of drones reached");
		}
	}
	
	void scanRange() {
		int dist = 0;
		for (Drone d : activeDrones) {
			dist = (Math.abs(posX - d.posX) + (Math.abs(posY - d.posY)));
			if (dist < signalRange) {
				if (!dronesInRange.contains(d)) {
					dronesInRange.add(d);
				}
			}
			else {
				dronesInRange.remove(d);
			}
		}
	}
}
	
	