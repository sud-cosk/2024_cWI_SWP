package src;

import src.com.example.newsbroker.NewsAgency;
import src.com.example.newsbroker.NewsChannel;


public class App {

    
    public static void main(String[] args) throws Exception{

    //instantiate the news agencies
    var apa = new NewsAgency("APA");
    var reuters = new NewsAgency("reuters");

    //instantiate the news channels
    var orf = new NewsChannel("orf.at");
    var nzz = new NewsChannel("nzz.ch");
    var nytimes = new NewsChannel("nytimes.com");

    //subscribe to APA
    apa.subscribe(orf);
    apa.subscribe(nzz);

    //subscribe to reuters
    reuters.subscribe(nytimes);
    reuters.subscribe(nzz);


    }

}
