package com.example.getready;

public class StatusItem {
    private int icon;
    private String status;

    public StatusItem(int icon, String status) {
        this.icon = icon;
        this.status = status;
    }

    public int getIcon() {
        return icon;
    }

    public String getStatus() {
        return status;
    }
}
