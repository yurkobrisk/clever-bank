/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package by.korziuk;

import by.korziuk.factory.BankFactory;
import by.korziuk.factory.RemoteBankFactory;

public class App {

    private static BankFactory bank;

    public static void main(String[] args) {
        init();
        runner("Clever-bank");
    }

    static void init() {
        bank = new RemoteBankFactory();
    }

    static void runner(String bankName) {
        bank.createBank(bankName);
    }
}
