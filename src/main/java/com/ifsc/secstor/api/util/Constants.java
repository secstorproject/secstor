package com.ifsc.secstor.api.util;


public class Constants {

    public static final String DATA = "data";
    public static final String ATTRIBUTE_CONFIG = "attribute_config";
    public static final String GENERALIZATION_LEVEL = "generalization_level";
    public static final String CLASSIFICATION = "classification";
    public static final String METHOD = "method";
    public static final String GENERALIZATION = "generalization";
    public static final String RANDOMIZATION = "randomization";
    public static final String IDENTIFIER = "identifier";
    public static final String SENSITIVE = "sensitive";
    public static final String QUASI_IDENTIFIER = "quasi-identifier";
    public static final String SHAMIR = "shamir";
    public static final String PSS = "pss";
    public static final String CSS = "css";
    public static final String KRAWCZYK = "krawczyk";
    public static final String PVSS = "pvss";
    public static final String SECRET = "secret";
    public static final String MACKEYS = "macKeys";
    public static final String FINGERPRINTS = "fingerprints";
    public static final String ENCKEYS = "encKeys";
    public static final String MODULUS = "modulus";
    public static final String SHARES = "shares";
    public static final String USERNAME = "username";
    public static final String ID = "id";
    public static final String TOKEN_BEARER = "Bearer ";
    public static final String HASHED_PASSWORD = "Hashed";
    public static final String CLIENT = "client";
    public static final String ADMINISTRATOR = "administrator";
    public static final String REGISTER_TEMPLATE = "register";
    public static final String SUCCESS_TEMPLATE = "success";
    public static final String ERROR_TEMPLATE = "error";
    public static final String ERROR = "error";
    public static final String USER = "user";
    public static final String USERNAMES = "usernames";
    public static final String ROLE = "role";
    public static final String REFRESH_TOKEN = "refresh_token";
    public static final String ACCESS_TOKEN = "access_token";
    public static final String PASSWORD = "password";
    public static final String SHARE = "share";
    public static final String MACKEY = "macKey";
    public static final String INNER_MACKEY = "inner object of macKeys";
    public static final String MAC = "mac";
    public static final String INNER_MAC = "inner object of macs";
    public static final String FINGERPRINT = "fingerprint";
    public static final String ENCKEY = "encKey";
    public static final String PARAMETERS = "parameters";
    public static final String DOYOURBEST = "doYourBest";
    public static final String KEY = "key";
    public static final String HTTP_200_CODE = "200";
    public static final String HTTP_200_DESCRIPTION = "Operação realizada com sucesso";
    public static final String HTTP_400_CODE = "400";
    public static final String HTTP_400_DESCRIPTION = "Erro de validação, problemas relacionados a requisição enviada";
    public static final String SPLIT_DATA_DTO_DESCRIPTION = "A informação que você deseja que um segredo seja gerado";
    public static final String SPLIT_DATA_DTO_EXAMPLE = "{\"nome\":\"exemplo\",\"gênero\":\"masculino\"}";
    public static final String SPLIT_ALGORITHM_DESCRIPTION = "O algoritmo que você deseja usar, pode ser shamir, pss, css, krawczyk ou pvss";
    public static final String SECRET_SHARING_TAG = "Compartilhamento de Segredo";
    public static final String SPLIT_TITLE = "Realiza a criação das chaves do segredo compartilhado";
    public static final String SPLIT_DESCRIPTION = "A partir do algoritmo passado no corpo da requisição, cria as chaves do segredo compartilhado, onde a chave 'data' é a informação que será transformada no segredo e poderá ser reconstruída a partir das chaves geradas.";
    public static final String SPLIT_RESPONSE_SUCCESS = "{\"shares\":[{\"index\":1,\"key\":\"f3G9YiUEFddb9J5Rhl8LDQtdcd8onRk0KwLAJJLS/Z0hpxeSQjXRiQ==\"},{\"index\":2,\"key\":\"mLdBZruzAf8JAMn4Ft4A4RAE6oYY+RtZuA4Ola93tDLp7TISqh1cPg==\"},{\"index\":3,\"key\":\"fw8g7UmmJv3rTEIy97K+2MEtoGv7dCmzqFVqHiuCb/GNpMgrYOMJ7Q==\"},{\"index\":4,\"key\":\"Wic9p49F540M/dXveusFh1nG+UteRdWPbooire0QDIEbvd1TIeHFYA==\"},{\"index\":5,\"key\":\"LjRlmXwBsDgImEDlrVOOIlp6/BCFySFjnFPz6uUOH4GNEoceY0TFRg==\"},{\"index\":6,\"key\":\"8rnr6uAURGOLPivRUWfv6/gU+TjFr7IC1kZK3t1g27W8if92htriBg==\"},{\"index\":7,\"key\":\"ZUEBUqkkAzkUhtMljJy9FQPw5TYWmQNVbakdDOE0j5gMvST5IttEBw==\"},{\"index\":8,\"key\":\"twLnc3IImhmhZyaXEUiTG6jJagu00bM8HQZ2tgKMe8BMoCCMZph3zQ==\"},{\"index\":9,\"key\":\"xcfQkD4wcBJnUriEIhAgM+7WGFG/4vt161l6v7i44AXhzeG6ULPNyg==\"},{\"index\":10,\"key\":\"863k/xXrniZF8SjnlyrM49fHKKHyM6qB5q7f6yb3oqIo92su9UHCUA==\"}],\"originalLength\":40}";
    public static final String SPLIT_RESPONSE_ERROR = "{\"status\":400,\"timestamp\":\"04/07/2022 21:32:26\",\"title\":\"Validation Error\",\"message\":\"Algorithm provided is invalid, it must be either SHAMIR, PSS, CSS, KRAWCZYK or PVSS\",\"path\":\"/api/v1/secret-sharing/split\"}";
    public static final String RECONSTRUCT_PARAMETERS_DTO_DESCRIPTION = "Um objeto que pode conter um parâmetro chamado \"doYourBest\" para tentar a reconstrução mesmo que contenham chaves ou parâmetros inválidos";
    public static final String RECONSTRUCT_PARAMETERS_DTO_EXAMPLE = "{\"doYourBest\":true}";
    public static final String RECONSTRUCT_SECRET_DTO_DESCRIPTION = "O segredo com as chaves e demais parâmetros usados na reconstrução";
    public static final String RECONSTRUCT_SECRET_DTO_EXAMPLE = "{\"shares\":[{\"index\":1,\"key\":\"cDageS0=\"},{\"index\":2,\"key\":\"l/BcfbM=\"},{\"index\":3,\"key\":\"cEg99kE=\"},{\"index\":4,\"key\":\"VWAgvIc=\"},{\"index\":5,\"key\":\"IXN4gnQ=\"},{\"index\":6,\"key\":\"/f728eg=\"},{\"index\":7,\"key\":\"agYcSaE=\"},{\"index\":8,\"key\":\"uEX6aHo=\"},{\"index\":9,\"key\":\"yoDNizY=\"},{\"index\":10,\"key\":\"/Or55B0=\"}],\"originalLength\":5}";
    public static final String RECONSTRUCT_TITLE = "Realiza a junção das chaves do segredo compartilhado";
    public static final String RECONSTRUCT_DESCRIPTION = "A partir do segredo passado, reconstrói a informação referente ao mesmo. A chave parâmeters aceita uma chave booleana \"doYourBest\" que força o algoritmo a tentar reconstruir quase independente das validações pré reconstrução.";
    public static final String RECONSTRUCT_RESPONSE_SUCCESS = "{\"nome\":\"exemplo\",\"gênero\":\"masculino\"}";
    public static final String RECONSTRUCT_RESPONSE_ERROR = "{\"status\":400,\"timestamp\":\"04/07/2022 23:42:23\",\"title\":\"Validation Error\",\"message\":\"All parameters must not have equal key indexes\",\"path\":\"/api/v1/secret-sharing/reconstruct\"}";
    public static final String ANONYMIZATION_TITLE = "Realiza anonimização dos dados a partir das informações passadas";
    public static final String ANONYMIZATION_DESCRIPTION = "A partir dos parâmetros para cada campo da request, utiliza uma técnica de anonimização de dados (generalização ou randomização). A a generalização de textos pode ser total (realiza uma supressão), por nível especificado, ou generalização pelo menor nível de diferença entre as informações onde o nível é a posição na string";
    public static final String ANONYMIZATION_TAG = "Anonimização de Dados";
    public static final String ANONYMIZATION_RESPONSE_SUCCESS = "[{\"nome\":\"testing******\"},{\"nome\":\"testing******\"}]";
    public static final String ANONYMIZATION_RESPONSE_ERROR = "{\"status\":400,\"timestamp\":\"04/07/2022 21:03:20\",\"title\":\"Validation Error\",\"message\":\"Method provided for parameter: NOME is invalid, it must be either generalization or randomization\",\"path\":\"/api/v1/data-anonymization/anonymize\"}";
    public static final String ANONYMIZATION_DTO_GEN_LEVEL_DESC = "Parâmetro de configuração para todos os atributos que devem ser generalizados";
    public static final String ANONYMIZATION_DTO_GEN_LEVEL_EXAMPLE = "6";
    public static final String ANONYMIZATION_DTO_ATTR_CONFIG_DESC = "Configurações para cada atributo presente na chave \"data\", para cada atributo deverá haver uma chave \"classification\" que pode ser identifier or sensitive e uma chave \"method\" que pode ser generalization ou generalization";
    public static final String ANONYMIZATION_DTO_ATTR_CONFIG_EXAMPLE = "{\"nome\":{\"classification\":\"sensitive\",\"method\":\"generalization\"}}";
    public static final String ANONYMIZATION_DTO_DATA_DESCRIPTION = "Os dados que devem ser anonimizados";
    public static final String ANONYMIZATION_DATA_LEVEL_EXAMPLE = "[{\"nome\":\"testing234567\"},{\"nome\":\"testing123456\"}]";
    public static final String AUTHENTICATION_TAG = "Autenticação";
    public static final String BEARER_AUTH = "bearerAuth";
    public static final String LOGIN_TITLE = "Realiza a autenticação de usuários";
    public static final String LOGIN_DESCRIPTION = "Tenta realizar a autenticação a partir do usuário e senha informados.";
    public static final String LOGIN_400_RESPONSE = "O usuário não foi encontrado com as credenciais informadas";
    public static final String LOGIN_RESPONSE_SUCCESS = "{\"access_token\":\"eyJ0eXAiOiJKV1QiLCJhbIkFETUlOSV0cDovL2xvY2FsaG9zdDo4MDgwL2FwaS92MS9sb2dpbiIsImV4cCI6MTY1NzIyNjgwNX0.lQ-9Aex0rjFgJHZ3hD0zLQrsUmX2Kc5MgHnI6gHKXAs\",\"refresh_token\":\"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiwiZXhwIjoxNjU3MzEyNjA1fQ.r5GfRSqUbvxvkuPoosgudg\"}";
    public static final String LOGIN_RESPONSE_ERROR = "{\"status\":400,\"timestamp\":\"07/07/2022 17:40:58\",\"title\":\"Authentication Error\",\"message\":\"User not found with provided credentials\",\"path\":\"/api/v1/login\"}";
    public static final String REFRESH_TOKEN_TITLE = "Realiza a renovação do token de acesso";
    public static final String REFRESH_TOKEN_DESCRIPTION = "Tenta renovar o token de acesso a partir do token de renovação informado no header";
    public static final String REFRESH_TOKEN_RESPONSE_ERROR = "{\"status\":400,\"timestamp\":\"07/07/2022 18:54:49\",\"title\":\"Validation Error\",\"message\":\"Authorization header is invalid\",\"path\":\"/api/v1/token/refresh\"}";
    public static final String REGISTER_TITLE = "Realiza o cadastro de um usuário";
    public static final String REGISTER_DESCRIPTION = "Tenta realizar o cadastro de um usuário a partir das informações passadas";
    public static final String USER_TAG = "Usuário";
    public static final String REGISTER_SUCCESS = "User saved successfully";
    public static final String REGISTER_ERROR = "{\"status\":400,\"timestamp\":\"07/07/2022 19:06:36\",\"title\":\"Validation Error\",\"message\":\"Password must include at least one upper case and lower case letters, a number and a symbol with no white spaces\",\"path\":\"/api/v1/user/save\"}";
}
