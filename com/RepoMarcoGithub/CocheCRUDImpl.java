package com.RepoMarcoGithub;


public class CocheCRUDImpl implements CocheCRUD{



    @Override
    public void save( ) {
        System.out.println("esto es save()");

    }

    @Override
    public void findAll() {
        System.out.println("Estop es findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Esto es delete()");

    }

}
