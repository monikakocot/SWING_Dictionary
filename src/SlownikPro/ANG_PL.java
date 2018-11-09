package SlownikPro;

import java.util.HashMap;

public class ANG_PL {

    public static HashMap<String,String> angDictionaryProvider (){

        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("mother","mama");
        dictionary.put("father","tata");
        dictionary.put("ball","pilka");
        dictionary.put("house","dom");
        dictionary.put("cat","kot");
        dictionary.put("bird","ptak");

        return dictionary;
    }

}