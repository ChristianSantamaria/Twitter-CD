package cdtwitter;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.Paging;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class Funciones {
    public Twitter twitter;

    
    /**
     * Constructor por defecto
     */
    public Funciones() {
    }

    /**
     * Aqui añadiendole la key, secret, accToken y la secretToken que las encontraremos en la pagina de twitter developer se conectara a la cuenta 
     * la cual es necesaria para los siguientes metodos
     */
    public void conectar() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("x")
                .setOAuthConsumerSecret("x")
                .setOAuthAccessToken("x")
                .setOAuthAccessTokenSecret("x");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }
    
    

}
