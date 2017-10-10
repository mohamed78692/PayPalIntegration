package com.belongi.moe.models.others.currencyConverter;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by Neosoft on 9/11/2017.
 */

public class CurrencyConverterJSON extends RealmObject{

    @SerializedName("CountryName")
    private String CountryName;
    @SerializedName("CountryCode")
    private String CountryCode;

    public CurrencyConverterJSON() {
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    @Override
    public String toString() {
        return "CurrencyConverterJSON{" +
                "CountryName='" + CountryName + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                '}';
    }
}
