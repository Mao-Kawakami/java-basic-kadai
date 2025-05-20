package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// インスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる単語
		String[] words = {"apple", "banana", "grape", "orange"};
		
		// 調べる
		dictionary.search(words);
	}

}
