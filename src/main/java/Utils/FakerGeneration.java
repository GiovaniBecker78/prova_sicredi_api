package Utils;

import com.github.javafaker.Faker;
import java.util.Locale;

public class FakerGeneration {
    public static Faker faker = new Faker(new Locale("pt-BR"));
    public static String getCep(){

        return faker.address().zipCode();
    }


//    {
//        "cep": "91060-900",
//            "logradouro": "Avenida Assis Brasil 3940",
//            "complemento": "",
//            "bairro": "São Sebastião",
//            "localidade": "Porto Alegre",
//            "uf": "RS",
//            "ibge": "4314902",
//            "gia": "",
//            "ddd": "51",
//            "siafi": "8801"
//    }





}
