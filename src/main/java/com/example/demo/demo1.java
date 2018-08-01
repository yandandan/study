package com.example.demo;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.Test;


public class demo1 {

    @Test
    public void formpost() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("https://www.yunzhijia.com/space/c/rest/user/login");
        List<NameValuePair> formParams = new ArrayList<>();
        formParams.add(new BasicNameValuePair("email","13246630621"));
        formParams.add(new BasicNameValuePair("password","654321"));
        HttpEntity entity = new UrlEncodedFormEntity(formParams,"UTF-8");
        post.setEntity(entity);
        CloseableHttpResponse response = httpClient.execute(post);
        System.out.println(response.toString());
    }



}
