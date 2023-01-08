package org.example.task3;

public class DataBase extends БазаДаних{
    public String getUserData(){
        return super.отриматиДаніКористувача();
    }
    public String getStatisticData(){
        return super.отриматиСтатистичніДані();
    }
}
