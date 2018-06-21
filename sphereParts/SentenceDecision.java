package sphereParts;
import java.io.File;

public class SentenceDecision {	
	// 文章判断･･･接続詞ファイルを読み込んで判断
	// 比較(comparison)
	// 転換(conversion)
	// 説明(description)
	// 接続(joint)
	// 逆説(paradox)
	// 並列(palalell)
	
	FileLoaderFactory fl = new FileLoaderFactory();
	ArrayDataBuilder adb = new ArrayDataBuilder();
	
	// 受け取った台詞の中にJointerファイルの内容が含まれているかを判断
	public void easySentdencisDicision (String line, String fileAddress) {

        File file = new File(fileAddress);
        File[] files = file.listFiles();
        String[] slist = new String[1000];
        
		for (int i=0; i < files.length; i++) {
			
			String rechange1 = String.valueOf(files[i]);
			String rechange2 = rechange1.replace("\\", "/");
			String rechange3 = rechange2.replace("sphere/", "");
			String[] parts = adb.loadAndCreate(rechange3);
			
			for (int j=0; j < parts.length; j++) {

				if (line.matches(".*"+ parts[j]+".*")) {
					slist[j] = parts[j];
				}

			}
		}
	}
	
	public void sentdecis_judge (String message, String[] parts) {
		for (int i=0; i < parts.length; i++) {
			if (message.matches(".*"+parts[i]+"は" + "" + "だ" + ".*")
			|| (message.matches(".*" + parts[i]+"は" + "" + "である" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "に違いない" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + ""))) {
			}
		}
		for (int i=0; i < parts.length; i++) {
			if (message.matches(".*"+parts[i]+"は" + "" + "だ" + ".*" + "とおも" + ".*")
			|| (message.matches(".*"+parts[i]+"は" + "" + "だと思" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "である" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "じゃ" + ".*" + "ない" + "？"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "じゃ" + ".*" + "ない" + "?"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "に違いな" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + ""))) {
			}
		}
	}
	// 「～は、～だと思う」(仮定)
	public void sentdecis_feeble(String message, String[] parts){
		
		for (int i=0; i < parts.length; i++) {
			if (message.matches(".*"+parts[i]+"は" + "" + "だ" + ".*")
			|| (message.matches(".*" + parts[i]+"は" + "" + "である" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "に違いない" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + ""))) {
			}
		}
		
	}
	
	public void sentdecis1(String message, String[] parts){
		for (int i=0; i < parts.length; i++) {
			if (message.matches(".*"+parts[i]+"は" + "" + "だ" + ".*")
			|| (message.matches(".*" + parts[i]+"は" + "" + "である" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "に違いない" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + ""))) {
			}
		}
	}
	
	// 何処がおかしいか教えてよ、なんてかえせばいいのかも
	public void sentdecis2(String message, String[] parts){
		for (int i=0; i < parts.length; i++) {
			if (message.matches(".*"+parts[i]+"は" + "" + "だ" + ".*")
			|| (message.matches(".*" + parts[i]+"は" + "" + "である" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + "に違いない" + ".*"))
			|| (message.matches(".*" + parts[i]+"は" + "" + ""))) {
			}
		}
	}
}
