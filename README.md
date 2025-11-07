# Java Servlets Examples & Mini MVC

A collection of Java Servlet examples — including MVC style servlet + JSP modules.  
This repo helps you learn core servlet concepts like request/response, doGet/doPost, forwarding/redirecting, and session handling.

<p align="left">
  <img alt="Java" src="https://img.shields.io/badge/Java-8%2B-informational">
  <img alt="Servlet API" src="https://img.shields.io/badge/Servlet%20API-4.0%2B-blue">
  <img alt="Tomcat" src="https://img.shields.io/badge/Tomcat-9%2B-orange">
</p>

---
```md
## 📁 Project Layout

Java-Servlets/
├── mvc/ # MVC style servlet + JSP module
│ └── src/main/webapp/
│ ├── index.jsp
│ ├── WEB-INF/
│ │ └── web.xml
│ ├── views/ # JSP Views
│ └── ...controllers # Controllers package
│
└── serveltClass/ # Basic servlet examples (hello, forms, session)
├── src/
└── web/
└── web.xml
```
---

## 🚀 Run Instructions

### Option 1: Run via IDE (Eclipse / IntelliJ / NetBeans)
1. Import folder → **Add as Web App**
2. Configure **Apache Tomcat 9+**
3. Run → `Run on Server`
4. Open browser → `http://localhost:8080/<context-path>`

### Option 2: WAR Deployment
```sh
mvn clean package
# copy generated WAR to:
<tomcat>/webapps/
