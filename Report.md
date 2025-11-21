# Project Report: Java Age Calculator

## 1. Introduction
### 1.1 Purpose
The purpose of the **Age Calculator** application is to provide a simple, user-friendly desktop interface for calculating a person's exact age based on their Date of Birth (DOB). Unlike simple calculators that only show the year, this application calculates the precise age in **years, months, and days**.

### 1.2 Scope
The application is a standalone Desktop GUI (Graphical User Interface) built using Java. It is designed for personal use or educational demonstration of Java Swing and Date/Time APIs.

---

## 2. Software Requirements Specification (SRS)

### 2.1 Functional Requirements
1.  **Input Processing:**
    * The system shall accept a Date of Birth in the specific format `YYYY-MM-DD`.
    * The system shall capture the current system date automatically.
2.  **Calculation Logic:**
    * The system shall calculate the difference between the DOB and the Current Date.
    * The result must display the exact number of Years, Months, and Days.
3.  **Validation:**
    * The system shall prevent calculations if the DOB is in the future.
    * The system shall handle invalid date formats (e.g., text instead of numbers, invalid months like 13) gracefully.
4.  **Output:**
    * The results shall be displayed in a pop-up dialog box.
    * Error messages shall be displayed in a warning dialog box.

### 2.2 Non-Functional Requirements
1.  **Usability:** The interface should be simple (Single window) and intuitive.
2.  **Performance:** The calculation should be instantaneous.
3.  **Portability:** The application must run on any machine with the Java Runtime Environment (JRE) installed.
4.  **Reliability:** The application should not crash upon entering invalid data.

### 2.3 System Requirements
* **Hardware:** Any computer capable of running Java.
* **Operating System:** Windows, macOS, or Linux.
* **Software:** Java Development Kit (JDK) 8 or higher.

---

## 3. System Design & Implementation

### 3.1 Technology Stack
* **Language:** Java
* **GUI Framework:** Swing (`javax.swing`)
* **Event Handling:** AWT (`java.awt.event`)
* **Date Logic:** Java Time API (`java.time.LocalDate`, `java.time.Period`)

### 3.2 Core Algorithm
The application uses the `java.time.Period` class to calculate the difference:
```java
LocalDate birthDate = LocalDate.parse(input);
LocalDate currentDate = LocalDate.now();
Period age = Period.between(birthDate, currentDate);
// Result: age.getYears(), age.getMonths(), age.getDays()
