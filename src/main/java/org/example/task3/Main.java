package org.example.task3;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
