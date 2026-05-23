package com.brownsley.my_custom_qr;

public class QrService {
    public String generateQr(String data) {
        return "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=" + data;
    }
}
