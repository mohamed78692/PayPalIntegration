package com.belongi.moe.models.others.currencyConverter;

import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("count")
    private int count;
    @SerializedName("created")
    private String created;
    @SerializedName("lang")
    private String lang;
    @SerializedName("results")
    private Results results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}
