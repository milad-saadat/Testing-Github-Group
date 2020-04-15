import java.util.ArrayList;

public class Bank {
    private static ArrayList<Bank> allBanks = new ArrayList<Bank>();
    String name ;
    String bankID;

    public Bank(String name) {
        this.name = name ;
        allBanks.add(this) ;
    }

    public String getBankID() {
        return bankID;
    }
}