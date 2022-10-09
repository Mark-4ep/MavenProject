package myname;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Map<String,String> person = new HashMap<>();
        person.put("Name","Mark");
        person.put("Last Name","Chepizhny");

        System.out.println(new Gson().toJson(person));
    }
}
