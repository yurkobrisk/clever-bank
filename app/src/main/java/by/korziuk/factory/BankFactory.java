package by.korziuk.factory;

import by.korziuk.bank.Bank;

public interface BankFactory {
    Bank createBank(String name);
}
