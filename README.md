# 🛒 OpenCart101 – Automation Framework

Welcome to **OpenCart101**, an end-to-end automation testing framework built from scratch for an eCommerce web application (OpenCart). This project applies real-world tools and industry-level practices used by automation testers in product-based companies.

---

## 🔧 Tech Stack & Tools Used

- **Language:** Java  
- **Framework:** Selenium WebDriver, TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **CI/CD:** Jenkins  
- **Version Control:** Git & GitHub  
- **Cross-Browser Testing:** Selenium Grid  
- **Containerization:** Docker  
- **Logging:** Log4j  
- **Reporting:** Extent Reports  
- **API Testing:** Postman, Rest Assured  
- **Data Handling:** Apache POI (Excel)  
- **OS & Platforms:** Linux (for containerized runs)  
- **Project Management Tool:** JIRA (experience-based)

---

## 💡 Project Highlights

✅ Built the framework using **Page Object Model (POM)**  
✅ Used **TestNG** for managing and organizing tests via groups and annotations  
✅ Managed dependencies and build using **Maven**  
✅ Implemented **Data-Driven Testing (DDT)** for login via Excel data (Apache POI)  
✅ Executed tests using:
- `pom.xml` (via Maven)
- `.bat` file (for one-click execution)
- **Jenkins** integration for CI/CD pipeline

✅ Integrated with **Selenium Grid** to run parallel tests across multiple browsers  
✅ Created custom **Log4j log files** saved neatly in the `logs` folder  
✅ Implemented **screenshot capture** for failed tests (auto-saved in dedicated folder)  
✅ Designed beautiful **Extent Reports** that generate after execution  
✅ Used **Git & GitHub** for version control  
✅ Setup **Docker containers** for isolated test execution environments  
✅ **API Testing** support via **Postman** and **Rest Assured**  
✅ Few more test cases are currently **WIP…**

---

## 📂 Project Structure
📦 src/test/java
┣ 📁 base → WebDriver setup & teardown
┣ 📁 pages → POM classes for web pages
┣ 📁 tests → TestNG test cases
┣ 📁 utils → Utility files (Excel reader, config reader, etc.)
┣ 📁 listeners → Custom listeners for screenshot & logs

📂 test-output → Extent Reports
📂 logs → Log files (Log4j)
📄 pom.xml → Maven configuration
📄 config.properties
📄 run.bat → Batch file for one-click execution

## 🚀 How to Run the Project

1. Clone the Repository
   
bash
git clone https://github.com/your-username/OpenCart101-Automation-Framework.git

2. Import into IDE (Eclipse/IntelliJ)
   
3. Run via Maven
bash
Copy
Edit
mvn clean test

4. Run using .bat file
Double-click run.bat for instant execution.

5. Run via Jenkins
Set up a Jenkins job pointing to this repo and trigger the build.

In Progress / To-Do

Add test cases for:
Product Search
Checkout flow
Wishlist functionality
Docker Compose setup for scalable Selenium Grid
Add Email/Slack notifications from Jenkins
Integrate Allure Report as an optional reporting tool

🙌 Contributions
Wanna collaborate or suggest something cool?
Feel free to fork the repo, raise an issue, or open a pull request!

📩 Contact
Created with ❤️ by Shardul
📧 Email: shardulbadare0011@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/shardul-badare-476700236/

⭐️ Show Some Love
If this helped or inspired you, give this repo a ⭐️ and share it with fellow testers & developers!

yaml
Copy
Edit

---
THANK YOU!!!
