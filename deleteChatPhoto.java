package apidemo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class deleteChatPhoto {

    public static void main(String[] args){

    try {

        
 HttpRequest   request = HttpRequest.newBuilder()//deleteChatPhoto
 .uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/deleteChatPhoto?chat_id=-1001601381690"))
 .build();
 HttpClient http = HttpClient.newHttpClient();
   HttpResponse response = http.send(request,BodyHandlers.ofString());
 System.out.println(response.body());
 }
        
    
    
    catch (Exception e) {
        System.out.println("exception ");
        e.printStackTrace();
        }

    }

}
