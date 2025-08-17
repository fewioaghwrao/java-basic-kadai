package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName;//姓を表す
	public String givenName;//名を表す
	public String address;//住所を表す
	
	public void commonIntroduce(){//共通の紹介を出力する
		address="東京都中野区〇×";
		familyName="加藤";
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	abstract public void eachIntroduce() ;//個別の紹介を出力する
	
	public void execIntroduce(){//紹介を実行する
		commonIntroduce();
		eachIntroduce();
	}
	
}
