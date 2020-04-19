import java.util.ArrayList;

public class Bank {
    private static ArrayList<Bank> allBanks = new ArrayList<Bank>();
    String name ;
    String bankID;
    String hello;
    String bye;

    public Bank(String name) {
        this.bye = "bye";
        this.hello = "hello";
        this.name = name ;
        allBanks.add(this) ;
        System.out.println("good bye");
        System.out.println("hi");
    }



    public void printMassage(){
        System.out.println("get the fuck out of here because faraz is here");
    }

    public void printGood(){
        System.out.println("good");
    }

    public String getBankID() {
        return bankID;
    }
}