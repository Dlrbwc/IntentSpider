package util;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

import parse.JdParse;
import model.JdModel;

public class URLFecter {
	
	public static List<JdModel> URLParser(HttpClient client, String url) throws Exception{
		
		List<JdModel> JingdongData = new ArrayList<JdModel>();
		
		HttpResponse response = HttpUtils.getRawHtml(client, url);
		
		int StatusCode = response.getStatusLine().getStatusCode();
		
		if(StatusCode == 200){
			String entity = EntityUtils.toString(response.getEntity(),"utf-8");   
			JingdongData = JdParse.getData(entity);
			EntityUtils.consume(response.getEntity());
		}else {
            EntityUtils.consume(response.getEntity());
        }
        return JingdongData;
	}
}
