import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHomeself {

	public static void main(String[] args) {
		
		//���������� �θ���
		Elevator myElevator = new Elevator("APT 1004");
		myElevator.callForUp(1);
		
		//��ť��Ƽ ����
		Security mySecurity = new Security("APT 1004");
		mySecurity.off();
		
				
		//�� �ѱ�
		Lighting hallLamp = new Lighting("APT 1004");
		hallLamp.on();
		
		System.out.println(myElevator);
		
	}

}
