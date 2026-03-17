<div align="center">

# 🍔 HamburgueriaZ  
### Mobile Architecture Evolution Project

From academic implementation to structured mobile engineering.

---

![Android](https://img.shields.io/badge/Android-34A853?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![XML](https://img.shields.io/badge/XML-005FAD?style=for-the-badge)
![Architecture](https://img.shields.io/badge/Layered_Architecture-00BFA6?style=for-the-badge)
![AI Ready](https://img.shields.io/badge/AI_Ready-00BFA6?style=for-the-badge)

</div>

---

# 🇧🇷 Português

---

## 💙 Sobre o Projeto

Este projeto representa minha evolução como desenvolvedora e engenheira de software.

A versão **original** foi construída como exercício acadêmico.  
A versão **improved** demonstra crescimento técnico através de:

- Refatoração estruturada  
- Separação de responsabilidades  
- Organização em camadas  
- Aplicação de princípios de arquitetura  
- Melhoria na experiência do usuário  
- Uso real de Git (branch, sincronização remota)

Mais do que um app de hamburgueria, este projeto mostra maturidade na construção de software.

---

## 📱 Funcionalidades

| Recurso | Implementação Técnica |
|----------|----------------------|
| 🛒 **Carrinho Inteligente** | Gerenciado pela classe `Cart` com cálculo delegado ao `PriceCalculator` |
| 🔢 **Controle de Quantidade** | Validação aplicada antes da atualização da UI |
| 🎨 **UI Customizada** | Fonte Tahoma integrada + seletor dinâmico de cores |
| 📧 **Envio por Email** | Integração via `Intent.ACTION_SEND` |
| 🆔 **Código Único** | Identificador automático gerado na criação do pedido |
| 📦 **Resumo Estruturado** | Construído a partir do objeto `Order` |

---

## 🏗 Arquitetura

```text
Presentation Layer
└── MainActivity.java
        │
        ▼
Domain Layer
├── model/
│   ├── Cart.java
│   └── Order.java
│
└── service/
    └── PriceCalculator.java
```

---

## 🧠 Design Decisions

O projeto foi estruturado com foco em separação de responsabilidades e preparação para escalabilidade.

### 📐 Diagrama Conceitual

```text
User Interaction
        │
        ▼
MainActivity (UI Layer)
        │
        ▼
Cart / Order (Domain Model)
        │
        ▼
PriceCalculator (Business Logic)
        │
        ▼
Result → UI Update / Email Intent
```

---

## 🔎 Justificativa Técnica

- Lógica isolada da interface  
- Redução de acoplamento  
- Facilidade de manutenção  
- Preparação para integração com Agente Inteligente  

---

## 📌 Lessons Learned

Durante a evolução do projeto, aprimorei:

- Organização em camadas  
- Aplicação de princípios de arquitetura  
- Separação entre UI e regra de negócio  
- Controle de versão com Git  
- Planejamento para escalabilidade futura  

---

## 🤖 Próxima Evolução — Agente Inteligente de Pedido

O projeto evoluirá para incluir um **Agente Inteligente**, capaz de:

- Interpretar preferências do cliente  
- Sugerir combinações automaticamente  
- Recomendar adicionais  
- Simular atendimento digital  
- Permitir futura integração com IA generativa  

A arquitetura atual já foi preparada para essa expansão.

---

## 📈 Evolução do Projeto

```text
original/  → Implementação acadêmica
improved/  → Arquitetura estruturada
agent/     → (em breve) Agente Inteligente
```

---

# 🇺🇸 English

---

## 💙 About the Project

This project represents my growth as a software engineer.

The **original version** was developed as an academic assignment.  
The **improved version** demonstrates:

- Structured refactoring  
- Separation of concerns  
- Layered organization  
- Application of architectural principles  
- UX improvements  
- Real Git workflow experience  

This is more than a burger ordering app — it reflects architectural maturity.

---

## 📱 Features

| Feature | Technical Implementation |
|----------|------------------------|
| 🛒 **Smart Cart** | Managed by `Cart` class with delegated calculation to `PriceCalculator` |
| 🔢 **Quantity Control** | Validation before UI update |
| 🎨 **Custom UI** | Tahoma font integration + dynamic text selector |
| 📧 **Email Integration** | Built using `Intent.ACTION_SEND` |
| 🆔 **Unique Client Code** | Automatically generated identifier |
| 📦 **Structured Summary** | Built from `Order` object |

---

## 🏗 Architecture

```text
Presentation Layer
└── MainActivity.java
        │
        ▼
Domain Layer
├── model/
│   ├── Cart.java
│   └── Order.java
│
└── service/
    └── PriceCalculator.java
```

---

## 🧠 Design Decisions

The project was structured to support separation of concerns and future scalability.

### 📐 Conceptual Diagram

```text
User Interaction
        │
        ▼
MainActivity (UI Layer)
        │
        ▼
Cart / Order (Domain Model)
        │
        ▼
PriceCalculator (Business Logic)
        │
        ▼
Result → UI Update / Email Intent
```

---

## 📌 Lessons Learned

Through this evolution I improved:

- Layered structuring  
- Architectural thinking  
- Separation between UI and business logic  
- Git workflow management  
- Scalability planning  

---

## 🤖 Next Evolution — Intelligent Order Agent

The project will evolve to include an **Intelligent Order Agent** capable of:

- Understanding customer preferences  
- Suggesting combinations  
- Recommending add-ons  
- Simulating digital assistance  
- Preparing for AI integration  

The current architecture was designed to support this expansion.

---

Developed with 💙 by Nayara Berti
