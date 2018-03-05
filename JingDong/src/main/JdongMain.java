package main;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import util.URLFecter;
import model.JdModel;

public class JdongMain {

	static final Log logger = LogFactory.getLog(JdongMain.class);
	public static void main(String[] args) throws Exception{
		HttpClient client = new DefaultHttpClient();
		
		boolean isStop = false;
		int index = 1;
		List<JdModel> bookdatas = new ArrayList<JdModel>();
		while(index <= 9){
			String url = "http://search.jd.com/Search?keyword=Python&enc=utf-8&qrst=1&rt=1&stop=1&book=y&vt=2&wq=Python&page=" + index + "&s=61&click=0";
			List<JdModel> temp = URLFecter.URLParser(client, url);
			if(temp != null){
				bookdatas.addAll(temp);
				index += 2;
			}else{
				isStop = true;
			}
		}
		
		for(JdModel jd : bookdatas){
			System.out.println(jd.toString());
		}
	}
}
