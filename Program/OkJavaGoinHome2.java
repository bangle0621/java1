import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;


public class OkJavaGoinHome2 {
	
	//Parameter �Ű�����
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + "// HallLamp");
		hallLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
