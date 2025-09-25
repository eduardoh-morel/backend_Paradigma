# Java SpringBoot - MicroServices

Projeto backend implementado em Java, seguindo arquitetura de microsserviços visando modularidade, escalabilidade e manutenção.

---

## 📝 Visão geral

O **backend_Paradigma** é um conjunto de microserviços Java (Spring Boot) que se comunicam entre si para fornecer diferentes funcionalidades (configurações, greeting, currency, produto, etc.). Ele serve como camada de backend para suportar aplicações cliente (front-end ou outras integrações) por meio de APIs REST.

---

## 🧱 Tecnologias utilizadas

A partir da análise da estrutura do repositório, estas são as principais tecnologias usadas:

- **Java** — linguagem principal para os microserviços.  
- **Spring Boot** — framework usado para criação de aplicações web e microsserviços em Java, com convenções e auto-configuração.
- **Spring Cloud / Eureka / Config Server ** — módulos para gerenciar configuração centralizada, descoberta de serviços etc. 
- **Comunicação entre serviços REST / HTTP** — para integração entre microsserviços.  
- **Padrões de arquitetura de microsserviços** — separação de responsabilidades entre serviços como `greeting-service`, `currency-service`, `product-service`, etc.  
- **Gerenciamento de configuração centralizada** — presença de pasta `config-service` indica que as propriedades de cada serviço são centralizadas e compartihadas.   
- **Controle de versão com Git 

---

## 📂 Estrutura do projeto (diretórios principais)

- **config-service**: serviço de configuração centralizada para os demais microsserviços.
- **greeting-service**: serviço que provavelmente oferece endpoints de saudação (mensagens).
- **currency-service**: serviço que trata de operações relacionadas a moedas (ex: taxas, conversão).
- **product-service**: serviço que gerencia operações de produtos (CRUD de produtos, etc.).
