package BaseTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTestCepValido extends BaseUrl {
    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    private static final String responseFormat = "json";

    @BeforeClass
    public static void buildRequestSpec(){
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath("ws/99999999/" + responseFormat + "/")
                .build();
    }

    @BeforeClass
    public static void buildResponseSpec(){
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }


}
