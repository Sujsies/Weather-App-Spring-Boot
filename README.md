# 🌤️ Weather Forecast Application

A robust full-stack weather application built using **Java Spring Boot**. This app allows users to interact with a dynamic map to retrieve real-time weather data and a 5-day forecast for any specific coordinate on the globe.

## 🚀 Features

* **Interactive Map:** Integrated **Leaflet.js** for a visual, clickable map interface.
* **Real-Time Data:** Fetches current temperature, humidity, and weather conditions.
* **5-Day Forecast:** Displays weather predictions for the upcoming days.
* **REST API Integration:** Backend communicates securely with **OpenWeatherMap API**.
* **Dynamic UI:** Uses **Thymeleaf** templates to render data server-side.

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot (Web, Thymeleaf, Lombok)
* **Frontend:** HTML5, CSS3, JavaScript
* **Map Service:** Leaflet.js (OpenStreetMap)
* **Data Source:** OpenWeatherMap API
* **Build Tool:** Maven

## ⚙️ Prerequisites

Before running the application, ensure you have the following installed:
* Java Development Kit (JDK) 17 or higher
* Maven

## 🔧 Installation & Setup

1.  **Clone the repository**
    ```bash
    git clone [https://github.com/Sujsies/Weather-App-Spring-Boot/tree/main](https://github.com/Sujsies/Weather-App-Spring-Boot/tree/main.git)
    cd Weather-App-Spring-Boot
    ```

2.  **Get an API Key**
    * Sign up at [OpenWeatherMap](https://openweathermap.org/) and generate a free API Key.

3.  **Configure the Application**
    * Open `src/main/resources/application.properties`.
    * Add your API key:
        ```properties
        spring.application.name=WeatherApp
        server.port=8081
        weather.api.key=YOUR_ACTUAL_API_KEY_HERE
        ```

4.  **Run the Application**
    * Open a terminal in the project root and run:
        ```bash
        ./mvnw spring-boot:run
        ```
    * *Note: On Windows PowerShell, use `.\mvnw spring-boot:run`*

5.  **Access the App**
    * Open your browser and navigate to: `http://localhost:8081`

## 📸 Screenshots

*(You can upload screenshots of your map here to show off your project!)*

## 🤝 Contributing

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature-branch`).
3.  Commit your changes (`git commit -m 'Add some feature'`).
4.  Push to the branch (`git push origin feature-branch`).
5.  Open a Pull Request.

## 📄 License

This project is open-source and available for educational purposes.
