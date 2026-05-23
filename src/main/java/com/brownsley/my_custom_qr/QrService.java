package com.brownsley.my_custom_qr;

import org.springframework.web.client.RestTemplate;

public class QrService {

    public byte[] generateQr(String data) {
        return generateQr(data, 150);
    }

    public byte[] generateQr(String data, int size) {
        String url = "https://api.qrserver.com/v1/create-qr-code/?size=" + size + "x" + size + "&data=" + data;
        RestTemplate template = new RestTemplate();
        return template.getForObject(url, byte[].class);
    }
}
