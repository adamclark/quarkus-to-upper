package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ToUpperResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/toupper?input=hello")
          .then()
             .statusCode(200)
             .body(is("HELLO"));
    }

}