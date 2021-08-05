package BaseTest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class BaseTestCepValido extends BaseUrl {
    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    private static final String responseFormat = "json";
    private static Map<String, Object> objeto = new HashMap<>();
    private static String cep;

    @BeforeClass
    public static void setUp(){

        buildRequestSpec();
        buildResponseSpec();
    }


    public static void buildRequestSpec(){

        requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath("ws/" + cep + "/" + responseFormat + "/")
                .build();
    }

    public static void buildResponseSpec(){
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    


}
