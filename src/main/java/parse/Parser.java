package parse;

import counters.Rabota;
import counters.Work;

import java.io.IOException;
import java.util.HashMap;

/**
 * Parser created by Kondratiuk V on 14.05.16.
 */

public class Parser {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.getCountLanguages();
    }

    public HashMap<String, Integer> getCountLanguages() throws IOException {

        HashMap<String, Integer> countEveryLang = new HashMap<String, Integer>();

        countEveryLang.put("Java", 0);
        countEveryLang.put("C#", 0);
        countEveryLang.put("JavaScript", 0);
        countEveryLang.put("PHP", 0);
        countEveryLang.put("Python", 0);
        countEveryLang.put("C++", 0);
        countEveryLang.put("Ruby", 0);
        countEveryLang.put("Objective-C", 0);
        countEveryLang.put("Scala", 0);
        countEveryLang.put("Delphi", 0);
        countEveryLang.put("Swift", 0);
        countEveryLang.put("ActionScript", 0);
        countEveryLang.put("Perl", 0);
        countEveryLang.put("Erlang", 0);
        countEveryLang.put("Go", 0);


        for (String languages : countEveryLang.keySet()) {
            int count = new Work().countLang(languages) + new Rabota().countLang(languages);
            countEveryLang.put(languages, count);
        }

        return countEveryLang;

    }
}


