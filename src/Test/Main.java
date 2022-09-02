package Test;

import Implements.CocheCRUDImpl;
import Interfaces.CocheCRUD;


public class Main {
    public static void main(String[] args) {
        CocheCRUD crud = new CocheCRUDImpl();

        System.out.println("Método "+crud.save());
        System.out.println("Método "+crud.delete());
        System.out.println("Método "+crud.findAll());
    }
}
