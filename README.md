# NEON RUSH — Android Game

This repository contains the playable HTML5 Neon Rush game and a lightweight Android WebView wrapper.

## Build APK automatically
1. Open the **Actions** tab in this repository.
2. Choose **Build Neon Rush Android APK**.
3. Click **Run workflow** and confirm.
4. Wait for the run to finish successfully.
5. Open the completed run and download the artifact named **Neon-Rush-Android-APK**.
6. Extract the artifact ZIP to find `app-debug.apk`, then transfer it to your Android phone and install it. Android may ask you to allow installs from your file manager/browser.

The workflow also runs on pushes to `main`.

## Game controls
Tap the screen to jump. On desktop use Space or Arrow Up. Three levels are included.

## Build details
- Application ID: `com.neonrush.game`
- Minimum Android: Android 6.0 (API 23)
- The workflow creates a debug APK for testing, not a Play Store release-signed build.
