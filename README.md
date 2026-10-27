# 🎬 Simple Video Player

## 📌 Project Description

**Simple Video Player** is a basic Android application developed using **Kotlin** in **Android Studio**. The application uses Android's built-in **VideoView** and **MediaController** components to play a preloaded video with essential playback controls.

The video starts automatically when the application is launched. Users can play, pause, and seek through the video using the built-in media controls.

This project demonstrates simple video playback functionality and multimedia integration in Android using Kotlin and XML layouts.

## ✨ Features

- ▶️ **Automatic Video Playback** – Starts playing the preloaded video when the application launches.
- ⏯️ **Play and Pause** – Allows users to play and pause the video.
- ⏩ **Seek Functionality** – Navigate forward or backward using the seek bar.
- 🎥 **VideoView Integration** – Uses Android's built-in VideoView for displaying and playing videos.
- 🎛️ **MediaController** – Provides basic playback controls.
- 📱 **Simple User Interface** – Uses an XML-based layout for easy interaction.
- 🔌 **Offline Playback** – Plays the bundled video without requiring an internet connection.

## 🛠️ Technologies Used

| Technology | Description |
|---|---|
| Kotlin | Application development |
| Android Studio | Development environment |
| XML | User interface design |
| VideoView | Video playback |
| MediaController | Playback controls |
| Android SDK | Android application development |
| Gradle | Build automation |

## 📂 Project Structure

The main project files are organized as follows:

```text
Simple-Video-Player/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/android/videoplayer/
│   │       │   └── MainActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   │
│   │       │   └── raw/
│   │       │       └── video.mp4
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle.kts
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

### Important Files

- **MainActivity.kt** – Initializes VideoView, configures MediaController, loads the video resource, and starts playback.
- **activity_main.xml** – Defines the application interface containing the VideoView.
- **video.mp4** – The preloaded video stored in the application's raw resources.
- **AndroidManifest.xml** – Contains application and activity configuration.
- **build.gradle.kts** – Contains the Android build configuration and dependencies.

## 🚀 Installation and Setup

### Prerequisites

- Android Studio
- Android SDK
- Android device or emulator running Android 7.0 (API 24) or higher
- Git (optional, for cloning the repository)

### Step 1: Clone the Repository

```bash
git clone https://github.com/ashivarani/Simple-Video-Player.git
```

### Step 2: Open the Project

1. Open Android Studio.
2. Select **Open**.
3. Navigate to the cloned project folder.
4. Allow Gradle synchronization to complete.

### Step 3: Run the Application

1. Connect an Android device or launch an emulator.
2. Select the device in Android Studio.
3. Click the **Run** button.
4. The application launches and starts playing the bundled video.

## 📱 How to Use

1. Launch the **Simple Video Player** application.
2. The preloaded video starts playing automatically.
3. Tap the video to access the media controls.
4. Use the **Play/Pause** button to control video playback.
5. Drag the seek bar to move forward or backward in the video.

## ⚙️ How It Works

The application uses two main Android components:

### 1. VideoView

VideoView is responsible for displaying and playing the video stored in the application's `res/raw` directory.

It loads the bundled `video.mp4` file through an Android resource URI.

### 2. MediaController

MediaController provides basic video playback controls, including:

- Play
- Pause
- Seek forward or backward

The MediaController is connected to VideoView to allow users to interact with video playback.

### 3. Automatic Playback

In `MainActivity.kt`, the application initializes VideoView, sets the video resource URI, attaches MediaController, and calls `videoView.start()` to begin playback.

## 🎯 Learning Outcomes

This project demonstrates:

- Creating a basic Android application using Kotlin.
- Designing an interface using XML layouts.
- Implementing VideoView for video playback.
- Integrating MediaController for playback controls.
- Loading a video from Android raw resources.
- Implementing automatic video playback.
- Understanding basic multimedia functionality in Android.

## 📌 Project Details

- **Project Name:** Simple Video Player
- **Application Type:** Android Video Player
- **Programming Language:** Kotlin
- **IDE:** Android Studio
- **UI Layout:** XML
- **Minimum Android Version:** Android 7.0 (API 24)
- **Version:** 1.0
- **Video Source:** Local bundled resource (`res/raw/video.mp4`)

## 🔗 GitHub Repository

https://github.com/ashivarani/Simple-Video-Player

## 📝 Conclusion

**Simple Video Player** is a lightweight Android application that demonstrates fundamental video playback functionality using Kotlin, VideoView, and MediaController.

The application provides a straightforward interface for playing a preloaded video with basic playback controls, making it a useful beginner-level project for understanding multimedia integration in Android development.
