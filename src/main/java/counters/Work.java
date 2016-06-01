package counters;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.regex.Pattern;


public class Work implements Counter {

    public int countLang(String language) throws IOException {

        if (language.equals("C#")) language = "c%23";
        if (language.equals("C++")) language = "c%2B%2B";

        Document doc = Jsoup.connect("http://www.work.ua/jobs-it-" + language + "/?advs=1").get();
        String description = doc.select("meta[name=description]").get(0).attr("content");
        Pattern pattern = Pattern.compile("[^\\d]*");
        return Integer.parseInt(pattern.matcher(description).replaceAll(""));
    }

}
