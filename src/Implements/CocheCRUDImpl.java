package Implements;

import Interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public String save() {
        return "save()";
    }

    @Override
    public String findAll() {
        return "findAll()";
    }

    @Override
    public String delete() {
        return "delete()";
    }
}
