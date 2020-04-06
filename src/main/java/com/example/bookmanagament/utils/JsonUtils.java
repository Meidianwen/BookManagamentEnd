package com.example.bookmanagament.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();
    /**
     * 对象转json
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> String toJson(T obj){
        if (obj == null){
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
