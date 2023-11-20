package com.javacrudmongo;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoDBConnection {

    private static MongoDBConnection instance = null;
    private MongoClient mongoClient;

    private MongoDBConnection() {
        String database = "mongodb://rootuser:rootpass@localhost:27017/";
        ConnectionString connectionString = new ConnectionString(database);
        mongoClient = MongoClients.create(connectionString);
    }

    public static synchronized MongoDBConnection getInstance() {
        if (instance == null) {
            instance = new MongoDBConnection();
        }
        return instance;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }
}
