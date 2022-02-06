public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;   //Текущий баланс клиента в рублях
        int payment = 1001; //Сумма платежа в рублях
        int resultBalance;  //Баланс клиента после пополнения
        int bonus;  //Кол-во бонусных рублей полученных клиентов при пополнении баланса

        bonus = payment > 1000 ? payment / 100 : 0; //Расчет кол-ва бонусных рублей

        resultBalance = currentBalance + payment + bonus; //Рассчте баланса клиента после пополнения с учетом бонусов
        System.out.println("Текущий баланс состоявляет: " + resultBalance + ", сумма платежа: " + payment + ", кол-во бонусов: " + bonus);

    }
}
