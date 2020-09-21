public class Main {
    public static void main(String[] args) {

        int account = 100;
        int addedMoney = 100;
        int bonus = 0;
        if (addedMoney > 1000) {
            bonus = addedMoney / 100;
        }
        account = account + addedMoney + bonus;
        System.out.println(bonus);

        account = 100;
        addedMoney = 1100;
        bonus = 0;
        if (addedMoney > 1000) {
            bonus = addedMoney / 100;
        }
        account = account + addedMoney + bonus;
        System.out.println(bonus);
    }
}
