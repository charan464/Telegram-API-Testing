package apidemo;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class App {
public static void main(String[] args) throws Exception {

try {

   
    String message="CVR";
    
    //sendMessage method
    HttpRequest request = HttpRequest.newBuilder()
    .uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/"
    + "sendMessage?chat_id=975051470&text="+message)).build();
    HttpClient http = HttpClient.newHttpClient();
    HttpResponse response = http.send(request,BodyHandlers.ofString());
    System.out.println(response.body());

    



//sendPhoto method
 request = HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendPhoto?"
+ "chat_id=975051470&photo=https://tse2.mm.bing.net/th?id=OIP.6lL4MboZ6-ZtULpHuGykaAHaE7&pid=Api&P=0"))
.build();
 http = HttpClient.newHttpClient();
 response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());




//sendAudio method
request = (HttpRequest) HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendAudio?"
+ "chat_id=975051470&audio=https://www.bensound.com/bensound-music/bensound-dreams.mp3"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());


//sendVideo method
request = (HttpRequest) HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendVideo?chat_id=975051470&video=http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());


//sendDocument method
request = (HttpRequest) HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendDocument?"
+ "chat_id=975051470&document=https://www.clickdimensions.com/links/TestPDFfile.pdf"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());


//sendAnimation method
request = (HttpRequest) HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendAnimation?chat_id=975051470&animation"
+"=https://bobble-animations.bobblekeyboard.net/previews/animation_preview_1ba709fb-05af-4f37-8681-b6e7066b7ae9.gif"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());

//sendContact method
 request = HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendContact?"
+ "chat_id=975051470&phone_number=8688011464&first_name=saicharan&last_name=poleboina"))
.build();
 http = HttpClient.newHttpClient();
  response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());


//sendLocation method
request = HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendLocation?"+
"chat_id=975051470&latitude=17.443534/N17°26'36.721''&longitude=78.379740/E78°22'47.065"))
.build();
 http = HttpClient.newHttpClient();
  response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());

//sendVenue method
request = HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendVenue?"+
"chat_id=975051470&latitude=17.494220&longitude=78.370890&title=SmartWorks&address=Raidurg"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());



// sendDice method
request = HttpRequest.newBuilder()
.uri(new URI("https://api.telegram.org/bot5874938584:AAHHxQHaTpGbPVnF2F6fVjMAqKW6E4gJmpU/sendDice?chat_id=975051470"))
.build();
http = HttpClient.newHttpClient();
response = http.send(request,BodyHandlers.ofString());
System.out.println(response.body());



} catch (Exception e) {
System.out.println("exception ");
e.printStackTrace();
}


}
}

