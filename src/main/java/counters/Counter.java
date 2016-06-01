package counters;

import java.io.IOException;

interface Counter {
    int countLang(String language) throws IOException;
}
