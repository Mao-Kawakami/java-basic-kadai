package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// インスタンスを生成
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		// 名前を設定
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		// 紹介を実行
		taro.execIntroduce();
		System.out.println("");
		ichiro.execIntroduce();
		System.out.println("");
		hanako.execIntroduce();
	}

}
