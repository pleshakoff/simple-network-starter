package com.network.http.rest_template;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

class RestTemplateUtils {

    static String API = "api";
    static String SCHEME = "http";

    static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    static HttpEntity getHttpEntity() {
        return new HttpEntity(getHttpHeaders());
    }
}