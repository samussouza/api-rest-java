# API REST em Java com Spring Boot

Este repositório é destinado à prática e desenvolvimento de uma API REST em Java utilizando o Spring Boot. A API é projetada para gerenciar recursos de `Pessoa`, fornecendo operações básicas de CRUD (Create, Read, Update, Delete).

## Funcionalidades

- **Obter todas as pessoas**
  - **Descrição**: Recupera a lista completa de pessoas armazenadas no banco de dados.
  - **Método**: GET
  - **URL**: `/pessoa`

- **Obter pessoa por ID**
  - **Descrição**: Recupera uma pessoa específica com base no ID fornecido.
  - **Método**: GET
  - **URL**: `/pessoa/{id}`
  - **Resposta**: 
    - **200 (OK)** se a pessoa for encontrada.
    - **404 (Not Found)** se a pessoa não for encontrada.

- **Criar nova pessoa**
  - **Descrição**: Adiciona uma nova pessoa ao banco de dados.
  - **Método**: POST
  - **URL**: `/pessoa`
  - **Corpo da Requisição**: JSON com os detalhes da pessoa.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para simplificar o desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para acesso e manipulação de dados no banco de dados.
- **MySQL**: Sistema de gerenciamento de banco de dados.

## Configuração

1. **Configuração do Banco de Dados**
   - As configurações do banco de dados estão localizadas no arquivo `application-database.properties`. Ajuste as propriedades conforme necessário para se conectar ao seu banco de dados MySQL.

2. **Dependências**
   - O projeto utiliza Maven para gerenciamento de dependências. Certifique-se de que o `mysql-connector-java` está incluído no `pom.xml`.

## Como Rodar

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seuusuario/seurepositorio.git
