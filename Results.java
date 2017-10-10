package com.belongi.moe.models.others.currencyConverter;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("row")
    private Row row;

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Results{" +
                "row=" + row +
                '}';
    }
}
