package com.belongi.moe.models.others.currencyConverter;

import com.google.gson.annotations.SerializedName;

public class Row {
    @SerializedName("col0")
    private String currencyCode;
    @SerializedName("col1")
    private String convertedValue;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getConvertedValue() {
        return convertedValue;
    }

    @Override
    public String toString() {
        return "Row{" +
                "currencyCode='" + currencyCode + '\'' +
                ", convertedValue='" + convertedValue + '\'' +
                '}';
    }
}
