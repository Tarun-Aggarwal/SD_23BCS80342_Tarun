class BankService {
    int balance;
}

class DepositService extends BankService {
    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(this.balance);
    }
}

class WithdrawService extends BankService {
    public void withdraw(int amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient Funds");
            return;
        }

        this.balance -= amount;
    }
}

class NotificationService extends BankService {
    public void notifyUser() {
        System.out.println("Updated Balance: " + this.balance);
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}