package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

class Jyanken_Chapter28 {
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		boolean check;
		String myChoice;
		Scanner scanner = new Scanner(System.in);
		// ガイドを表示
		System.out.println("自分のじゃんけんの手を入力しましょう");
		do {
			// ガイドを表示
			System.out.println("以下のいずれかを入力しましょう");
			System.out.println("｜「r」：グー（rock）");
			System.out.println("｜「s」：チョキ（scissors）");
			System.out.println("｜「p」：パー（paper）");
			// 入力させる
			myChoice = scanner.next();
			
			// 判定
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				check = true;
			} else {
				check = false;
			}
		} while (!check);
		scanner.close();
		return myChoice;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] choices = {"r", "s", "p"};
		double enemyChoice = Math.floor(Math.random() * 3);
		return choices[(int)enemyChoice];
	}
	
	// じゃんけんを行う
	public void playGame(HashMap<String, String> choices) {
		String winMessage = "自分の勝ちです";
		String loseMessage = "自分の負けです";
		// 自分と相手の手を表示
		System.out.println("｜自分の手：" + getChoiceJapanese(choices.get("myChoice")));
		System.out.println("｜対戦相手の手：" + getChoiceJapanese(choices.get("enemyChoice")));
		// あいこのチェック
		if (choices.get("myChoice").equals(choices.get("enemyChoice"))) {
			System.out.println("あいこです");
		}
		// 勝敗のチェック
		if (choices.get("myChoice").equals("r")) {
			if (choices.get("enemyChoice").equals("s")) {
				System.out.println(winMessage);
			} else if (choices.get("enemyChoice").equals("p")) {
				System.out.println(loseMessage);
			}
		} else if (choices.get("myChoice").equals("s")) {
			if (choices.get("enemyChoice").equals("p")) {
				System.out.println(winMessage);
			} else if (choices.get("enemyChoice").equals("r")) {
				System.out.println(loseMessage);
			}
		} else if (choices.get("myChoice").equals("p")) {
			if (choices.get("enemyChoice").equals("r")) {
				System.out.println(winMessage);
			} else if (choices.get("enemyChoice").equals("s")) {
				System.out.println(loseMessage);
			}
		}
	}
	
	// 入力内容を日本語に変換
	public String getChoiceJapanese(String choice) {
		String result = "";
		if (choice.equals("r")) {
			result = "グー";
		} else if (choice.equals("s")) {
			result = "チョキ";
		} else if (choice.equals("p")) {
			result = "パー";
		}
		return result;
	}
}
