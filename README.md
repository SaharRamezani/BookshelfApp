# BookshelfApp 📚

## Project Objective 🎯

The BookshelfApp is an Android application designed to demonstrate the process of loading data from external APIs. It utilizes a robust and scalable architecture to fetch, parse, and display book-related information, focusing on efficient data handling and a clear separation of concerns.

## Technologies Used 🛠️

The project leverages several modern Android development technologies and libraries to achieve its functionality:

*   **Kotlin**: The primary programming language for Android application development. 📱
*   **Jetpack Compose**: Android's modern toolkit for building native UI. ✨
*   **MVVM (Model-View-ViewModel) Architecture**: A widely adopted architectural pattern that separates the UI logic from the business logic, enhancing testability and maintainability. 🏗️
*   **Retrofit**: A type-safe HTTP client for Android and Java, used for making API requests to fetch book data. 🌐
*   **Gson**: A Java serialization/deserialization library to convert Java Objects into JSON and vice-versa, specifically used here with Retrofit for parsing API responses. 🔄
*   **Kotlin Coroutines**: For asynchronous programming, enabling non-blocking operations and improving UI responsiveness during network calls. ⚡
*   **Coil**: An image loading library for Android backed by Kotlin Coroutines, used for efficiently loading and displaying images (e.g., book covers). 🖼️
*   **OkHttp**: An HTTP client that Retrofit uses for handling network requests. 📡
*   **Android Lifecycle ViewModel**: Manages UI-related data in a lifecycle-conscious way, surviving configuration changes. 🔄

To run this project, ensure you have Android Studio installed with the necessary SDK components for API Level 35. 💻
