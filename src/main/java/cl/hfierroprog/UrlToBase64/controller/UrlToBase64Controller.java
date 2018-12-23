package cl.hfierroprog.UrlToBase64.controller;

import cl.hfierroprog.UrlToBase64.service.UrlToBase64Service;
import cl.hfierroprog.UrlToBase64.vo.UrlRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlToBase64Controller {

    @Autowired
    private UrlToBase64Service urlToBase64Service;

    @PostMapping("/transformar")
    @CrossOrigin(allowedHeaders = "*")
    public UrlRequest trasformar(@RequestBody UrlRequest request) {
        UrlRequest response = new UrlRequest();

        response.setUrl(request.getUrl());
        response.setBase64(urlToBase64Service.getBase64(request.getUrl()));

        return response;
    }

    @GetMapping("/hola")
    @CrossOrigin(allowedHeaders = "*")
    public String getTest() {
        return "Hola desde el puerto 8001";
    }
}
