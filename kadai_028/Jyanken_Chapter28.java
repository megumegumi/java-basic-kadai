package kadai_028;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter28{
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
	System.out.println("自分のじゃんけんの手を入力しましょう");
	System.out.println("グーはrockのrを入力しましょう");
	System.out.println("チョキはscissorsのsを入力しましょう");
	System.out.println("パーはpaperのpを入力しましょう");
	try (Scanner scanner = new Scanner(System.in)) {
		String input = scanner.nextLine();
		System.out.println(input);
		if (input.equals("r")||input.equals("s")||input.equals("p")) {//equalsは文字列の中身が提示しているものと一致するかチェックするコード
			System.out.print("正しい");//||はどちらかが正しければtrue
		}else {
				System.out.print("正しくない");
			}
		
		return input;
	}
	}
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		for (int i = 0 ; i < 3; i++){//一定の範囲に含まれるランダムに返される値のコード３未満と指定あり
			System.out.println(Math.round(Math.random() * 3));
		}
		return null;
	}
	//じゃんけんを行う
		public void playGame(String myChoice, String random) {
			HashMap<String, String> hand = new HashMap<String,String>();
			String myHand = getMyChoice();
			String yourHand = getRandom();
			hand.put("r", "グー");
			hand.put("s", "チョキ");
			hand.put("p", "パー");
			
			System.out.println("自分の手は" + hand.get(myHand) + "です");
	        System.out.println("対戦相手手は" + hand.get(yourHand) + "です");
	        //じゃんけん結果の出力
	        if(myHand.equals(yourHand)) {//文字同士の比較はequalsを使う
	            System.out.println("あいこです");
	        //自分が r    
	        } else if(myHand.equals("r")) {//else if条件が一つでない場合に使う
	            if(yourHand.equals("s")) {
	                System.out.println("自分の勝ちです");
	            } else {
	                System.out.println("自分の負けです");
	            }
	        //自分が s    
	        } else if(myHand.equals("s")) {
	            if(yourHand.equals("p")) {
	                System.out.println("自分の勝ちです");
	            } else {
	                System.out.println("自分の負けです");
	            }
	        //自分が p    
	        } else if (myHand.equals("p")) {
				}{
	            if(yourHand.equals("r")) {
	                System.out.println("自分の勝ちです");
	            } else {
	                System.out.println("自分の負けです");
	            }
	        }
	    }

	    
	    
	
			
}

