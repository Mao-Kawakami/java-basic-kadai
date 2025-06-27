package kadai_028;

import java.util.HashMap;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// インスタンスを作成
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		// 自分のじゃんけんの手を入力
		String myChoice = jyanken.getMyChoice();
		// 対戦相手のじゃんけんの手をランダムで選ぶ
		String enemyChoice = jyanken.getRandom();
		// HashMapを作る
		HashMap<String, String> choices = new HashMap<String, String>();
		choices.put("myChoice", myChoice);
		choices.put("enemyChoice", enemyChoice);
		// じゃんけんを実行
		jyanken.playGame(choices);
	}

}
