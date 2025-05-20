package kadai_021;

import java.util.HashMap;

class Dictionary_Chapter21 {
	// 辞書
	HashMap<String, String> dictionaryMap = new HashMap<>();
	
	// 単語を追加する
	public Dictionary_Chapter21() {
		this.dictionaryMap.put("apple", "りんご");
		this.dictionaryMap.put("peach", "桃");
		this.dictionaryMap.put("banana", "バナナ");
		this.dictionaryMap.put("lemon", "レモン");
		this.dictionaryMap.put("pear", "梨");
		this.dictionaryMap.put("kiwi", "キウィ");
		this.dictionaryMap.put("strawberry", "いちご");
		this.dictionaryMap.put("grape", "ぶどう");
		this.dictionaryMap.put("mascat", "マスカット");
		this.dictionaryMap.put("cherry", "さくらんぼ");
	}
	
	// 単語を調べる
	public void search(String[] keys) {
		for (String key: keys) {
			String value = this.dictionaryMap.get(key);
			if(value == null) {
				// 辞書に存在しない単語
				System.out.println(key + "は辞書に存在しません");
			} else {
				// 辞書に存在する単語
				System.out.println(key + "の意味は" + value);
			}
		}
	}
}
