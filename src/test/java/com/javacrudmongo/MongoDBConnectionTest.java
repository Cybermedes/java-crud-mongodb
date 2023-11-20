package com.javacrudmongo;

import com.mongodb.client.MongoClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MongoDBConnectionTest {

    private static MongoClient mongoClient;

    @BeforeEach
    public void setUp() {
        // Initialize the MongoDBSingleton and get the MongoClient instance
        MongoDBConnection mongoDBConnection = MongoDBConnection.getInstance();
        mongoClient = mongoDBConnection.getMongoClient();
    }

    @AfterEach
    public void tearDown() {
        // Close the MongoClient after tests
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    @Test
    @DisplayName("DB Connection Test")
    public void testDatabaseConnection() {
        // Check if the MongoClient is not null
        assertNotNull(mongoClient);
    }
}