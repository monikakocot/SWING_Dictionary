package SlownikPro;

import java.util.HashMap;

public class PL_ANG {

    public static HashMap<String,String> plDictionaryProvider (){

        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("mama", "mother");
        dictionary.put("tata", "father");
        dictionary.put("piłka", "ball");
        dictionary.put("dom", "house");
        dictionary.put("kot", "cat");
        dictionary.put("ptak", "bird");

        return dictionary;
    }
}
