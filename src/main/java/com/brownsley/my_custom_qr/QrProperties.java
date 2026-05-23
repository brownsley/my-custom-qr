package com.brownsley.my_custom_qr;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "brownsley-qr")
public class QrProperties {
    private String size = "150x150";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
