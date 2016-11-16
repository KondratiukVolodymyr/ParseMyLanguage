package counters;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.regex.Pattern;

public class Rabota implements Counter {

    public int countLang(String language) throws IOException {

        if (language.equals("C#")) language = "c%23";
        if (language.equals("C++")) language = "c%2B%2B";

        Document doc = Jsoup.connect("http://rabota.ua/ua/jobsearch/vacancy_list?keyWords=" + language ).get();
        String content = doc.select("span:contains(знайден)").toString();
        Pattern pattern = Pattern.compile("[^\\d]*");
        return Integer.parseInt(pattern.matcher(content).replaceAll(""));

    }
}
// + "&parentId=1"