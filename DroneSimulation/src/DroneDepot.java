
public class DroneDepot {

int posX, posY;

int nextID = 0;

public DroneDepot(int x, int y) {
posX = x;
posY = y;
}

public Drone deployDrone (int spd, int range, int limit, String m) {
	

return new Drone (++nextID, posX, posY, spd, range, limit, m);

}

}