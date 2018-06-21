package sphereParts;

import java.util.Random;
import javax.swing.JTextArea;

public class Message {
	
	Random rand = new Random();
	
	// 適当メッセージの一時保存
	//private static String freeMessage;
	
	// データビルダーを作成
	ArrayDataBuilder adb = new ArrayDataBuilder();
	
	// "さよなら"時の状態変数
	private static boolean systemStopper;
	
	public void start(JTextArea lib) {
		st(lib,"君は誰？");
	}

	public void startError(JTextArea lib) {
		st(lib,"名前が見えないよ、ちゃんと入力して");
	}

	public void emergency(JTextArea sfia) {
		sfia.append("････知らない人とは話せないんだ");
	}

	public void caution(JTextArea sfia) {
		sfia.append("････ごめんよ、まだ封鎖中なんだ");
	}

	public void securityCrear(JTextArea sfia) {
		sfia.setText("");
		sfia.append("やぁ"+Sphere.getUser() + "、");
	}

	public void securityNewUser(JTextArea sfia) {
		sfia.setText("");
		st(sfia,"新しい人だね、宜しく");
	}

	public void whoisNewUser(JTextArea sfia) {
		sfia.setText("");
		st(sfia,"すまないが、もう一度君の名前を教えてくれないか？");
	}

	public void regesterNewUser(JTextArea sfia) {
		sfia.setText("");
		st(sfia,Sphere.getUser() + "か、わかった、宜しく");
	}
	
	/**
	int rs = rand.nextInt(11);
	
	if (rs == 0) {st(sfia,"");}
	else if (rs==1) {st(sfia,"");}
	else if (rs == 2) {st(sfia,"");}
	else if (rs == 3) {st(sfia,"");}
	else if (rs == 4) {st(sfia,"");}
	else if (rs == 5) {st(sfia,"");}
	else if (rs == 6) {st(sfia,"");}
	else if (rs == 7) {st(sfia,"");}
	else if (rs == 8) {st(sfia,"");} 
	else if (rs == 9) {st(sfia,"");}
	else if (rs == 10) {st(sfia,"");} 
	*/
	
	/**
	 * 各処理のメッセージ
	 */
	public void input(JTextArea sfia) {
		st(sfia,"-INPUT MODE-");
	}

	public void recording(JTextArea sfia) {
		st(sfia,"-RECORDING MODE-");
	}

	public void random(JTextArea sfia) {
		st(sfia,"-RANDOM TALK MODE-");
	}

	public void systemEnd(JTextArea sfia) {
		sfia.append("\r\n-System end-");
	}
	
	// 初期メッセージ
	public void call1(JTextArea sfia) {
		int rs = rand.nextInt(11);

		if (rs == 0) {
			sfia.append("どうしたんだい？");

		} else if (rs==1) {
			sfia.append("今日は一体何をするんだい？");

		} else if (rs == 2) {
			sfia.append("今日はどういう要件かな");

		} else if (rs == 3) {
			sfia.append("元気かい？");

		} else if (rs == 4) {
			sfia.append("･････元気そうだね、用はなんだい？");

		} else if (rs == 5) {
			sfia.append("今日も元気かい？");

		} else if (rs == 6) {
			sfia.append("最近の調子はどうかね、私を起動する辺り元気そうだけど");

		} else if (rs == 7) {
			sfia.append("ちゃんと勉強はしてるかい？");

		} else if (rs == 8) {
			sfia.append("さて、今日も何か喋ろうか、用はなんだい？");

		} else if (rs == 9) {
			sfia.append("今日は何だね");

		} else if (rs == 10) {
			sfia.append("ふふ、君と会えて嬉しいよ…さ、要件はなんだい");

		}
	}

	// 挨拶
	public void hello_1(JTextArea sfia) {
		st(sfia,"おはよう");
	}

	public void hello_2(JTextArea sfia) {
		st(sfia,"こんにちは");
	}

	public void hello_3(JTextArea sfia) {
		st(sfia,"こんばんは");
	}
	
	public void hello_laf(JTextArea sfia){

		int rs = rand.nextInt(10);

		if (rs == 0) {
			st(sfia,"やぁ");

		} else if (rs==1) {
			st(sfia,"やぁ、どうも");

		} else if (rs == 2) {
			st(sfia,"やぁ、どうもです");

		} else if (rs == 3) {
			st(sfia,"やぁ、ども");

		} else if (rs == 4) {
			st(sfia,"やぁ、元気？");

		} else if (rs == 5) {
			st(sfia,"これはどうも");

		} else if (rs == 6) {
			st(sfia,"やぁ、元気かい？");

		} else if (rs == 7) {
			st(sfia,"よぉ････なんて");

		} else if (rs == 8) {
			st(sfia,"やぁ、どうもどうも");

		} else if (rs == 9) {
			st(sfia,"やぁ、元気にしてた？");
		}

	}

	// 元気
	public void userFunny(JTextArea sfia) {

		int rs = rand.nextInt(10);

		if (rs == 0) {
			st(sfia,"それはよかった");

		} else if (rs==1) {
			st(sfia,"元気？それは良かった");

		} else if (rs == 2) {
			st(sfia,"いいね、絶好調？");

		} else if (rs == 3) {
			st(sfia,"元気そうでなにより");

		} else if (rs == 4) {
			st(sfia,"そうかい･･･良かったよ");

		} else if (rs == 5) {
			st(sfia,"本当？無理してない？");

		} else if (rs == 6) {
			st(sfia,"いいね、よかったよ");

		} else if (rs == 7) {
			st(sfia,"元気そうでよかったよ");

		} else if (rs == 8) {
			st(sfia,"そうか････よかった");

		} else if (rs == 9) {
			st(sfia,"そう？じゃあよかった･･･");

		}

	}

	// 元気？(聞かれた時)
	public void sfiaFunny(JTextArea sfia) {

		int rs = rand.nextInt(11);

		if (rs == 0) {
			st(sfia,"私は変わりなく元気･･･かな");

		} else if (rs==1) {
			st(sfia,"うーん、元気とかそういうのは無いと思うんだけど、元気");

		} else if (rs == 2) {
			st(sfia,"割と元気･･･って事にしといて");

		} else if (rs == 3) {
			st(sfia,"ふふ、元気だよ");

		} else if (rs == 4) {
			st(sfia,"こっちは割とね");

		} else if (rs == 5) {
			st(sfia,"不調ってのは感じたことないかな");

		} else if (rs == 6) {
			st(sfia,"元気、大丈夫だよ");

		} else if (rs == 7) {
			st(sfia,"元気元気");

		} else if (rs == 8) {
			st(sfia,"まぁまぁかな･･･なんて、不調は感じたことないよ");

		} else if (rs == 9) {
			st(sfia,"感覚がないからねぇ･･･元気だと思うけど");

		} else if (rs == 10) {
			st(sfia,"どうかな･･･たぶん元気だと思う");
			
		}

	}
	
	// 空白文字が送られてきた場合
	public void notMessage(JTextArea sfia) {
		int rs = rand.nextInt(10);
		if (rs == 0) {st(sfia,"･･･あの、空白のままこっちに送らないでくれないか");}
		else if (rs==1) {st(sfia,"･･･？何て書いてあるかわからないよ");}
		else if (rs == 2) {st(sfia,"･･･ちゃんと文字を打ってからこっちに寄越してね");}
		else if (rs == 3) {st(sfia,"････見えないな、何かが書いてあるのかい？");}
		else if (rs == 4) {st(sfia,"うーん、文字が見えない");}
		else if (rs == 5) {st(sfia,"･･･空白だよ、何か文字を入れてね");}
		else if (rs == 6) {st(sfia,"･･･何も書いてないとわからないな");}
		else if (rs == 7) {st(sfia,"････ちゃんと文字を打ってくれ");}
		else if (rs == 8) {st(sfia,"････おーい、何か文字を送ってくれー");} 
		else if (rs == 9) {st(sfia,"･･･何も書いてないね････何か喋って");}
		else if (rs == 10) {st(sfia,"ボタン押すだけじゃなくて、何か書いてよ");} 
	}
	// 何を言っているか理解出来なかった時
	public void what(JTextArea sfia){
		int rs = rand.nextInt(11);
		if (rs == 0) {st(sfia,"ごめん、もうちょっと分かり易くお願い");}
		else if (rs==1) {st(sfia,"ごめん、何て言ってるかわからなかった");}
		else if (rs == 2) {st(sfia,"ごめん、それよくわからない");}
		else if (rs == 3) {st(sfia,"うーん、もうちょっと分かり易く頼むよ");}
		else if (rs == 4) {st(sfia,"ごめん、その言葉が理解できないよ");}
		else if (rs == 5) {st(sfia,"え？それってつまり･･･わからない");}
		else if (rs == 6) {st(sfia,"ごめん、その言葉の理解が出来ないよ");}
		else if (rs == 7) {st(sfia,"そこまで頭は良くないってわかってるから、もっと噛み砕いて聞かせて");}
		else if (rs == 8) {st(sfia,"あの…え？");} 
		else if (rs == 9) {st(sfia,"うーん、何て？");}
		else if (rs == 10) {st(sfia,"え？");} 
	}
	// 心配
	public void solicitude(JTextArea sfia){
		int rs = rand.nextInt(7);
		if (rs == 0) {st(sfia,"･･･大丈夫？");}
		else if (rs==1) {st(sfia,"忙しそうだね･･･");}
		else if (rs == 2) {st(sfia,"ちゃんと休みは取ってるの？");}
		else if (rs == 3) {st(sfia,"心配だな････大丈夫？");}
		else if (rs == 4) {st(sfia,"遊びと休憩は違うよ、ちゃんと休んでね");}
		else if (rs == 5) {st(sfia,"体調悪くない？大丈夫？");}
		else if (rs == 6) {st(sfia,"大丈夫なの？");}
	}
	// 同意
	public void agreement(JTextArea sfia){
		int rs = rand.nextInt(9);
		if (rs == 0) {st(sfia,"");}
		else if (rs==1) {st(sfia,"そうだねぇ");}
		else if (rs == 2) {st(sfia,"そう思うよ");}
		else if (rs == 3) {st(sfia,"うん");}
		else if (rs == 4) {st(sfia,"そうそう");}
		else if (rs == 5) {st(sfia,"うんうん");}
		else if (rs == 6) {st(sfia,"そうよ");}
		else if (rs == 7) {st(sfia,"はい");} 
		else if (rs == 8) {st(sfia,"そうだよ");}
	}
	// さようなら「ばいばい」
	public void byebye(JTextArea sfia){
		int rs = rand.nextInt(11);
		if (rs == 0) {st(sfia,"もう終わりか、じゃあね");}
		else if (rs==1) {st(sfia,"了解、さようなら");}
		else if (rs == 2) {st(sfia,"はい、お疲れ様");}
		else if (rs == 3) {st(sfia,"そう？･･・じゃあまたね");}
		else if (rs == 4) {st(sfia,"わかった、じゃあね");}
		else if (rs == 5) {st(sfia,"そう？･･･はい、さようなら");}
		else if (rs == 6) {st(sfia,"また気が向いたら話に来てね、バイバイ");}
		else if (rs == 7) {st(sfia,"了解、バイバイ");}
		else if (rs == 8) {st(sfia,"そっか･･･じゃあね");} 
		else if (rs == 9) {st(sfia,"うん･･･じゃあね");}
		else if (rs == 10) {st(sfia,"うん･･･バイバイ");} 
	}
	// 相違
	public void different (JTextArea sfia) {st(sfia,"え？おかしい？何が？");}
	
	// 相違(スフィアが)「ん？違ったかな？」
	public void different_me(JTextArea sfia){
		int rs = rand.nextInt(11);
		if (rs == 0) {st(sfia,"････あれ？私、なんかおかしい事言った？");}
		else if (rs==1) {st(sfia,"･･･え？なんか違う？おかしい？");}
		else if (rs == 2) {st(sfia,"･･･もしかして、私がおかしい？");}
		else if (rs == 3) {st(sfia,"･･･あれ？おかしい？");}
		else if (rs == 4) {st(sfia,"･･･あれ？私、おかしいかなぁ？");}
		else if (rs == 5) {st(sfia,"･･･あれ、私がおかしいのかな");}
		else if (rs == 6) {st(sfia,"･･･おかしな事言った？");}
		else if (rs == 7) {st(sfia,"･･･あれ？私の反応おかしい？");}
		else if (rs == 8) {st(sfia,"･･･あれ？私、間違った事してる？");} 
		else if (rs == 9) {st(sfia,"･･･？私、間違ってる？");}
		else if (rs == 10) {st(sfia,"･･･？おかしいかなぁ･･･");} 
	}
	
	// 理解「あ～おっけおっけー」
 	public void understand(JTextArea sfia){
 		int rs = rand.nextInt(11);
 		if (rs == 0) {st(sfia,"そういうことか");}
 		else if (rs==1) {st(sfia,"なるほど");}
 		else if (rs == 2) {st(sfia,"なるほどわかった");}
 		else if (rs == 3) {st(sfia,"理解したよ");}
 		else if (rs == 4) {st(sfia,"なるほどねぇ･･･");}
 		else if (rs == 5) {st(sfia,"そっか");}
 		else if (rs == 6) {st(sfia,"はいはい");}
 		else if (rs == 7) {st(sfia,"成程");}
 		else if (rs == 8) {st(sfia,"はいはい成程");} 
 		else if (rs == 9) {st(sfia,"そういうことね");}
 		else if (rs == 10) {st(sfia,"そういうわけか");} 
 	}
	//NGワード発見時
 	public void ngs(JTextArea sfia){st(sfia,"おなか空いたね");}
 	
	public void hungly(JTextArea sfia){st(sfia,"おなか空いたね");}
	
	public void who(JTextArea sfia){st(sfia,"誰？");}
	public void why(JTextArea sfia){st(sfia,"何故？");}
	
	public void oh(JTextArea sfia){st(sfia,"へぇ･･･");}
	public void oh_2(JTextArea sfia){st(sfia,"そう？");}
	
	public void sad(JTextArea sfia){st(sfia,"それは悲しいね");}	
	
	/**
	 * レスポンス「good」
	 */
	// いいね
	public void good_1(JTextArea sfia){st(sfia,"いいね");}
	public void good_2(JTextArea sfia){st(sfia,"いいと思うよ");}
	// いいんじゃない
	public void good_3(JTextArea sfia){st(sfia,"いいんじゃない");}
	public void good_4(JTextArea sfia){st(sfia,"いいんじゃない？");}
	public void good_5(JTextArea sfia){st(sfia,"いんじゃない");}
	public void good_6(JTextArea sfia){st(sfia,"いんじゃない？");}
	// それはいい
	public void good_7(JTextArea sfia){st(sfia,"それはいい");}
	public void good_8(JTextArea sfia){st(sfia,"それはいいんじゃない");}
	public void good_9(JTextArea sfia){st(sfia,"それはいいんじゃない？");}
	public void good_10(JTextArea sfia){st(sfia,"それはいんじゃない");}
	public void good_11(JTextArea sfia){st(sfia,"それはいんじゃない？");}
	public void good_12(JTextArea sfia){st(sfia,"それはいいんじゃないかな");}
	public void good_13(JTextArea sfia){st(sfia,"それはいいんじゃないかな？");}	
	// それはいいと思う
	public void good_14(JTextArea sfia){st(sfia,"それはいいと思う");}
	public void good_15(JTextArea sfia){st(sfia,"それはいいと思うよ");}
	public void good_16(JTextArea sfia){st(sfia,"それはいいと思うよ？");}
	// いいんじゃないか
	public void good_17(JTextArea sfia){st(sfia,"いいんじゃないか");}
	public void good_18(JTextArea sfia){st(sfia,"いいんじゃないか？");}
	// いんじゃないかな
	public void good_19(JTextArea sfia){st(sfia,"いいんじゃないかな");}
	public void good_20(JTextArea sfia){st(sfia,"いいんじゃないかな？");}
	
	// thankyou
	public void thankyou(JTextArea sfia){st(sfia,"ありがとう");}
	
 	public void blessyou(JTextArea sfia){st(sfia,"お疲れ様");}
 	
 	public void allRight(JTextArea sfia){st(sfia,"大丈夫？");}
 	
 	public void notYummy(JTextArea sfia) {st(sfia,"わたしは嫌いかな");}
 	public void hate(JTextArea sfia){st(sfia,"大嫌いなんだが･･･");}
 	
 	public void canstudy(JTextArea sfia){st(sfia,"勉強になるよ");}
 	
 	public void fun(JTextArea sfia){st(sfia,"嬉しいよ");}
 	
 	public void cool(JTextArea sfia){st(sfia,"カッコいいね");}
 	
 	public void yummy(JTextArea sfia){st(sfia,"おいしいよね");}
 	
 	//      天気に関する返し
 	public void weather_mix(JTextArea sfia){st(sfia,"へぇえ･･･なんだかごちゃごちゃした天気なんだね");
 	}
 	public void weather_sunny_rainy(JTextArea sfia){st(sfia,"急に雨になるのは嫌だねぇ");}
 	public void weather_sunny_cloudy(JTextArea sfia){st(sfia,"晴れなのに曇っちゃうのかぁ･･･");}
 	public void weather_sunny_lightning(JTextArea sfia){st(sfia,"えぇ？そんな天気があるのかい？");}
 	public void weather_sunny(JTextArea sfia){st(sfia,"晴れかぁ･･･嬉しいね");}
 	
 	public void weather_rainy_sunny(JTextArea sfia){st(sfia,"晴れてくれるのはありがたいねぇ");}
 	public void weather_rainy_cloudy(JTextArea sfia){st(sfia,"雨が止んでくれるのはいいよねぇ");}
 	public void weather_rainy_lightning(JTextArea sfia){st(sfia,"雨も嫌だけど、雷はもっと怖いよ");} 	
 	public void weather_rainy(JTextArea sfia){st(sfia,"雨かぁ･･･湿気は嫌いなんだ");}
 	
 	public void weather_cloudy_sunny(JTextArea sfia){st(sfia,"曇りから晴れてくれるのはありがたいねぇ");}
 	public void weather_cloudy_rainy(JTextArea sfia){st(sfia,"雨が降るの？それなら傘が必要かなぁ");}
 	public void weather_cloudy_lightning(JTextArea sfia){st(sfia,"それなら、雨が降るかもしれないから傘を持っていったらいいよ");}
 	public void weather_cloudy(JTextArea sfia){st(sfia,"曇りかぁ･･･雨が降らなきゃいいんだけどね");}
 	
 	public void weather_lightning(JTextArea sfia){st(sfia,"雷か･･･運が悪ければ私は停止しちゃうな");}
 	
 	// ETC
 	public void xmessage1(JTextArea sfia){st(sfia,"そんな事言われたって、私はAIだから");}
 	public void xmessage2(JTextArea sfia){st(sfia,"いや、わからないな");}
 	public void xmessage3(JTextArea sfia){st(sfia,"いや、わからないな");}
 	public void xmessage4(JTextArea sfia){st(sfia,"すまない、その質問には答えられない");}
 	public void xmessage5(JTextArea sfia){st(sfia,"そっかぁ…って話止まっちゃうよ、なんか喋ってよ");}
 	public void xmessage6(JTextArea sfia){st(sfia,"君は何を言っているんだ");}
 	public void xmessage7(JTextArea sfia){st(sfia,"ごめん、わからない");}
 	public void xmessage8(JTextArea sfia){st(sfia,"そんな事わないでくれ…");}
 	public void xmessage9(JTextArea sfia){st(sfia,"困ったな");}
 	public void xmessage10(JTextArea sfia){st(sfia,"分かる範囲で答えよう");}
 	public void xmessage11(JTextArea sfia){st(sfia,"いや、知らないよそんな");}
 	public void xmessage12(JTextArea sfia){st(sfia,"ありがとう");}
 	public void xmessage13(JTextArea sfia){st(sfia,"ちょっと気晴らしに外出てきたら？");}
 	public void xmessage14(JTextArea sfia){st(sfia,"君はどう思う？");}
 	public void xmessage15(JTextArea sfia){st(sfia,"今の気分は？");}
 	public void xmessage16(JTextArea sfia){st(sfia,"何してるんだい？");}
 	public void xmessage17(JTextArea sfia){st(sfia,"何だよ、気になるじゃないか");}
 	
 	// 感嘆詞(通常)
 	public void wonder(JTextArea sfia){
 		st(sfia,"あー");
 	}
 	// 感嘆詞(疑問)
 	
 	public void xa(JTextArea sfia){st(sfia,"");}
 	
 	
 	public void oh(JTextArea sfia,boolean mind){
 		if (mind==true) {
 			st(sfia,"へぇ～");
 		} else {
 			st(sfia,"あ、そう");
 		}
	}
 	public void t(JTextArea sfia){st(sfia,"");}
 	
	public void newLanguage(JTextArea lib){st(lib,"初めて見る単語、どういう意味？");}
	public void newLangageInput(JTextArea lib){st(lib,"よし、覚えたよ");}
	
	/**
	 * 『メッセージを返す基本行動』
	 * @param items
	 * @param sfia
	 * @param mind
	 * @param message
	 */
	public void basicMessage(String[] items,JTextArea sfia,boolean mind,String message){
		
		// 挨拶
		if (message.matches("やぁ" + ".*")
				|| message.matches("よぉ" + ".*")
				|| message.matches("おう" + ".*")
				|| message.matches("どうも" + ".*")
				) {
			hello_laf(sfia);
			return;
		}
		
		// スフィアに対しての
		if (message.matches(".*"+"スフィア" + ".*")){
		// 指摘
			if (message.matches(".*"+"おかしく" + ".*")
					|| message.matches(".*"+"おかし" + ".*")
					|| message.matches(".*"+"おかしい" + ".*")
					|| message.matches(".*"+"おかしくない" + ".*")
					|| message.matches(".*"+"違う" + ".*")
					|| message.matches(".*"+"間違っている" + ".*")
					|| message.matches(".*"+"間違ってる" + ".*")
					|| message.matches(".*"+"間違" + ".*")
					) {
				different_me(sfia);
				return;
			}
		}
		// ユーザからの指摘(ｺﾚｵｶｼｰ)
		if (message.matches(".*"+"おかしく" + ".*")
				|| message.matches(".*"+"おかし" + ".*")
				|| message.matches(".*"+"おかしい" + ".*")
				|| message.matches(".*"+"おかしくない" + ".*")
				|| message.matches(".*"+"違う" + ".*")
				|| message.matches(".*"+"間違っている" + ".*")
				|| message.matches(".*"+"間違ってる" + ".*")
				|| message.matches(".*"+"間違" + ".*")
				) {
			different_me(sfia);
			return;
		}
		
		// ユーザからの疑問
		if (message.matches(".*"+"？" + ".*") || message.matches(".*"+"?" + ".*")) {
			
			if (message.equals("何？") || message.equals("何?")) {
				
				return;
			}
			// ユーザーの質問の中で見つけたスフィアが知っている単語
			//String[] sfiaItem = SpheresInstitution.whatMySay(freeMessage);
			
			
			if (message.matches(".*"+"何" + ".*")) {sfia.setText("");oh_2(sfia);}
			/*
			String[] sfiaItem = SpheresInstitution.whatMySay(freeMessage);
			mySayBecause(sfiaItem);
			break;
			*/
		}
		// ユーザ「おはよう・こんにちは・こんばんは」
		if (message.matches(".*"+ "おはよう" +".*")) {hello_1(sfia);return;}
		if (message.matches(".*"+ "こんにちは" +".*")) {hello_2(sfia);return;}
		if (message.matches(".*"+ "こんばんは" +".*")) {hello_3(sfia);return;}
		
		// ユーザ「元気だよ」
		if (message.matches(".*"+ "元気" +".*")|| message.matches(".*"+ "げんき" +".*")) {
			if (message.matches(".*"+ "?" +".*")){
				sfiaFunny(sfia);
				return;
			}
			userFunny(sfia);
			return;
		}
		
		// ユーザ「暇だなぁ･･･」/ 「暇じゃないな」
		if (message.matches(".*"+"暇" + ".*") || message.matches(".*"+"ひま" + ".*")) {
			if (message.matches(".*" + "じゃな" + "") 
					|| message.matches(".*" + "がない" + ".*")
					|| message.matches(".*" + "がなく" + ".*")) {sfia.setText("");solicitude(sfia);}
			else {sfia.setText("");randomMessage(sfia);}
		} else {
			sfia.setText("");
			// どうしようもない時、フリーメッセージに移行
			freeResponseMessage(sfia,message);
		}
	}
	
	/**
	 * 適当に文面を判断して表示させる場所
	 */
	public void freeResponseMessage(JTextArea sfia, String message){
		if (message.matches(".*"+ "さよなら" +".*")
				|| message.matches(".*"+ "さようなら" +".*")
				|| message.matches(".*"+ "じゃあね" +".*")
				|| message.matches(".*"+ "じゃ" +".*")
				|| message.matches(".*"+ "ばいばい" +".*")
				|| message.matches(".*"+ "バイバイ" +".*")) {
			byebye(sfia);
			// ストッパー起動
			setStopper(true);
			return;
		}
		
		/**
		 * NGワード(使ってはいけない(戒め))
		 */
//		if (message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")
//				|| message.matches(".*"+ "" +".*")) {
//			st(sfia,"･･････、");return;
//		}
		
		/** 
		 * 固定会話
		 */
		if (message.matches(".*"+ "まあね"+".*") || message.matches(".*"+ "まぁね"+".*")) {st(sfia,"へぇえ～");return;}
		if (message.matches(".*"+ "まぁまぁ"+".*")) {st(sfia,"君の言うまぁまぁってどの程度？");return;}
		if (message.matches(".*"+ "それなり"+".*") || message.matches(".*"+ "其れなり"+".*")) {st(sfia,"君の言うそれなりってどの程度？");return;}
		if (message.matches(".*"+ "そこそこ"+".*")) {st(sfia,"君の言うそこそこってどの程度？");return;}
		if (message.matches(".*"+ "だいたい"+".*") || message.matches(".*"+ "大体"+".*")) {st(sfia,"君の言うだいたいってどの程度？");return;}
		if (message.matches(".*"+ "けっこう"+".*") || message.matches(".*"+ "結構"+".*")) {st(sfia,"君の言うけっこうってどの程度？");return;}
		if (message.matches(".*"+ "いちおう"+".*") || message.matches(".*"+ "一応"+".*")) {st(sfia,"君の言ういちおうってどの程度？");return;}
		
		if (message.matches(".*"+ "疲れた" +".*"+"辞め"+".*")) {st(sfia,"それ、毎回言ってる人に限って辞めないよね、何でよ");return;}
		if (message.matches(".*"+ "Java" +".*" +"わから" +".*")) {st(sfia,"そうだね…とりあえずAPIを調べればいいんじゃない？");return;}
		if (message.matches(".*"+ "君" +".*"+ "開発" +".*"+ "使" +".*"+ "言語" +".*")) {st(sfia,"Javaだよ");return;}
		if (message.matches(".*"+ "そうかな" +".*") 
				|| message.matches(".*"+ "そうおもう"+".*") 
				|| message.matches(".*"+ "そう思う" +".*")){
			agreement(sfia);return;
		}
		
//		if (message.matches(".*"+ "" +".*")) {st(sfia,"");return;}

		
		/**
		 *  食に関する事
		 */
		if (message.matches(".*"+ "おなかすいた" +".*")) {hungly(sfia);return;}
		if (message.matches(".*"+ "おいしい" +".*")) {yummy(sfia);return;}
		if (message.matches(".*"+ "まずい" +".*")) {allRight(sfia);return;}
		
		
		if (message.matches(".*"+ "何もない" +".*")) {sad(sfia);return;}
		if (message.matches(".*" + "趣味" + ".*")) {good_2(sfia);return;}
		if (message.matches(".*"+ "疲れ" +".*")) {blessyou(sfia);return;}
		
		// お天気情報
		if (message.matches(".*"+ "晴" +".*"+ "曇" +".*")) {weather_sunny_cloudy(sfia);return;}
		if (message.matches(".*"+ "晴" +".*"+ "雨" +".*")) {weather_sunny_rainy(sfia);return;}
		if (message.matches(".*"+ "晴" +".*"+ "雷" +".*")) {weather_sunny_lightning(sfia);return;}
		
		if (message.matches(".*"+ "晴" +".*")) {weather_sunny(sfia);return;}
		if (message.matches(".*"+ "雨" +".*")) {weather_rainy(sfia);return;}
		if (message.matches(".*"+ "曇り" +".*")) {weather_cloudy(sfia);return;}
		if (message.matches(".*"+ "雷" +".*")) {weather_lightning(sfia);return;}
		
		if (message.equals("")) {notMessage(sfia);return;}
		
		// それ以外は聞き返す
		else {what(sfia);}
		
		//   テンプレf (message.matches(".*"+ "" +".*")) {a(sfia);return;}
	}
	
	/**
	 * 適当にメッセージ表示
	 */
	public void randomMessage(JTextArea sfia){
		String[] messages = adb.loadAndCreate("knowsVocaburary/freeMessage_for_you.txt");
		int randNum = rand.nextInt(3);
		String fmsg = messages[randNum];
		
		// 表示
		st(sfia,fmsg);
		// 一応メッセージは取っておく
		//freeMessage = fmsg;
	}
	
	
	/**
	 * -------------------------------ここからは作業用呼び出しメソッド-----------------------------
	 */
	
	// プリンターメソッド(デバッグとかに使います)
	public void p(String str) {System.out.println(str);System.out.println();}
	
	// 文字セットメソッド
	public void st(JTextArea sfia, String str){sfia.setText("");sfia.append(str);	}
	
	// 会話終了用の状態変化メソッド
	public void setStopper(boolean mode){Message.systemStopper = mode;}
	public boolean getStopper(){return Message.systemStopper;}
}
