package io.betterbanking.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    void shouldReturnList_greaterThanZero() {
        given()
        .when()
            .get(String.format("http://localhost:%s", port).concat(String.format("/transactions?accountNumber=%d", 1)))
        .then()
            .statusCode(is(200));
    }

}
