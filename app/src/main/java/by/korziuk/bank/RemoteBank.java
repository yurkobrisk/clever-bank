package by.korziuk.bank;

import by.korziuk.model.Client;

public class RemoteBank implements Bank {

    private String name;

    public RemoteBank(String name) {
        this.name = name;
    }

    @Override
    public void addClient(Client client) {
        //ToDo fill addClient method
        System.out.println("it's the addClient method.");
    }

    @Override
    public void deleteClient(Client client) {
        //ToDo fill deleteClient method
        System.out.println("it's the deleteClient method.");
    }

    @Override
    public void editClient(Client client) {
        //ToDo fill editClient method
        System.out.println("it's the editClient method.");
    }
}
