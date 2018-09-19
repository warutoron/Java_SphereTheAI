package sphereParts;
import java.util.Random;

public class Sphere {
	// AIの情報
	private static String name = "スフィア";
	private String age;
	private String height;
	private String weight;
	private String birthday;
	// スフィアの基本倫理
	private static int iSoParam = 200;
	// 基本感情要素
	private static int funny;
	private static int sad;
	private static int angly;
	// 現在の感情
	private static int totalEmotion;
	// 現在コンタクト中ユーザー名
	private static String userName;
	// データビルダインスタンス作成
	ArrayDataBuilder adb = new ArrayDataBuilder();
	// ファイルローダーインスタンス生成
	FileLoaderFactory fl = new FileLoaderFactory();
	// ランダム
	Random rand = new Random();

	/**
	 * 現在の心境値計算
	 */
	public static void stateOfMind(){
		setTotalEmotion(getFunny() - getAngly());
	}

	/**
	 *  意思決定メソッド
	 *  */
	public static boolean i_So(){

		// totalEmotion ･･･ 感情を数値としてまとめたもの
		// iSoParam ･･･ スフィアが元から持っている感情尺度(※変化予定)

		if (totalEmotion >= iSoParam) {
			// 許せる
			return true;
		} else {
			// 許せない
			return false;
		}
	}

	/**
	 *  メッセージをいくつか生成
	 * @return
	 */
	public String[] sphereCreateMessages() {

		// 名詞
		String[] vocBox = fl.voc_list();
		// 動詞
		String[] varBox = fl.voc_varb();
		// 語尾
		String[] endedBox = fl.voc_end();
		// 注意単語
		//String[] misBox = fl.voc_miss();
		// ユーザの発言
		//String[] usrsBox = fl.voc_userSay();

		// 各助詞(arrange)
		String[] arangeBox = fl.pos_arrange();
		// 並列助詞(standing)
		String[] standingBox = fl.pos_standing();
		// 副助詞(assistant)
		String[] assistantBox = fl.pos_assistant();
		// 係助詞(charge)
		String[] chargeBox = fl.pos_charge();
		// 接続助詞(connectiong)
		String[] connectingBox = fl.pos_connecting();
		// 終助詞(end)
		String[] endBox = fl.pos_end();
		
		// メッセージ収納用配列を作成
		String[] messageBox = new String[100];

		// ランダムに100個メッセージ生成
		for (int i=0; i < 100; i++) {
			
			// 動詞・名詞・語尾
			String voc1 =vocBox[rand.nextInt(vocBox.length)];
			String voc2 =vocBox[rand.nextInt(vocBox.length)];
			String var1 =varBox[rand.nextInt(varBox.length)];
			String var2 =varBox[rand.nextInt(varBox.length)];
			String ending =endedBox[rand.nextInt(endedBox.length)];
			
			/** 助詞 **/
			String arrange = arangeBox[rand.nextInt(arangeBox.length)];
			String standing = standingBox[rand.nextInt(standingBox.length)];
			String assistant = assistantBox[rand.nextInt(assistantBox.length)];
			String charge = chargeBox[rand.nextInt(chargeBox.length)];
			String connecting = connectingBox[rand.nextInt(connectingBox.length-1)];
			String end = endBox[rand.nextInt(endBox.length)];
			
			/** 上記の助詞をミックス **/
			String[] mixxer1 = {arrange,standing,assistant,charge,connecting};
			/** 動詞と名詞もミックス **/
			String[] mixxer2 = {voc1,var1};
			String[] mixxer3 = {var2,voc2};
			
			/**
			 * メッセージを生成
			 */
			String judgem = mixxer2[rand.nextInt(2)] + mixxer1[rand.nextInt(2)] + 
					                 mixxer3[rand.nextInt(2)] + 
					                 end /*ending*/;
			messageBox[i] = judgem;
//			for (int j=0; j < misBox.length; j++) {
//				if (!(judgem.equals(misBox[i]))) {
//					messageBox[j] = judgem;
//				}
//			}
		}
		return messageBox;
	}

	/** データセット・ゲット*/
	public static String getName(){return name;}
	public String getAge(){return this.age;}
	public String getHeight(){return this.height;}
	public String getWeight(){return this.weight;}
	public String getBirthday(){return this.birthday;}

	/** コンタクトユーザー名セット・ゲット */
	public static void setUser(String newUser){userName = newUser;}
	public static String getUser(){return userName;}

	/** 感情セット・ゲット*/
	public static void setFunny(int funy){funny += funy;}
	public static int getFunny(){return funny;}
	public static void setSad(int sd){sad += sd;}
	public static int getSad(){return sad;}
	public static void setAngly(int ang){angly += ang;}
	public static int getAngly(){return angly;}
	public static void setTotalEmotion(int te){totalEmotion += te;}
	public static int getTotalEmotion(){return totalEmotion;
	}
}
