package apidemo;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;



import org.apache.http.HttpEntity;

import org.apache.http.client.ClientProtocolException;

import org.apache.http.client.methods.CloseableHttpResponse;

import org.apache.http.client.methods.HttpPost;

import org.apache.http.entity.ContentType;

import org.apache.http.entity.mime.MultipartEntityBuilder;

import org.apache.http.entity.mime.content.FileBody;

import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.impl.client.HttpClients;

import org.apache.http.util.EntityUtils;



public class sendAudio {



    private static final String token = "5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU";

    private static final String chatId = "975051470";



    public static void main(String[] args) throws ClientProtocolException, IOException {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost upload = new HttpPost("https://api.telegram.org/bot"+token+"/sendAudio?chat_id="+chatId);



        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        File file = new File("C:/Users/NHI398/Desktop/audio.mp3");

        builder.addBinaryBody(

                "audio",

                new FileInputStream(file),

                ContentType.APPLICATION_OCTET_STREAM,

                file.getName()

        );

        HttpEntity multipart = builder.build();

        upload.setEntity(multipart);



        CloseableHttpResponse response = client.execute(upload);

        try {

            HttpEntity responseEntity = response.getEntity();

            System.out.println(EntityUtils.toString(responseEntity));

        } finally {

            response.close();

        }

    }

}