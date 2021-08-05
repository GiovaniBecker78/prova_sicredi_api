## prova_sicredi_api


### Objetivo
Desenvolver testes automatizados baseado nos cenários abaixo, utilizando o serviço que esta no link:
#### URL: https://viacep.com.br/ws/91060900/json/
#### Método http: Get
#### **Cenário 1:** Consulta CEP valido
Dado que o usuário inseri um CEP válido
Quando o serviço é consultado
Então é retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge.
#### **Cenário 2:** Consulta CEP inexistente
Dado que o usuário inseri um CEP que não exista na base dos Correios
Quando o serviço é consultado
Então é retornada um atributo erro
#### **Cenário 3:** Consulta CEP com formato inválido
Dado que o usuário inseri um CEP com formato inválido
Quando o serviço é consultado
Então é retornado uma mensagem de erro

### Tecnologias
- Java 8
- TestNG 7.4.0
- Rest Assured 4.4.0
- Java Faker  1.0.2
- Jackson Databind 2.12
- Json Schema Validator 4.4.0


