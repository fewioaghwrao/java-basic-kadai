package kadai_015;

public class Car_Chapter15 {

	private int gear=1;//1速から5速のギアを表す
	private int speed=10;//ギアチェンジ後の速度を表す
	
	public Car_Chapter15(int gear,int afterGear){
        this.gear  = gear;
        gear=afterGear;
        System.out.println("ギア"+this.gear+"から"+gear+"に切り替わりました。");
	}
	
	public void changeGear(int afterGear) {//ギアの値により速度を変える
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
		System.out.println("時速"+speed+"Kmです。");
	}
}
