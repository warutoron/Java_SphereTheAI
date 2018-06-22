package sphereParts;
import javax.swing.JTextArea;

public class SpheresInstitution {
	
	static ArrayDataBuilder adb = new ArrayDataBuilder();
	Message msg = new Message();
	
	/**
	 * スフィアの気持ち
	 */
	public void sphereConclusion(String[] items,JTextArea sfia,String ideas){
		
		// 心境計算
		Sphere.stateOfMind();
		// 今の気分を返す
		boolean mind = Sphere.i_So();
		// 気分情報をメッセージに反映させる
		msg.basicMessage(items, sfia,mind,ideas);
		
	}
	
	/**
	 * スフィア「あれ？私、何て言ったんだっけ？」
	 */
	public static String[] whatMySay(String mySay){
		
		// 私の会話内容をミンチにして配列に格納
		String[] message = adb.messageReorganization(mySay);
		// 私の知ってる単語を一個ずつ摘出
		String[] item = adb.loadAndCreate("vocaburary");
		// その中で私が知っている単語と合致したものをピックアップ
		String[] sfiaItem = adb.searchAndMake(item, message);
		
		// これを返す
		return sfiaItem;
	}
	
}