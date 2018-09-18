import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class webScrapper {
    public static void main(String[] args) {
        String printer = new String();
        String printer2 = new String();
        String printer3 = new String();

        printer = "http://erdani.com/tdpl/hamlet.txt";
        printer2 = "https://www.bls.gov/tus/charts/chart9.txt";
        printer3 = "http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt";

//      System.out.print(urlToString(printer));
//      System.out.print(urlToString(printer2));
//      System.out.print(urlToString(printer3));


    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
