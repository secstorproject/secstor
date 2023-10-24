# Secstor 🛡️

Desenvolvendo uma biblioteca/API para a utilização de algoritmos de compartilhamento de segredos, visando a adequação de sistemas à LGPD.

![Java](https://img.shields.io/badge/JDK-17+-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0.27+-blue)
![VSCode Lombok](https://img.shields.io/badge/VSCode-Lombok-9cf)

## 🔧 Requerimentos

- **JDK 17** ou superior
- **JRE 1.8.0** ou superior
- **MySQL 8.0.27** ou superior
- **Lombok Annotations Support** para Visual Studio Code

## 🚀 Começando

1. Clone o repositório:
2. Abra o projeto na sua IDE/editor de código favorito.
3. Crie um arquivo `config.properties` dentro de `src/main/resources`.
4. Adicione as configurações necessárias ao arquivo:
   ```properties
   server.port=PORTA DESEJADA
   spring.datasource.url=jdbc:mysql://localhost:3306/NOME DO BANCO DE DADOS?createDatabaseIfNotExist=true
   spring.datasource.username=USUÁRIO DO BANCO DE DADOS
   spring.datasource.password=SENHA DO BANCO DE DADOS
   secstor.n=NÚMERO DE CHAVES GERADAS NO SPLIT
   secstor.k=NÚMERO MÍNIMO DE CHAVES UTILIZADAS NO RECONSTRUCT
   ```
5. Se estiver usando Docker:
   ```bash
   docker-compose up --build --force-recreate
   ```
6. Realize um build do projeto.
7. Execute a partir da classe principal.

## ⚖️ Request Throttling

Configuração do **bucket4j** para **ratelimit** em `src/main/resources/application.properties`:

```properties
# Configuração bucket4j
bucket4j.enabled=true
bucket4j.filters[0].cache-name=rateLimit
bucket4j.filters[0].url=/api/v1/*
# ... [restante das configurações]
```

## ⏱️ Testes de Tempo

1. Navegue até a pasta raiz do projeto.
2. Execute `timing-test-runner.sh`.
3. Siga as instruções do script.

> 📝 **Nota**: A execução gera resultados em formato `.csv` e um dataset para reconstrução que pode ser usado com as rotas de reconstruct da API.

## 📜 Referências

[T. Loruenser, A. Happe, D. Slamanig](https://github.com/Archistar/archistar-smc): ARCHISTAR: Towards Secure and Robust Cloud Based Data Sharing. CloudCom 2015, IEEE.

---

👤 **Contribuidor Principal**: [Acacio-coding](https://github.com/Acacio-coding/Secstor-main)