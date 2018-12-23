package cl.hfierroprog.UrlToBase64.vo;

import java.io.Serializable;

public class UrlRequest implements Serializable {
    private String url;
    private String base64;

    public UrlRequest() {
    }

    public UrlRequest(String url, String base64) {
        this.url = url;
        this.base64 = base64;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    @Override
    public String toString() {
        return "UrlRequest{" +
                "url='" + url + '\'' +
                ", base64='" + base64 + '\'' +
                '}';
    }
}
