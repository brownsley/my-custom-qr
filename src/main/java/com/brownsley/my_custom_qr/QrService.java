package com.brownsley.my_custom_qr;

import org.springframework.web.client.RestTemplate;

public class QrService {
    private final RestTemplate template;

    public QrService(RestTemplate template) {
        this.template = template;
    }

    public byte[] generateQr(String data) {
        return generateQr(data, 150);
    }

    public byte[] generateQr(String data, int size) {
        String url = "https://api.qrserver.com/v1/create-qr-code/?size=" + size + "x" + size + "&data=" + data;
        return template.getForObject(url, byte[].class);
    }
}
