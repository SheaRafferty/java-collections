
public class Drone { 
int ID;
int posX, posY; 
int topspeed; 
int signalRange; 
int payloadLimit; 
String message;
int currentPayload;

public Drone(int id, int x, int y, int speed, int range, int limit) {
ID = id;
posX = x;
posY = y;
topspeed = speed;
signalRange = range;
payloadLimit = limit;
message = " ";
currentPayload = 0;

}

public Drone(int id, int x, int y, int speed, int range, int limit, String m) {
ID = id;
posX = x;
posY = y;
topspeed = speed;
signalRange = range;
payloadLimit = limit;
message = " ";
currentPayload = 0;

}


public void moveX(int dx) {
posX = posX + dx;

}

public void moveY(int dy) {
posY = posY + dy;

}

public void loadPayload (int weight) {
 if (currentPayload + weight <= payloadLimit) {
	 currentPayload += weight;
	 
 }
 
 else {
	 System.out.println("Payload exceeds drone's capabilities");
	 
   }
 
  }
}
