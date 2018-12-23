package cl.hfierroprog.UrlToBase64.service;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

@Service("urlToBase64Service")
public class UrlToBase64Service {

    public String getBase64(String url) {
        try {
            URL urlObject = new URL(url);

            InputStream is = urlObject.openStream();

            byte[] bytes = IOUtils.toByteArray(is);

            String base64 = Base64.getEncoder().encodeToString(bytes);

            return base64;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
