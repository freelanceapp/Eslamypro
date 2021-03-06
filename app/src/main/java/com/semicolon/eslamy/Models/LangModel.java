package com.semicolon.eslamy.Models;

import java.io.Serializable;

/**
 * Created by Delta on 25/03/2018.
 */

public class LangModel implements Serializable {
    private String id;
    private String name;
    private String flag;
    private String created_at;
    private String updated_at;

    public LangModel() {
    }

    public LangModel(String id, String name, String flag, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.flag = flag;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
