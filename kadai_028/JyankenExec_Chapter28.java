package kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		Jyanken_Chapter28 chapter28=new Jyanken_Chapter28();
		String myChoice=  chapter28.getMyChoice();
		String yourChoice= chapter28.getRandom();
		chapter28.playGame(myChoice,yourChoice);
	}
}
