package com.brownsley.my_custom_qr;

import org.springframework.web.client.RestTemplate;

public class QrService {
    public byte[] generateQr(String data) {
        String url = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=" + data;
        RestTemplate template = new RestTemplate();
        return template.getForObject(url, byte[].class);
    }
}
