# 🚀 Projeto Aluno - API REST com Spring Boot e PostgreSQL

Projeto desenvolvido como entrega da **Semana 02** de Desenvolvimento de APIs e Backend. O objetivo principal é a construção de uma API REST completa utilizando o ecossistema Spring Boot, aplicando a arquitetura em camadas e garantindo a persistência real de dados com JPA/Hibernate e PostgreSQL.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Data JPA / Hibernate**
* **PostgreSQL**
* **Maven** (Gerenciador de dependências)

---

## 🏗️ Arquitetura do Projeto

O projeto segue rigorosamente a arquitetura em camadas para separar as responsabilidades:

1. **Controller (`controller`)**: Camada de entrada que recebe as requisições HTTP e devolve as respostas aos clientes.
2. **Service (`service`)**: Camada de regras de negócio da aplicação.
3. **Repository (`repository`)**: Interface que estende `JpaRepository` para gerenciar a persistência e comunicação com o banco de dados.
4. **Entity (`model`)**: Representação das tabelas do banco de dados mapeadas através de anotações JPA (`@Entity`).

---

## ⚙️ Configuração e Execução

### 1. Pré-requisitos
* Ter o **Java** instalado na máquina.
* Ter o **PostgreSQL** a correr localmente.

### 2. Configurar a Base de Dados
Cria uma base de dados no teu PostgreSQL com o nome `escola_db`:
```sql
CREATE DATABASE escola_db;
