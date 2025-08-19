package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public String getMyChoice() {
		String result="";
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		

		      //Scannerクラスのオブジェクトを生成する
		      Scanner scanner = new Scanner(System.in);
				
		      while(result.equals("")) {
		      //入力した内容を取得する
		      String input = scanner.next();

		      if(input.equals("r") || input.equals("s")|| input.equals("p")) {
		    	  result=input;
		    	  scanner.close();
		    	  break;
		      }else {
		    	  System.out.println("入力した内容が正しくありません");
		      }
		      }
		
		return result;
	}
	
	public String getRandom() {
		  String[]   yourhand = { "r", "s", "p"};
	      int selectYourhand =(int)Math.floor(Math.random() * 3);
		return yourhand[selectYourhand];
	}
	
	public void playGame(String myChoice,String yourChoice) {
	    HashMap<String,String> rockpaperscissors = new HashMap<String,String>();

	    rockpaperscissors.put("r","グー");
	    rockpaperscissors.put("s","チョキ");
	    rockpaperscissors.put("p","パー");
	    
		System.out.println("自分の手は"+rockpaperscissors.get(myChoice)+"対戦相手の手は"+rockpaperscissors.get(yourChoice));
		
		if(myChoice.equals(yourChoice)) {
			System.out.println("あいこです");
		}else if((myChoice.equals("r") && yourChoice.equals("s")) || (myChoice.equals("s") && yourChoice.equals("p")) ||(myChoice.equals("p") && yourChoice.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
