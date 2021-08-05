package TestCases;

import BaseTest.BaseTestCepValido;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CepValido extends BaseTestCepValido {

    @Test
    public void retornaCepValido(){
        //Response myResponse =

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

//        String cep = myResponse.then().extract().path("cep");
//        Assert.assertEquals(cep,"91060-900");
//
//        String logradouro = myResponse.then().extract().path("logradouro");
//        Assert.assertEquals(logradouro,"Avenida Assis Brasil 3940");
//
//        String complemento = myResponse.then().extract().path("complemento");
//        Assert.assertEquals(complemento,"");
//
//        String bairro = myResponse.then().extract().path("bairro");
//        Assert.assertEquals(bairro,"São Sebastião");
//
//        String localidade = myResponse.then().extract().path("localidade");
//        Assert.assertEquals(localidade,"Porto Alegre");
//
//        String uf = myResponse.then().extract().path("uf");
//        Assert.assertEquals(uf,"RS");
//
//        String ibge = myResponse.then().extract().path("ibge");
//        Assert.assertEquals(ibge,"4314902");









    }


}
