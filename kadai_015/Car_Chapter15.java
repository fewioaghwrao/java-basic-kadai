package kadai_015;

public class Car_Chapter15 {

	private int gear=1;//1速から5速のギアを表す
	private int speed=10;//ギアチェンジ後の速度を表す
	private int beforeGear;
	
	public Car_Chapter15(){
	}
	
	public void changeGear(int afterGear) {//ギアの値により速度を変える
		
		beforeGear = gear;
	    gear=afterGear;
	    System.out.println("ギア"+beforeGear+"から"+gear+"に切り替えました");
        speed = switch(afterGear) {
        case 1  -> 10;
        case 2  -> 20;
        case 3  -> 30;
        case 4  -> 40;
        case 5  -> 50;
        default -> 10;
        };
	}
	
	public void run() {//ギアチェンジ後の速度を表示する
		System.out.println("速度は時速"+speed+"kmです");
	}
}
