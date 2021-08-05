package TestCases;

import BaseTest.BaseTestCepInexistente;
import BaseTest.BaseUrl;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CepInexistente extends BaseTestCepInexistente {
    @Test
    public void retornaCepValido() {
        given()
                .spec(requestSpec)
                .log().all()
                .when()
                .get()

                .then()
                .spec(responseSpec)
                .log().all()
                .extract().response()
        ;
    }

}
