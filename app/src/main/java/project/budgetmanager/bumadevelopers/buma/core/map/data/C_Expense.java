package project.budgetmanager.bumadevelopers.buma.core.map.data;

/**
 * Captura los comercios
 */

public class C_Expense {
    private String localName;
    private String currentDate;
    private String detail;
    private Double pay;
    private String bill;
    private String photo;

    public C_Expense(String localName, String currentDate, String detail, Double pay, String bill, String photo) {
        this.localName = localName;
        this.currentDate = currentDate;
        this.detail = detail;
        this.pay = pay;
        this.bill = bill;
        this.photo = photo;
    }

    public C_Expense() {
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
