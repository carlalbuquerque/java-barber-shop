# 📌 Projeto Backend - API Spring Boot

## 🚀 Sobre o Projeto
Este é o backend do sistema **Barber Shop**, desenvolvido com **Spring Boot** para fornecer uma API robusta e segura para a aplicação frontend. O projeto foi criado como uma atividade prática proposta durante um **bootcamp da DIO**, visando consolidar conhecimentos em desenvolvimento de APIs, banco de dados relacional e boas práticas de arquitetura.

## 🛠 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**

## 📂 Estrutura do Projeto
```
📂 src/
 ┣ 📂 main/
 ┃ ┣ 📂 java/com/seuusuario/seuprojeto/
 ┃ ┃ ┣ 📂 config/         # Configurações gerais do projeto
 ┃ ┃ ┣ 📂 controllers/    # Controladores REST
 ┃ ┃ ┣ 📂 entity/         # Modelos de entidades
 ┃ ┃ ┣ 📂 exception/      # Tratamento de exceções
 ┃ ┃ ┣ 📂 exceptionhandler/ # Manipulador de exceções globais
 ┃ ┃ ┣ 📂 mapper/         # Mapeamento de entidades para DTOs
 ┃ ┃ ┣ 📂 repository/     # Camada de acesso a dados (JPA/Hibernate)
 ┃ ┃ ┣ 📂 service/        # Lógica de negócio
 ┃ ┃ ┗ 📜 BarberShopUiApplication.java  # Classe principal do Spring Boot
 ┃ ┣ 📂 resources/
 ┃ ┃ ┣ 📂 db/migration/   # Scripts para versionamento do banco de dados
 ┃ ┃ ┣ 📂 static/         # Arquivos estáticos
 ┃ ┃ ┣ 📂 templates/      # Templates de e-mail ou HTML (se aplicável)
 ┃ ┃ ┣ 📜 application.yml  # Configuração do banco de dados e ambiente
 ┃ ┣ 📂 test/
 ┃ ┃ ┣ 📂 java/com/seuusuario/seuprojeto/  # Testes unitários e de integração
 ┗ 📜 build.gradle.kts  # Gerenciador de dependências Gradle
```

## 🔧 Configuração do Banco de Dados
A API utiliza **PostgreSQL** em produção. As configurações estão no arquivo `application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco
    username: seu_usuario
    password: sua_senha
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```
> **Nota:** Certifique-se de que o PostgreSQL está rodando e que o banco de dados foi criado antes de iniciar a API.

## ⚙️ Como Rodar o Projeto
### Pré-requisitos
Antes de começar, certifique-se de ter instalado:
- **JDK 17+**
- **Gradle**
- **PostgreSQL**

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd nome-do-projeto
   ```
3. Compile o projeto e baixe as dependências:
   ```bash
   ./gradlew build
   ```
4. Inicie a API:
   ```bash
   ./gradlew bootRun
   ```

## 🚀 Funcionalidades Principais
- [x] CRUD de clientes
- [x] Sistema de agendamentos
- [x] Autenticação e autorização (se aplicável)
- [x] Integração com PostgreSQL


