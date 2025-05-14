package kadai_015;

class Car_Chapter15 {
	// フィールド
	private int gear = 1;
	private int speed = 10;
	
	// メソッド
	// ギアチェンジをする
	public void gearChange(int afterGear) {
		// 変更前を記録
		int beforeGear = gear;
		// 値を変更
		gear = afterGear;
		switch(gear) {
			case 1	-> speed = 10;
			case 2	-> speed = 20;
			case 3	-> speed = 30;
			case 4	-> speed = 40;
			case 5	-> speed = 50;
			default	-> speed = 10;
		}
		// 表示
		System.out.println("ギア" + beforeGear + "から" + gear + "に切り替えました");
	}
	
	// 速度を表示する
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
