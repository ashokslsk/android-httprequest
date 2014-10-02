package dev.ash.catalog;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import android.net.http.AndroidHttpClient;

public class HttpManager {
	
	public static String Getdata(String uri){
		AndroidHttpClient client = AndroidHttpClient.newInstance("AndroidAgent");
		HttpGet req = new HttpGet(uri);
		HttpResponse response ;
		
		try {
			response=client.execute(req);
			return EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			client.close();
		}
		
	}

}
