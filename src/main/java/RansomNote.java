import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public Boolean harmlessRansomNote(String message , String magazineText){

        HashMap<String ,Integer> wordCount = new HashMap<>();
         if(!wordCount.containsKey(message))
             wordCount.put(message,1);
         else
             wordCount.put(message,wordCount.get(message)+1);
       for( String :  wordCount.keySet()){
            System.out.println("message" + message + "occurred" + wordCount.get(message)
            + "times";
        }


    }
}
