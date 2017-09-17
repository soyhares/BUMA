package project.budgetmanager.bumadevelopers.buma.core.map.data;

/**
 * Created by HARES on 15/04/2017.
 */

public class C_Budget {
    private float money;
    private String subject;

    public C_Budget(float money, String subject) {
        this.money = money;
        this.subject = subject;
    }

    public C_Budget() {
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
