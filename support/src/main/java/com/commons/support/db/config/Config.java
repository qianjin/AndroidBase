package com.commons.support.db.config;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CONFIG".
 */
public class Config {

    private Long id;
    /** Not-null value. */
    private String key;
    /** Not-null value. */
    private String value;

    public Config() {
    }

    public Config(Long id) {
        this.id = id;
    }

    public Config(Long id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public Config(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getKey() {
        return key;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setKey(String key) {
        this.key = key;
    }

    /** Not-null value. */
    public String getValue() {
        return value;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setValue(String value) {
        this.value = value;
    }

}
