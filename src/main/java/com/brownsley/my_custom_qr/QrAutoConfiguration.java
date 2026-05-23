package com.brownsley.my_custom_qr;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class QrAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public QrService qrService() {
        return new QrService();
    }
}
