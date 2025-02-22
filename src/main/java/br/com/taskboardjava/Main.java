package br.com.taskboardjava;

import br.com.taskboardjava.persistence.migration.MigrationStrategy;
import br.com.taskboardjava.ui.MainMenu;

import java.sql.SQLException;

import static br.com.taskboardjava.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
