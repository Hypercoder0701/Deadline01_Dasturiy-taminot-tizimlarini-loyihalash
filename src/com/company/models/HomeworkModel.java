package com.company.models;

public class HomeworkModel {
    private String hwName;
    private String hwDeadlineDate;

    public HomeworkModel() {
    }

    public HomeworkModel(String hwName, String hwDeadlineDate) {
        this.hwName = hwName;
        this.hwDeadlineDate = hwDeadlineDate;
    }

    public String getHwName() {
        return hwName;
    }

    public void setHwName(String hwName) {
        this.hwName = hwName;
    }

    public String getHwDeadlineDate() {
        return hwDeadlineDate;
    }

    public void setHwDeadlineDate(String hwDeadlineDate) {
        this.hwDeadlineDate = hwDeadlineDate;
    }
}
