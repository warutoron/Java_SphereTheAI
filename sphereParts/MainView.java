package sphereParts;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainView extends JFrame {
	
	// Userとスフィアのテキストエリアを作成
	JTextArea sfia = new JTextArea();
	JTextArea user = new JTextArea();
	
	// スフィア
	Sphere sph = new Sphere();
	
	// スフィアの基本インスタンス
	SpheresInstitution sfiaIns = new SpheresInstitution();
	
	// CompornentFactorylのインスタンス
	CompornentFactory compf = new CompornentFactory();
	
	// 文章判断インスタンス
	SentenceDecision sent = new SentenceDecision();
	
	// 記録用ログファイルのインスタンス
	LogFileRecording lfr = new LogFileRecording();
	
	// 様々なメモリファイルをロードするインスタンス
	FileLoaderFactory fl = new FileLoaderFactory();
	
	// メッセージ格納インスタンス
	Message msg = new Message();
	
	// ボタン処理のモード
	private int InputMode = 0;
	private int RecordingMode = 0;
	private int RandomMode = 0;
	
	// ユーザ・スフィアのメッセージ一時保存
	private String userIdeas;
	private String sfiaIdeas;
	
	public MainView() {

		// パネルの生成(本体)
		final JPanel panel1 = new JPanel();
		panel1.setLayout(null);

		// パネルサイズを設定
		panel1.setBounds(0, 0, 375,380);
		panel1.setOpaque(false);

		// パネルの生成(背景用)
		JPanel panel2 = new JPanel();

		// レイアウトを自由に変更できる
		panel2.setLayout(new FlowLayout());

		// パネルサイズを設定
		panel2.setBounds(0, -20,375,380);

		// 背景色を設定
		panel2.setBackground(Color.WHITE);
		
		/**
		 * 背景画像
		 */
		// 画像をURL指定
		ClassLoader cl_back = this.getClass().getClassLoader();

		// 背景画像を追加
		ImageIcon backImage = new ImageIcon(cl_back.getResource("partsFile/Earth.png"));

		// iconをJLabelに設定
		JLabel backIcon = new JLabel(backImage);

		// パネルに乗せる
		panel2.add(backIcon);
		
		/**
		 * キャラ画像
		 */
		// 画像をURL指定
		ClassLoader cl_char = this.getClass().getClassLoader();

	    // キャラクタ画像を追加
		ImageIcon sphere = new ImageIcon(cl_char.getResource("partsFile/sphereM.gif"));

		// iconをJLabelに乗せる
		JLabel charIcon = new JLabel(sphere);

		// 描画位置を設定
		charIcon.setBounds(265, 60, 93, 228);
		
		// Userのパネルを作成
		JPanel userPanel = compf.sphere(sfia);
		JPanel javaPanel = compf.user(user);
		
		// 各ボタンを生成(ChatPanel.classで作成)
		final JButton butChanger = compf.createButton("partsFile/modeset.png", 270, 320, 90, 20);
		final JButton but1 = compf.createButton("partsFile/Inp.png", 5, 290, 80, 50);
		final JButton but2 = compf.createButton("partsFile/Rec.png", 90, 290, 80, 50);
		final JButton but3 = compf.createButton("partsFile/Rand.png", 175, 290, 80, 50);
		
		/**
		 * 処理スタート
		 */
		sfia.append("『AIbot01 -SPHERE- 起動します』\r\n『下記のボタンから行いたいモードを選んで下さい』");
		user.append(" - No Entry - ");
		user.setEnabled(false);
		user.setDisabledTextColor(Color.GRAY);
		butChanger.setEnabled(false);
		
		// 処理を記述
		butChanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				// 各モード初期化
				setInputMode(0);
				setRecordingMode(0);
				setRandomMode(0);

				// テキストエリアをクリア
				user.setText("");
				sfia.setText("");

				// モード発動メッセージを表示
				sfia.append("『Mode Change発動････\r\nモードを選んで下さい』");

				// ユーザエリアを無効化
				user.append(" - No Entry - ");
				user.setEnabled(false);
				user.setDisabledTextColor(Color.GRAY);

				// 各ボタンを有効化
				but1.setEnabled(true);
				but2.setEnabled(true);
				but3.setEnabled(true);

				// モード変更ボタンのみ無効化
				butChanger.setEnabled(false);
			}
		});
		
		// 処理を記述
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
						
				user.setEnabled(true);
				but2.setEnabled(false);
				but3.setEnabled(false);
				butChanger.setEnabled(true);
				
				// モード切り替え
				switch (InputMode) {
						
					/**
					 * 挨拶
					 */
					case 0:
						sfia.setText("");
						user.setText("");
						msg.input(sfia);
						msg.start(sfia);
						butChanger.setEnabled(true);
						
						setInputMode(1);
						break;
				
					/** 
					 * ユーザー認証開始
					 * */
					case 1:
						// ユーザー名が入力されていなかった場合
						if ("".equals(user.getText())) {
							sfia.setText("");
							msg.startError(sfia);
							break;
						}
						boolean result= UserCertification.who(user.getText());
						
					    if (result){
					    	// ユーザ認証完了
							msg.securityCrear(sfia);
							
							// 会話記録用ファイルを生成
							lfr.logFileMake();
							
							// 最初の挨拶メッセージ(ランダム)
							msg.call1(sfia);
							// ログ記録開始
							lfr.logMemorySet(sfia.getText(),"SPHERE");
							
							user.setText("");
						    setInputMode(2);
					    
					    } else {
					    	sfia.setText("");
					    	msg.emergency(sfia);
					    	sfia.setDisabledTextColor(Color.RED);
					    	sfia.append("\r\n\r\n『不正アクセス検知：全モード緊急閉鎖』");
					    	
							but1.setEnabled(false);
							but2.setEnabled(false);
							but3.setEnabled(false);
							butChanger.setEnabled(false);
							
					    	user.setEnabled(false);
					    	user.setDisabledTextColor(Color.RED);
					    	user.setText(" - Described ban! - ");
					    	setInputMode(7);
					    	setRecordingMode(7);
					    	setRandomMode(7);
					    	
					    }
						break;
					    
				   /** 
					* 会話開始----------------------------------------------------------------------
					* */
					case 2:
						
						//sent.easySentdencisDicision(user.getText(),"sphere/stringJointer");
						
						// ランダムメッセージ構築
						String[] crm = sph.sphereCreateMessages();
						
						Random rand = new Random();
						System.out.println(crm[rand.nextInt(crm.length)]);
						
						// ログ記録(user)
						lfr.logMemorySet(user.getText(),"USER");
						// Userの喋った言葉を記録しておく
						setUserIdea(user.getText());
						
						String[] searchs = SearchOperation.operation1(user, sfia);
						sfiaIns.sphereConclusion(searchs,sfia,userIdeas);
						
						// ログ記録(sphere)
						lfr.logMemorySet(sfia.getText(),"SPHER");
						// スフィアが喋った言葉を記録しておく
						setSphereIdea(sfia.getText());
						
						if (msg.getStopper() == true){
							user.setText("");
							msg.systemEnd(sfia);
							user.append(" - No Entry - ");
							user.setEnabled(false);
							user.setDisabledTextColor(Color.GRAY);
							but1.setEnabled(false);
							but2.setEnabled(false);
							but3.setEnabled(false);
							butChanger.setEnabled(true);
							break;

						} else {
							user.setText("");
						    break;

						}

					/**
					 * システムを強制的に終了
					 */
					case 7:System.exit(0);
					break;
				}
			}
		});

		// 処理を記述
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				user.setEnabled(true);
				but1.setEnabled(false);
				but3.setEnabled(false);
				butChanger.setEnabled(true);
				
				switch (RecordingMode) {
				
					case 0:
						sfia.setText("");
						user.setText("");
						msg.recording(sfia);
						msg.start(sfia);
						butChanger.setEnabled(true);
						setRecordingMode(1);
						break;

					case 1:
						// ユーザー名が入力されていなかった場合
						if ("".equals(user.getText())) {
							sfia.setText("");
							msg.startError(sfia);
							break;
						}
						boolean result= UserCertification.who(user.getText());
						
					    if (result) {
					    	// ユーザ認証完了
							msg.securityCrear(sfia);
							// 要件を聞く
							msg.call1(sfia);
							user.setText("");
						    setRecordingMode(2);
						    
					    } else {
					    	sfia.setText("");
					    	msg.emergency(sfia);
					    	sfia.setDisabledTextColor(Color.RED);
					    	sfia.append("\r\n\r\n『不正アクセス検知：全モード緊急閉鎖』");
					    	
							but1.setEnabled(false);
							but2.setEnabled(false);
							but3.setEnabled(false);
							butChanger.setEnabled(false);
							
					    	user.setEnabled(false);
					    	user.setDisabledTextColor(Color.RED);
					    	user.setText(" - Described ban! - ");
					    	setInputMode(7);
					    	setRecordingMode(7);
					    	setRandomMode(7);
					    }

						break;

					case 2:
						user.setText("");
						sfia.setText("");
						msg.emergency(sfia);
						break;

					case 7:
						System.exit(0);
						break;
					
				}
			}
		});

		// 処理を記述
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				user.setEnabled(true);
				but1.setEnabled(false);
				but2.setEnabled(false);
				butChanger.setEnabled(true);
				
				switch(RandomMode){

				case 0:
					sfia.setText("");
					user.setText("");
					msg.random(sfia);
					msg.start(sfia);
					butChanger.setEnabled(true);
					setRandomMode(1);
					break;

				case 1:
					// ユーザー名が入力されていなかった場合
					if ("".equals(user.getText())) {
						sfia.setText("");
						msg.startError(sfia);
						break;
					}

					boolean result= UserCertification.who(user.getText());
					
				    if (result){
				    	// ユーザ認証完了
						msg.securityCrear(sfia);
						// 要件を聞く
						msg.call1(sfia);
						user.setText("");
					    setRandomMode(2);
					    
				    } else {
				    	sfia.setText("");
				    	msg.emergency(sfia);
				    	sfia.setDisabledTextColor(Color.RED);
				    	sfia.append("\r\n\r\n『不正アクセス検知：全モード緊急閉鎖』");
				    	
						but1.setEnabled(false);
						but2.setEnabled(false);
						but3.setEnabled(false);
						butChanger.setEnabled(false);
						
				    	user.setEnabled(false);
				    	user.setDisabledTextColor(Color.RED);
				    	user.setText(" - Described ban! - ");
				    	setInputMode(7);
				    	setRecordingMode(7);
				    	setRandomMode(7);
				    	
				    }

					break;

				case 2:
					user.setText("");
					sfia.setText("");
					msg.emergency(sfia);
					break;

				case 7:
					System.exit(0);
					break;
				
				}
				
			}
		});
		
		// チャットパネル用にラベルを追加
		JLabel sfial = new JLabel("- SPHERE -");
		sfial.setBounds(0, 5, 60, 15);
		sfial.setForeground(Color.WHITE);
		JLabel userl = new JLabel("- USER -");
		userl.setBounds(0, 145, 60, 15);
		userl.setForeground(Color.WHITE);
		
		panel1.add(userPanel);
		panel1.add(sfial);
		panel1.add(javaPanel);
		panel1.add(userl);
		panel1.add(but1);
		panel1.add(but2);
		panel1.add(but3);
		panel1.add(butChanger);
		panel1.add(charIcon);
		panel1.add(panel2);

		getContentPane().add(panel1);
		getContentPane().add(panel2);

	}

	// プリンターメソッド(デバッグとかに使います)
	public void p(String str) {
		System.out.println(str);
		System.out.println();

	}
	
	// 状態変化用セットメソッド
	public void setInputMode(int newMode) {
		InputMode = newMode;
	}

	public void setRecordingMode(int newMode) {
		RecordingMode = newMode;
	}

	public void setRandomMode(int newMode) {
		RandomMode = newMode;
	}

	// ユーザ・スフィアのメッセージを一時保管
	public void setUserIdea(String message){
		this.userIdeas = message;
	}

	public void setSphereIdea(String message){
		this.sfiaIdeas = message;
	}

	// ユーザ・スフィアのメッセージを返す
	public String getUserIdea(){
		return this.userIdeas;
	}

	public String getSphereIdea(){
		return this.sfiaIdeas;
	}

}
