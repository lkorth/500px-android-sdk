500px-android-sdk
=================

Installation
------------

1. Clone the repository into your app's directory
    ```bash
    git clone https://github.com/500px/500px-android-sdk.git
    ```

2. Add it as a dependency in your `build.gradle`
    ```groovy
    dependencies {
        compile project(':500px-android-sdk')
    }
    ```

3. Include module in top level `settings.gradle`
    ```groovy
    include ':500px-android-sdk'
    ```

Usage
-----
Here is a [login activity](https://gist.github.com/3625085) sample.

Examples
--------
[TroubledPixels](https://github.com/arthurnn/TroubledPixels)
