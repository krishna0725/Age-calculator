# Age Calculator (Java)

A simple and interactive **Age Calculator** built in Java.
The program takes a user's **date of birth (YYYY-MM-DD)** and calculates their **exact age in years, months, and days** using Java’s modern `java.time` API.

---

## 🚀 Features

* Accepts date of birth in `YYYY-MM-DD` format
* Validates user input and handles invalid dates
* Uses `LocalDate` and `Period` to calculate accurate age
* Provides output in a clean, user-friendly format
* Simple to compile and run

---

## 📌 How It Works

The program:

1. Prompts the user to enter their date of birth
2. Converts the input into a `LocalDate`
3. Calculates the age difference between the entered date and the current date
4. Displays the age in:

   * Years
   * Months
   * Days

---

## 🧩 Code Overview

Main components used:

* `LocalDate` – to represent dates
* `Period` – to calculate difference between two dates
* `DateTimeParseException` – to handle invalid input
* `Scanner` – for getting user input

The core logic:

```
LocalDate dob = LocalDate.parse(dobString);
LocalDate today = LocalDate.now();
Period age = Period.between(dob, today);
```

---

## ▶️ How to Run

### **1. Compile**

```bash
javac age_calci.java
```

### **2. Run**

```bash
java age_calci
```

---

## 📂 Project Structure

```
├── age_calci.java
└── README.md
```

---

## 🛠 Requirements

* Java 8 or above
* Terminal or IDE (VS Code, IntelliJ, Eclipse, etc.)

---

## 🤝 Contributing

Feel free to fork the repository and submit pull requests.
Suggestions and improvements are welcome!

---

## 🌟 Author

**Krishna Bhanushali**

If you want, I can also:
✔ Format this for GitHub with badges
✔ Add screenshots / sample output
✔ Generate a project description for your repo

Just tell me!

```​:contentReference[oaicite:0]{index=0}​
```
