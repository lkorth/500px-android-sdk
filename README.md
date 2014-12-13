500px-android-sdk
=================


Installation
------------

- clone the repository into your app's directory
    ```bash
    git clone https://github.com/500px/500px-android-sdk.git
    ```

- add it as a dependency in your `build.gradle`
    ```groovy
    dependencies {
        compile project(':500px-android-sdk')
    }
    ```

- include module in top level `settings.gradle`
    ```groovy
    include ':500px-android-sdk'
    ```

Usage
-----
Here is an [login activity](https://gist.github.com/3625085) sample.

Examples
--------
[TroubledPixels](https://github.com/arthurnn/TroubledPixels)
