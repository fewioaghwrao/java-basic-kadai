package kadai_015;

public class CarExec_Chapter15 {

	static int aftergear=3;
	public static void main(String[] args) {
		Car_Chapter15 car = new Car_Chapter15(1,aftergear);
		car.changeGear(aftergear);
		car.run();
	}

}
