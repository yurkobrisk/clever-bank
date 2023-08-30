package by.korziuk.factory;

import by.korziuk.bank.Bank;
import by.korziuk.bank.RemoteBank;

public class RemoteBankFactory implements BankFactory {
    @Override
    public Bank createBank(String name) {
        System.out.printf("Bank %s created!", name);
        return new RemoteBank(name);
    }
}
