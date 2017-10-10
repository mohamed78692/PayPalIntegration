package com.belongi.moe.models.others.currencyConverter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Neosoft on 9/11/2017.
 */

public class CurrencyYahooApiJSON {

    @Expose
    @SerializedName("query")
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "CurrencyYahooApiJSON{" +
                "query=" + query +
                '}';
    }
}
