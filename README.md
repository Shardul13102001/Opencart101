# Opencart101

Opencart101 is an end-to-end build automation framework developed from scratch. The primary goal of this project is to automate the entire build, testing, and deployment process for Opencart-based applications, leveraging a modular and extensible approach. The framework is designed with scalability and maintainability in mind, making it suitable for both individual developers and teams.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
  - [Running the Framework](#running-the-framework)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Features

- **Build Automation:** Automates build processes for Opencart projects.
- **Test Automation:** Integrates end-to-end testing capabilities.
- **Modular Design:** Easily extend or replace components.
- **Cross-browser Support:** Automation integrates with multiple browsers.
- **Continuous Integration Friendly:** Hooks for CI/CD pipelines.
- **Comprehensive Reporting:** Test and build reports generated automatically.
- **Customizable Configuration:** Environment and test parameters configurable via external files.
- **Supports HTML, CSS, Java, and JavaScript:** Multi-language support for flexible extensions.

---

## Tech Stack

- **HTML/CSS:** For reporting and dashboard UI.
- **Java:** Core automation logic and test runner.
- **JavaScript:** For dynamic interactions and possible scripting.
- **Other Tools:** Selenium/WebDriver (if UI automation is included), Maven/Gradle (for build management).

---

## Project Structure

```
Opencart101/
│
├── src/
│   ├── main/
│   │   ├── java/            # Java source files for core automation logic
│   │   ├── resources/       # Configuration files and resources
│   │   └── web/             # HTML, CSS, JS for dashboard and reports
│   └── test/
│       └── java/            # Test scripts and test data
│
├── reports/                 # Generated test and build reports
├── config/                  # Framework and environment configuration files
├── scripts/                 # Utility or helper scripts (e.g., install, cleanup)
├── .gitignore
├── pom.xml / build.gradle   # Build tool configuration
└── README.md
```

---

## Getting Started

### Prerequisites

- Java 8 or newer installed.
- Node.js & npm (if using JavaScript utilities).
- Maven or Gradle (for builds).
- Web browser(s) for testing (Chrome, Firefox, etc.).
- (Optional) Docker for containerized execution.

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Shardul13102001/Opencart101.git
   cd Opencart101
   ```

2. **Install dependencies:**
   - For Java:
     ```bash
     mvn clean install
     ```
   - For Node.js (if applicable):
     ```bash
     cd src/main/web
     npm install
     ```

### Configuration

- Adjust environment settings in the `config/` directory.
- Update test data and parameters as needed in `src/test/java` or via external `.properties`/`.yaml` files.

### Running the Framework

- **Build the project:**
  ```bash
  mvn clean package
  ```
- **Execute tests:**
  ```bash
  mvn test
  ```
- **View reports:**
  - Generated reports are available in the `reports/` directory.
  - Open the `index.html` in your browser for a dashboard view (if available).

---

## Usage

- **Automate Opencart builds:** Integrate your Opencart project with this framework to automate builds.
- **Customize test scripts:** Add or edit test scripts in the `src/test/java` directory.
- **Integrate with CI/CD:** Add the provided scripts/commands to your pipeline for automated builds and testing.

---

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with clear messages.
4. Open a Pull Request describing your changes.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact
Email - shardulbadare0011@gmail.com
X (Tweeter) - https://x.com/Shardul40031995

---

For any questions, suggestions, or issues, please open an issue in the repository or contact the maintainer:

- **GitHub:** [Shardul13102001](https://github.com/Shardul13102001)

---
