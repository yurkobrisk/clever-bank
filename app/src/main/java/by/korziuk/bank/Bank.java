package by.korziuk.bank;

import by.korziuk.model.Client;

public interface Bank {

    void addClient(Client client);
    void deleteClient(Client client);
    void editClient(Client client);
}
