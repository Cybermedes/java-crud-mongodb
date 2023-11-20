package com.javacrudmongo;


import com.mongodb.client.MongoClient;

public class App {
    public static void main( String[] args ) {
        MongoDBConnection mongoDBConnection = MongoDBConnection.getInstance();
        MongoClient mongoClient = mongoDBConnection.getMongoClient();

    }
}
