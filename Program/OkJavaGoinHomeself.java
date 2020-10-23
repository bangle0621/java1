import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeself {

	public static void main(String[] args) {
		
		//엘레베이터 부르기
		Elevator myElevator = new Elevator("APT 1004");
		myElevator.callForUp(1);
		
		//시큐리티 오프
		Security mySecurity = new Security("APT 1004");
		mySecurity.off();
		
				
		//불 켜기
		Lighting hallLamp = new Lighting("APT 1004");
		hallLamp.on();
		
		System.out.println(myElevator);
		
	}

}
